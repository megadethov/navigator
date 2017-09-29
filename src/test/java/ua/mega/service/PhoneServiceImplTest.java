package ua.mega.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;
import ua.mega.util.DbPopulator;

@ContextConfiguration({"classpath:spring/spring-app.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class PhoneServiceImplTest {

    @Autowired
    private PhoneService phoneService;

    @Autowired
    private DbPopulator dbPopulator;

    @Before
    public void setUp() throws Exception {
        dbPopulator.execute();
    }

    @Test
    public void createNewPhone() throws Exception {
        phoneService.createNewPhone(new Phone("066-666-66-66", PhoneType.HOME, "comment-6"));
    }

    @Test
    public void getPhone() throws Exception {
        phoneService.getPhone(10001);
    }

    @Test
    public void getAllPhones() throws Exception {
        phoneService.getAllPhones();
    }

    @Test
    public void deletePhone() throws Exception {
        phoneService.deletePhone(10002);
    }

    @Test
    public void updatePhone() throws Exception {
        Phone phone = phoneService.getPhone(10001);
        phone.setPhoneType(PhoneType.UNDEFINED);

        phoneService.updatePhone(phone);
    }
}