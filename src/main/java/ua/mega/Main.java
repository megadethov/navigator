package ua.mega;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.model.Customer;
import ua.mega.service.CustomerService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring/spring-app.xml");

        CustomerService customerService = container.getBean(CustomerService.class);

        Customer customer = customerService.getCustomer(1);
        List<Customer> allCustomers = customerService.getAllCustomers();

        container.close();
    }
}
