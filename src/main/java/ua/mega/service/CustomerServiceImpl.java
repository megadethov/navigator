package ua.mega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.dao.CustomerDao;
import ua.mega.model.Customer;

import java.util.List;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao dao;

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
