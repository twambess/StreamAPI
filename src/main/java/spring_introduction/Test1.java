package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat=context.getBean("catBean",Pet.class);
        cat.say();
//        Person person=context.getBean("person",Person.class);
//        person.callYourPet();
    }
}
