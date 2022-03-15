package LearnStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals=getAnimals();
        // FILTER
//        List<Animal> predator= new ArrayList<>();
//        for(Animal animal:animals){
//            if(animal.getClassification().equals(Classification.PREDATOR))
//                predator.add(animal);
//        }
//                predator.forEach(System.out::println);

        ////////////////////////////////////////
//        List<Animal> predator=animals.stream()
//                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
//                .collect(Collectors.toList());
//        predator.forEach(System.out::println);

        //SORT
//       List<Animal> sorted= animals.stream()
//                .sorted(Comparator.comparing(Animal::getAge).reversed())
//                .collect(Collectors.toList());
//          sorted.forEach(System.out::println);

        //ALL MATCH
//        boolean allMatch =animals.stream().allMatch(animal -> animal.getAge()>10);
//        System.out.println(allMatch);

        //ANY MATCH
//        boolean anyMatch = animals.stream().anyMatch(animal -> animal.getAge()>10);
//        System.out.println(anyMatch);

        //NONE MATCH
//        boolean noneMatch = animals.stream().noneMatch(animal -> animal.getName().equals("MEDVED"));
//        System.out.println(noneMatch);
        //MAX
        /////////////////////
//        List<Animal> maxAge=animals.stream().max(Comparator.comparing(Animal::getAge)).stream().collect(Collectors.toList());
//        maxAge.forEach(System.out::println);
        // ABOVE AND UNDER THE SAME EXPRESSION
//        animals.stream().max(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);

        // MIn
//        animals.stream().min(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);

        // GROUP BY
//        Map<Classification, List<Animal>> classificationListMap = animals.stream().collect(Collectors.groupingBy(Animal::getClassification));
//            //DISPLAY MAP GROUP BY
//        classificationListMap.forEach((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//            System.out.println();
        }

    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Slon", 20, Classification.HERBIVORE),
        new Animal("lion", 10, Classification.PREDATOR),
        new Animal("Giena", 11, Classification.PREDATOR),
        new Animal("Giraf", 7, Classification.HERBIVORE),
        new Animal("Gibon", 35, Classification.OMNIVOROURS),
        new Animal("Horse", 36, Classification.HERBIVORE),
        new Animal("CAt", 2, Classification.PREDATOR),
        new Animal("Dinosaur", 200, Classification.PREDATOR)
        );
    }
}
