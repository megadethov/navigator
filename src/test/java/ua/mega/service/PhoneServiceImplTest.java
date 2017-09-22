package ua.mega.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;

import static org.junit.Assert.*;

@ContextConfiguration({"classpath:spring/spring-app.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class PhoneServiceImplTest {

    @Autowired
    private PhoneService service;

    @Test
    public void createNewPhone() throws Exception {
        service.createNewPhone(new Phone("066-666-66-66", PhoneType.HOME, "comment-6"));
    }

    @Test
    public void getPhone() throws Exception {
        populateDB();
        service.getPhone(1);
    }

    @Test
    public void getAllPhones() throws Exception {
        populateDB();
        service.getAllPhones();
    }

    @Test
    public void deletePhone() throws Exception {
        populateDB();
        service.deletePhone(2);
    }

    public void populateDB() {
        service.createNewPhone(new Phone("011-111-11-11", PhoneType.HOME, "comment-1"));
        service.createNewPhone(new Phone("055-555-55-55", PhoneType.HOME, "comment-5"));
        service.createNewPhone(new Phone("022-222-22-22", PhoneType.MOBILE, "comment-2"));
        service.createNewPhone(new Phone("044-444-44-44", PhoneType.HOME, "comment-4"));
        service.createNewPhone(new Phone("033-333-33-33", PhoneType.UNDEFINED, "comment-3"));
    }

}