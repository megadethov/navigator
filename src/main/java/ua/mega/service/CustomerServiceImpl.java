package ua.mega.service;

import ua.mega.dao.CustomerDao;
import ua.mega.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao dao;

    public CustomerDao getDao() {
        return dao;
    }

    public void setDao(CustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void createNewCustomer(Customer customer) {
        dao.create(customer);
    }

    @Override
    public Customer getCustomer(int id) {
       return dao.get(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return dao.getAll();
    }

    @Override
    public void deleteCustomer(int id) {
        dao.delete(id);
    }
}
