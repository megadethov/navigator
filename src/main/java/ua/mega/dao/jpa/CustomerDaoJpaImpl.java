package ua.mega.dao.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.mega.dao.CustomerDao;
import ua.mega.dao.mock.CustomerDaoMockImpl;
import ua.mega.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerDaoJpaImpl implements CustomerDao {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDaoMockImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> getAll() {
        TypedQuery<Customer> q = em.createNamedQuery("Customer.getAll", Customer.class);
        LOG.debug("Get all customers");
        return q.getResultList();
    }
}
