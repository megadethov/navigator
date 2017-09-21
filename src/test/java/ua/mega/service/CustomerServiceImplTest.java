package ua.mega.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.fail;

@ContextConfiguration("classpath:spring/spring-app.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {

    private CustomerService service;

    @Test
    public void createNewCustomer() throws Exception {
        fail();
    }

    @Test
    public void getCustomer() throws Exception {
        fail();
    }

    @Test
    public void getAllCustomers() throws Exception {
        fail();
    }

    @Test
    public void deleteCustomer() throws Exception {
        fail();
    }

}