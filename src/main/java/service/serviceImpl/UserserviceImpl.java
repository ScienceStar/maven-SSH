package service.serviceImpl;

import dao.IPersonDao;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IUserservice;

import java.io.Serializable;

@Service("userService")
public class UserserviceImpl implements IUserservice {

    //注入personDao
    @Autowired
    private IPersonDao personDao;

    public void show() {
        System.out.print("hello");
    }

    public Serializable save(Person person) {
        return personDao.save(person);
    }
}
