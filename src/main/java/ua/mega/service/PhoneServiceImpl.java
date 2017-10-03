package ua.mega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.dao.PhoneDao;
import ua.mega.model.Phone;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDao dao;

    @Override
    public Phone getPhone(int id) {
        return dao.get(id);
    }

    @Override
    public void updatePhone(Phone phone) {
        dao.update(phone);
    }
}
