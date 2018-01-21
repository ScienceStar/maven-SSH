package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    private Integer personId;
    private String  personName;
    private Integer personAge;

    @Id
    @Column(name="personId",unique = true,nullable = false,length = 36)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Column(name="personName",nullable = false,length = 100)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Column(name="personAge",nullable = false,length = 25)
    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }

    public Person() {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
    }
}
