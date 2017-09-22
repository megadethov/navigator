package ua.mega.dao.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.mega.dao.CustomerDao;
import ua.mega.dao.PhoneDao;
import ua.mega.dao.mock.CustomerDaoMockImpl;
import ua.mega.model.Customer;
import ua.mega.model.Phone;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PhoneDaoJpaImpl implements PhoneDao {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDaoMockImpl.class);

    @PersistenceContext
    private EntityManager em;


    @Override
    public void create(Phone phone) {

    }

    @Override
    public Phone get(int id) {
        return null;
    }

    @Override
    public Phone getByCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Phone> getAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
