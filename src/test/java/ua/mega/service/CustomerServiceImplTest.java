package ua.mega.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.fail;

@ContextConfiguration({"classpath:spring/spring-app.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class CustomerServiceImplTest {

    @Autowired
    private CustomerService service;
    @PersistenceContext
    private EntityManager em;

    @Test
    public void createNewCustomer() throws Exception {
        service.createNewCustomer(new Customer());
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