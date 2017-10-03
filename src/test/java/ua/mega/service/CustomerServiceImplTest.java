package ua.mega.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
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
    public void getAllCustomers() throws Exception {
        customerService.getAllCustomers();
    }

}