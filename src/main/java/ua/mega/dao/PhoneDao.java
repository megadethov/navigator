package ua.mega.dao;

import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

public interface PhoneDao {

    Phone create(Phone phone);

    Phone get(int id);

    List<Phone> getAll();

    void delete(int id);

    void update(Phone phone);
}
