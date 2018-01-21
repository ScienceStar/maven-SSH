import model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserservice;

public class TestHibernate {
    private IUserservice userservice;

    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-hibernate.xml"});
        userservice = (IUserservice) ac.getBean("userService");
    }

    @Test
    public void testSavePerson() {
        Person p = new Person();
        p.setPersonId(14);
        p.setPersonName("Mike");
        p.setPersonAge(25);
        userservice.save(p);
    }


}
