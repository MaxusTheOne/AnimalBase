public class App {

    public void start() {
        Animal animal = new Animal("Horsey the horsing horse", 5);
        System.out.println(animal);

    }
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}
