package ua.mega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.dao.CustomerDao;
import ua.mega.model.Customer;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao dao;

    @Override
    public List<Customer> getAllCustomers() {
        return dao.getAll();
    }

}
