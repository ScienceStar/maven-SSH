package dao;

import model.Person;

import java.io.Serializable;

public interface IPersonDao {

    //保存用户信息
    Serializable save (Person person);
}
