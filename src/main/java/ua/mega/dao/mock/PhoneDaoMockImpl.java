package ua.mega.dao.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.mega.dao.PhoneDao;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;

import java.util.ArrayList;
import java.util.List;

public class PhoneDaoMockImpl implements PhoneDao {

    private static final Logger LOG = LoggerFactory.getLogger(PhoneDaoMockImpl.class);

    private Phone phone1 = new Phone(1, "050-050-55-55", PhoneType.MOBILE, "vodafone");
    private Phone phone2 = new Phone(2, "060-66-66", PhoneType.HOME, "my");
    private Phone phone3 = new Phone(3, "093-0750-77-77", PhoneType.MOBILE, "life");
    private ArrayList<Phone> phones = new ArrayList<>();

    @Override
    public void create(Phone phone) {
        LOG.debug("Create phone");
        phones.add(phone);
    }

    @Override
    public Phone get(int id) {
        LOG.debug("Get phone");
        return phone1;
    }

    @Override
    public Phone getByCustomer(Customer customer) {
        LOG.debug("Get phone by Customer");
        return phone2;
    }

    @Override
    public List<Phone> getAll() {
        LOG.debug("Get all phones");
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        return phones;
    }

    @Override
    public void delete(int id) {
        LOG.debug("Delete phone");
    }
}
