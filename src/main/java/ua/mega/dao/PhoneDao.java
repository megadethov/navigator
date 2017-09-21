package ua.mega.dao;

import ua.mega.model.Customer;

public interface PhoneDao {
    void create();
    Customer get();
    Customer getByCustomer();
    Customer update();
    void delete();

}
