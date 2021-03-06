package ua.mega.dao.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.mega.dao.PhoneDao;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;

import java.util.ArrayList;

@Repository
public class PhoneDaoMockImpl implements PhoneDao {

    private static final Logger LOG = LoggerFactory.getLogger(PhoneDaoMockImpl.class);

    private Phone phone1 = new Phone("050-050-55-55", PhoneType.MOBILE, "vodafone");
    private Phone phone2 = new Phone("060-66-66", PhoneType.HOME, "my");
    private Phone phone3 = new Phone("093-0750-77-77", PhoneType.MOBILE, "life");
    private ArrayList<Phone> phones = new ArrayList<>();

    @Override
    public Phone get(int id) {
        LOG.debug("Get phone");
        return phone1;
    }

    @Override
    public void update(Phone phone) {
        LOG.debug("Update phone");
    }
}
