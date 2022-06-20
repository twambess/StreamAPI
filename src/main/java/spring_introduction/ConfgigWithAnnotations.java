package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfgigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext1.xml");

//        Cat myCat=context.getBean("cat",Cat.class);
 //               myCat.say();
//                Dog myDog=context.getBean("dog",Dog.class);
//                myDog.say();
            Person person=context.getBean("person",Person.class);
            person.callYourPet();

        context.close();
    }
}
