package ua.mega.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.mega.model.Customer;
import ua.mega.service.CustomerService;

import java.util.List;

@Controller
public class ViewAllCustomersController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public ModelAndView viewAllCustomers() {
        List<Customer> allCustomers = customerService.getAllCustomers();
        return new ModelAndView("WEB-INF/jsp/view-all-customers.jsp", "allCustomers", allCustomers);
    }
}
