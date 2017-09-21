package ua.mega;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.model.Customer;
import ua.mega.service.CustomerService;
import ua.mega.service.PhoneService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring/spring-app.xml");

        CustomerService customerService = container.getBean(CustomerService.class);
        PhoneService phoneService = container.getBean(PhoneService.class);

        Customer customer = customerService.getCustomer(1);
        List<Customer> allCustomers = customerService.getAllCustomers();

        phoneService.getAllPhones();

        container.close();
    }
}
