package ua.mega.dao.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public Customer create(Customer customer) {
        LOG.debug("Create customer");
        em.persist(customer);
        return customer;
    }

    @Override
    public Customer get(int id) {
        LOG.debug("Get customer");
        return em.find(Customer.class, 1);
    }

    @Override
    public List<Customer> getAll() {
        LOG.debug("Get all customers");
        Query q = em.createQuery("select customer from Customer as customer");
        return q.getResultList();
    }

    @Override
    public void delete(int id) {
        LOG.debug("Delete customer");
        Customer customerForDelete = em.find(Customer.class, id);
        em.remove(customerForDelete);
    }
}
