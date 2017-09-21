package ua.mega.service;

import ua.mega.dao.PhoneDao;
import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    private PhoneDao dao;

    public PhoneDao getDao() {
        return dao;
    }

    public void setDao(PhoneDao dao) {
        this.dao = dao;
    }

    @Override
    public void createNewPhone(Phone phone) {
        dao.create(phone);
    }

    @Override
    public Phone getPhone(int id) {
        return dao.get(id);
    }

    @Override
    public Phone getPhoneByCustomer(Customer customer) {
        return dao.getByCustomer(customer);
    }

    @Override
    public List<Phone> getAllPhones() {
        return dao.getAll();
    }

    @Override
    public void deletePhone(int id) {
        dao.delete(id);
    }
}
