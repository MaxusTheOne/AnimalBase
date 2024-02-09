public class App {

    public void start() {
        Animal animal = new Animal("Horsey the horsing horse", 5);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getType());
        System.out.println(animal.getDescription());
    }
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}
