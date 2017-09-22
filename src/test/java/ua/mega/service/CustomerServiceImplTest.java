package ua.mega.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ContextConfiguration({"classpath:spring/spring-app.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {

    @Autowired
    private CustomerService service;

    @Test
    public void createNewCustomer() throws Exception {
        service.createNewCustomer(new Customer("Name-6", "Patronymic-6", "Surname-6"));
    }

    @Test
    public void getCustomer() throws Exception {
        service.getCustomer(1);
    }

    @Test
    public void getAllCustomers() throws Exception {
        service.getAllCustomers();
    }

    @Test
    public void deleteCustomer() throws Exception {
        service.deleteCustomer(1);
    }

}