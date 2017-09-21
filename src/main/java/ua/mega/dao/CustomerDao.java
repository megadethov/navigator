package ua.mega.dao;

import ua.mega.model.Customer;

import java.util.List;

public interface CustomerDao {
    void create();
    Customer get(int id);
    List<Customer> getAll();
    void delete(int id);

}
