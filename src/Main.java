import java.util.*;

public class Main implements LoveAnimal {

    Map< User, List<Animal> > list = new HashMap<>();

    public static void main(String[] args)
    {
        User u1 = new User("Fred", "Sobotni", 34);
        User u2 = new User("Adam", "Tłuszczykiewicz", 23);
        User u3 = new User("Dorota", "Bourbon", 27);

        Animal dog = new Dog("Roxy", 4);
        Animal cat = new Cat("Fizzy", 5);
        Animal dog2 = new Dog("Ruda", 2);

        Main main = new Main();
        main.addAnimal(u1, dog);
        main.addAnimal(u2, cat);
        main.addAnimal(u3, dog2);

        main.getAnimalNames(u1);
        main.getAnimalNames(u2);
        main.getAnimalNames(u3);
    }


    @Override
    public void addAnimal(User u, Animal a) {

        List<Animal> temp = list.get(u);

        if(temp == null) {
            temp = new ArrayList<>();
            list.put(u, temp);
        }
        temp.add(a);
    }

    public List<String> getAnimalNames(User u) {

        List<String> ListOfNames = new ArrayList<>();

        System.out.println(u.getName() + " has : ");

        for(Animal a : list.get(u)) {
            System.out.println(a.getName());
            ListOfNames.add(a.getName());
        }
        System.out.println();
        return ListOfNames;
    }


}
