package ua.mega.dao;

import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

public interface PhoneDao {

    Phone get(int id);

    void update(Phone phone);
}
