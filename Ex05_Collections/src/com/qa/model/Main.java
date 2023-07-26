package com.qa.model;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ANIMAL CREATION
        Cat c = new Cat("Findus", 10);
        Cat c2 = new Cat("Mauzi", 8);
        Dog d = new Dog("Bruno", 2);
        Rabbit r = new Rabbit("Bucks", 2);
        Rabbit r2 = new Rabbit("Freddy", 3);

        //ARRAYLIST
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        System.out.println("\nArrayList: ");
        for (int x = 0; x < animalList.size(); x ++){
            System.out.println(animalList.get(x));
        }

        //HASHMAP
        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();

        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");

        System.out.println("\nHashMap 1: ");
        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }

        System.out.println("\nHashMap 2: ");
        for (Animal key : animalMap2.keySet()){
            System.out.println("Animal: " + key + " Character: " +
                    animalMap2.get(key));
        }

        HashSet<Animal> set = new HashSet<>();

        set.addAll(animalList);
        set.add(c);
        set.add(c2);

        Iterator<Animal> iter = set.iterator();
        System.out.println("\nHashSet: ");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\nSearching for the missing Findus: ");
        for (Animal a : animalList){
            if (a.getName().equals("Findus")){
                System.out.println(
                        "In ArrayList: " + a);
            }
        }

        System.out.println("In HashMap: " + animalMap.get("Findus"));

        System.out.println("\nCollection: ");
        
        Collections.sort(animalList);
        System.out.println("Sorted animal list");
        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }
    }
}
