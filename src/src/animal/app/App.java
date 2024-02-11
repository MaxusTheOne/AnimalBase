package animal.app;

import animal.controller.*;
import animal.data.*;

import java.util.Comparator;

public class App {

    public void start() {

        AnimalController controller = new AnimalController();
        InitData data = new InitData(controller);
        data.initData();


        Animal[] animalsToPrint = controller.getAllAnimalsSorted(Comparator.comparing(Animal::getName));
        for (Animal value : animalsToPrint) {
            System.out.println(value);
        }

    }
    public App(){
    }

    public static void main(String[] args) {
        new App().start();
    }
}
