package dao.daoImpl;

import dao.IPersonDao;
import model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("personDao")
public class PersonDaoImpl implements IPersonDao {

    /**
     * 使用@Autowired注解将sessionFactory注入到PersonDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;

    public Serializable save(Person person) {
        return sessionFactory.getCurrentSession().save(person);
    }
}
