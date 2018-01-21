package service;

import model.Person;

import java.io.Serializable;

public interface IUserservice {
    public void show();

    //保存用户
    Serializable save(Person person);
}
