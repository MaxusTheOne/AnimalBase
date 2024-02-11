package animal.controller;

import animal.data.Animal;

import java.util.*;

public class AnimalController {
    public int lastId = 0;

    public HashMap<Integer, Animal> animalList = new HashMap<Integer, Animal>();

    public void start() {
        System.out.println("Hello, World!");

    }
    public AnimalController(){
    }
    public void createAnimal(Animal recievedAnimal){
        Animal animal = new Animal(recievedAnimal);
        animal.setId(lastId);
        animalList.put(lastId, animal);
        lastId++;
    }
    public Animal[] getAllAnimals() {
        List<Animal> animals = new ArrayList<>(animalList.values());
        return animals.toArray(new Animal[0]);
    }

    public Animal[] getAllAnimalsSorted(){


        var sortedList = new TreeSet<>(animalList.values());
        return sortedList.toArray(new Animal[0]);
    }

    public Animal[] getAllAnimalsSorted(Comparator<Animal> comparator){
        List<Animal> animals = new ArrayList<>(animalList.values());
        animals.sort(comparator);
        return animals.toArray(new Animal[0]);
    }

    public static void main(String[] args) {
        new AnimalController().start();
    }
}
