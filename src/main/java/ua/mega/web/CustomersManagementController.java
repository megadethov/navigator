package ua.mega.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;
import ua.mega.service.CustomerService;

import java.util.List;

@Controller
public class CustomersManagementController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public ModelAndView viewAllCustomers() {
        List<Customer> allCustomers = customerService.getAllCustomers();
        return new ModelAndView("WEB-INF/jsp/view-all-customers.jsp", "allCustomers", allCustomers);
    }

    @RequestMapping("/addCustomerForm")
    public ModelAndView addNewCustomer() {
        return new ModelAndView("WEB-INF/jsp/add-new-customer.jsp");
    }

    @RequestMapping("/addNewCustomer")
    public ModelAndView addNewCustomer(String name, String patronymic, String surname, String phoneNumber, String phoneType, String description) {
        Customer newCustomer = new Customer(name, patronymic, surname, new Phone(phoneNumber, PhoneType.valueOf(phoneType), description));
        customerService.createNewCustomer(newCustomer);
        List<Customer> allCustomers = customerService.getAllCustomers();
        return new ModelAndView("WEB-INF/jsp/view-all-customers.jsp", "allCustomers", allCustomers);
    }
}
