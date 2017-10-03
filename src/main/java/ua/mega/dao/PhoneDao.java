package ua.mega.dao;

import ua.mega.model.Phone;

public interface PhoneDao {

    Phone get(int id);

    void update(Phone phone);
}
