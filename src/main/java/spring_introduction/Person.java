package spring_introduction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
    @Autowired
    private Pet pet;
    private  int age;
    private String surname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Autowired
    public Person(Pet pet) {
        this.pet=pet;
        System.out.println("Person is created");
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person:Set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hello my pet");
        pet.say();
    }
}
