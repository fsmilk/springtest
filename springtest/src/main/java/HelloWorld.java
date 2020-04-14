import com.sp.vo.Car;
import com.sp.vo.PersonList;
import com.sp.vo.PersonMap;
import com.sp.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;

public class HelloWorld {

    ApplicationContext ac = null;

    public static void main(String[] args) {
        ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ac.getBean("student",Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("spring-di.xml");
        Car car = ac.getBean("car",Car.class);
        System.out.println(car.getBrand());
    }

    @Test
    public void testConstructor(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("spring-di.xml");
        Car car = ac.getBean("car2",Car.class);
        System.out.println(car.getBrand());
    }

    @Test
    public void testRef(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("spring-di.xml");
        
    }


    @Test
    public void testReflect(){
        Class cls = Car.class;

        Constructor[] cs = cls.getDeclaredConstructors();

        for (Constructor c : cs) {
            Class[] ts = c.getParameterTypes();
            for (Class t : ts) {
                System.out.println(t.getName());
            }
            System.out.println();
        }

    }

    @Test
    public void testList(){
        ac  = new ClassPathXmlApplicationContext("spring-di.xml");
        PersonList pl = ac.getBean("personList", PersonList.class);
        System.out.println(pl.toString());
    }

    @Test
    public void testMap(){
        ac  = new ClassPathXmlApplicationContext("spring-di.xml");
        PersonMap pm = ac.getBean("personMap", PersonMap.class);
        System.out.println(pm.toString());
    }




}
