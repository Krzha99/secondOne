import java.util.*;

public class Animal {

    private String name;

    private int age;

    public Animal (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    List<Animal> animalList = new ArrayList<>();

    public String getName() {
        return name;
    }
}
