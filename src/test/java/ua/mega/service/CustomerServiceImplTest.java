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
        populateDB();
        service.getCustomer(1);
    }

    @Test
    public void getAllCustomers() throws Exception {
        populateDB();
        service.getAllCustomers();
    }

    @Test
    public void deleteCustomer() throws Exception {
        populateDB();
        service.deleteCustomer(2);
    }

    public void populateDB() {
        service.createNewCustomer(new Customer("Name-1", "Patronymic-1", "Surname-1"));
        service.createNewCustomer(new Customer("Name-5", "Patronymic-5", "Surname-5"));
        service.createNewCustomer(new Customer("Name-3", "Patronymic-3", "Surname-3"));
        service.createNewCustomer(new Customer("Name-4", "Patronymic-4", "Surname-4"));
        service.createNewCustomer(new Customer("Name-2", "Patronymic-2", "Surname-2"));
    }

}