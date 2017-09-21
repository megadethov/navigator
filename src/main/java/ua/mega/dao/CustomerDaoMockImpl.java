package ua.mega.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoMockImpl implements CustomerDao {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDaoMockImpl.class);

    private Customer customer1 = new Customer(1, "Name-1", "Patronymic-1", "Surname-1", new Phone());
    private Customer customer2 = new Customer(2, "Name-2", "Patronymic-2", "Surname-2", new Phone());
    private Customer customer3 = new Customer(3, "Name-3", "Patronymic-3", "Surname-3", new Phone());
    private ArrayList<Customer> customers = new ArrayList<>();

    @Override
    public void create() {
        LOG.debug("Create new Customer");
    }

    @Override
    public Customer get(int id) {
        LOG.debug("Get Customer");
        return customer1;
    }

    @Override
    public List<Customer> getAll() {
        LOG.debug("Get All Customer");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        return customers;
    }

    @Override
    public void delete(int id) {
        LOG.debug("Delete Customer");
    }
}
