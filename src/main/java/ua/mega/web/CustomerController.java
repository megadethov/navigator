package ua.mega.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;
import ua.mega.service.CustomerService;
import ua.mega.service.PhoneService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value = "/viewAll", method = RequestMethod.GET)
    public String viewAllCustomers(Model model) {
        List<Customer> allCustomers = customerService.getAllCustomers();
        model.addAttribute("allCustomers", allCustomers);
        return "view-all-customers";
    }

    @RequestMapping(value = "/updateAgax", method = RequestMethod.GET)
    public @ResponseBody String updateAjax(@RequestParam String new_val, @RequestParam int id, @RequestParam String field) {
        Phone phone = phoneService.getPhone(id);
        switch (field) {
            case "number":
                phone.setNumber(new_val);
                break;
            case "phoneType":
                phone.setPhoneType(Enum.valueOf(PhoneType.class, new_val));
                break;
            case "description":
                phone.setDescription(new_val);
        }
        phoneService.updatePhone(phone);

        return "=== UPDATED ===";
    }




}
