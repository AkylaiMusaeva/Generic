package Practice2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**Person(name,age), Phone(brand, memory) деген женерик класстарды
         тузунуз. Main classta 2 return метод тузунуз.
         1.public static List>getAllPerson(); //4 person
         2.public static Queue> getAllPhone(); //4 phone
         Map ke салып person менен phone дун бардык полелерин сорттоп чыгарыныз.*/


        Person<String,Integer> person1 = new Person<>("Marlen", 18);
        Person<String,Integer> person2 = new Person<>("Tahir", 26);
        Person<String,Integer> person3 = new Person<>("Elena", 68);
        Person<String,Integer> person4 = new Person<>("Asan", 7);


        Map<String,Integer>maps=new TreeMap<>();
        maps.put(person1.getName(),person1.getAge());
        maps.put(person2.getName(),person2.getAge());
        maps.put(person3.getName(),person3.getAge());
        maps.put(person4.getName(),person4.getAge());
        getAllPeople(maps);

        ArrayList<Integer>ages=new ArrayList<>(maps.values());
        Collections.sort(ages);
        System.out.println(ages);

        ArrayList<String>names=new ArrayList<>(maps.keySet());
        Collections.sort(names);
        System.out.println(names);

    }
    public static < T,E > void getAllPeople(Map<T,E>maps) {
        System.out.println(maps);
    }

}
