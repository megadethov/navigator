package ua.mega.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;
import ua.mega.service.CustomerService;
import ua.mega.service.PhoneService;
import ua.mega.util.AjaxUpdateMapper;

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

    @RequestMapping(value = "/updateAgax", method = RequestMethod.POST)
    public @ResponseBody String updateAjax(@RequestBody List<AjaxUpdateMapper> updates) {

        for (AjaxUpdateMapper next: updates) {
            Phone phone = phoneService.getPhone(Integer.valueOf(next.getId()));
            switch (next.getField()) {
                case "number":
                    phone.setNumber(next.getNewVal());
                    break;
                case "phoneType":
                    phone.setPhoneType(Enum.valueOf(PhoneType.class, next.getNewVal()));
                    break;
                case "description":
                    phone.setDescription(next.getNewVal());
            }
            phoneService.updatePhone(phone);
        }
        return "=== UPDATED ===";
    }
}
