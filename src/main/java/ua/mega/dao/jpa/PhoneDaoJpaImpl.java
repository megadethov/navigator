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
    public Phone create(Phone phone) {
        em.persist(phone);
        LOG.debug("Create Phone {id = " + phone.getId() + "}");
        return phone;
    }

    @Override
    public Phone get(int id) {
        LOG.debug("Get Phone");
        return em.find(Phone.class, id);
    }

    @Override
    public List<Phone> getAll() {
        Query q = em.createQuery("select phone from Phone as phone");
        LOG.debug("Get All Phones");
        return q.getResultList();
    }

    @Override
    public void delete(int id) {
        Phone phoneForDelete = em.find(Phone.class, id);
        em.remove(phoneForDelete);
        LOG.debug("Phone delete");
    }

    @Override
    public void update(Phone phone) {
        em.merge(phone);
        LOG.debug("Phone update");
    }
}
