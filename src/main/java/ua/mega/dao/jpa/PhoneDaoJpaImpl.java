package ua.mega.dao.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.mega.dao.CustomerDao;
import ua.mega.dao.PhoneDao;
import ua.mega.dao.mock.CustomerDaoMockImpl;
import ua.mega.model.Customer;
import ua.mega.model.Phone;

import javax.persistence.*;
import java.util.List;

@Repository

public class PhoneDaoJpaImpl implements PhoneDao {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDaoMockImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    public Phone get(int id) {
        LOG.debug("Get Phone");
        return em.find(Phone.class, id);
    }

    @Override
    public void update(Phone phone) {
        em.merge(phone);
        LOG.debug(phone.getId() + " Phone update");
    }
}
