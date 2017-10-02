package ua.mega.dao.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ua.mega.dao.CustomerDao;
import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDaoMockImpl implements CustomerDao {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDaoMockImpl.class);

    private Customer customer1 = new Customer("Name-1", "Patronymic-1", "Surname-1", new Phone());
    private Customer customer2 = new Customer("Name-2", "Patronymic-2", "Surname-2", new Phone());
    private Customer customer3 = new Customer("Name-3", "Patronymic-3", "Surname-3", new Phone());
    private ArrayList<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        LOG.debug("Get All Customer");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        return customers;
    }

}
