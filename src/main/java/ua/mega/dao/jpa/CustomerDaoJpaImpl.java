package ua.mega.dao.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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

    @Override
    public void create(Customer customer) {
        LOG.debug("Create customer");
    }

    @Override
    public Customer get(int id) {
        LOG.debug("Get customer");
        return null;
    }

    @Override
    public List<Customer> getAll() {
        LOG.debug("Get all customers");
        Query q = em.createQuery("from Customer");
        return q.getResultList();
    }

    @Override
    public void delete(int id) {
        LOG.debug("Delete customer");
    }
}
