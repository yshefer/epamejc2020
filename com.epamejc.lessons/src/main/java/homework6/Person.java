package homework6;

import lombok.Getter;
import java.lang.reflect.Constructor;

@Getter
class Person {

    private String name;
    private Integer age;

    @Annotation
    Person() {
        Class<Person> personClass = Person.class;
        Constructor[] constructors = personClass.getConstructors();
        Annotation annotation = (Annotation) constructors[0].getAnnotation(Annotation.class);
        this.name = annotation.name();
        this.age = annotation.age();
    }

}