package homeworks.homework3;

import homeworks.homework5_annotation.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @Test
    public void getAge() {
        int age = 18;
        assertEquals(age, person.getAge());
    }

    @Test
    public void getName() {
        String name = "Ivan";
        assertEquals(name, person.getName());
    }
}