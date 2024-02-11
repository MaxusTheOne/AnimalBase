package animal.data;

import org.jetbrains.annotations.NotNull;

public class Animal implements Comparable<Animal> {
    private int id;
    private String name;
    private int age;
    private String type;
    private String description;
    private boolean star;
    private boolean winner;

    public Animal() {
    }

    public Animal(String name, int age, String type, String description) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.description = description;
    }

    public Animal(Animal animal){
        this.id = animal.id;
        this.name = animal.name;
        this.age = animal.age;
        this.type = animal.type;
        this.description = animal.description;
        this.star = animal.star;
        this.winner = animal.winner;
    }

    public Animal(String concatString, int age){
        String[] parts = concatString.split(" ");
        this.name = parts[0];
        this.age = age;
        int partLength = parts.length -1;
        this.type = parts[partLength];
        this.description = parts[2];
    }

    @Override
    public String toString() {
        return  " name='" + name + "'" +
                ", age=" + age +
                ", type='" + type + "'" +
                ", description='" + description + "'" +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public static void main(String[] args){


    }


    @Override
    public int compareTo(@NotNull Animal o) {
        return this.name.compareTo(o.name);
    }
}
