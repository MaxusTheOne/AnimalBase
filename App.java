public class App {

    public void start() {
        Animal animal = new Animal("Horsey the horsing horse", 510);
        System.out.println(animal);

    }
    public App(){
    }

    public static void main(String[] args) {
        new App().start();
    }
}
