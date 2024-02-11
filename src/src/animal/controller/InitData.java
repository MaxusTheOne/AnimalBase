package animal.controller;

import animal.data.Animal;
import animal.controller.*;

public class InitData {
    private AnimalController controller;

    public void initData(){
        Animal animal = new Animal("Horsey the turtling horse", 510);
        Animal animal1 = new Animal("Turtle the horsing turtle", 100);
        Animal animal2 = new Animal("Doggo the catting dog", 200);
        Animal animal3 = new Animal("Cat the dogging cat", 300);
        Animal animal4 = new Animal("Bird the birding bird", 400);

        controller.createAnimal(animal);
        controller.createAnimal(animal1);
        controller.createAnimal(animal2);
        controller.createAnimal(animal3);
        controller.createAnimal(animal4);

    }

    public InitData(AnimalController givenController){
        controller = givenController;
    }

}
