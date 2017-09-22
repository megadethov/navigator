package ua.mega.dao.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.dao.CustomerDao;
import ua.mega.dao.mock.CustomerDaoMockImpl;
import ua.mega.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomerDaoJpaImpl implements CustomerDao {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDaoMockImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void create(Customer customer) {
        LOG.debug("Create customer");
        em.persist(customer);
    }

    @Transactional
    @Override
    public Customer get(int id) {
        LOG.debug("Get customer");
        return null;
    }

    @Transactional
    @Override
    public List<Customer> getAll() {
        LOG.debug("Get all customers");
        Query q = em.createQuery("FROM Customer");
        return q.getResultList();
    }

    @Transactional
    @Override
    public void delete(int id) {
        LOG.debug("Delete customer");
    }
}
