package ua.mega.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;
import ua.mega.util.DbPopulator;

@ContextConfiguration({"classpath:spring/spring-app.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private DbPopulator dbPopulator;

    @Before
    public void setUp() throws Exception {
        dbPopulator.execute();
    }

    @Test
    public void createNewCustomer() throws Exception {
        customerService.createNewCustomer(new Customer("Name-6", "Patronymic-6", "Surname-6"));
    }

    @Test
    public void getCustomer() throws Exception {
        customerService.getCustomer(1);
    }

    @Test
    public void getAllCustomers() throws Exception {
        customerService.getAllCustomers();
    }

    @Test
    public void deleteCustomer() throws Exception {
        customerService.deleteCustomer(2);
    }
}