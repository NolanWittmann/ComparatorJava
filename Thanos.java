import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> Heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
Hero thor = new Hero("Thor", 1500);

        Heroes.add(new Hero("Black Widow", 34));
        Heroes.add(new Hero("Captain America", 100));
        Heroes.add(new Hero("Vision", 3));
        Heroes.add(new Hero("Iron Man", 48));
        Heroes.add(new Hero("Scarlet Witch", 29));
        Heroes.add(thor);
        Heroes.add(new Hero("Hulk", 49));
        Heroes.add(new Hero("Doctor Strange", 42));
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(Heroes);
        // TODO 5 : Keep only the half of the list
        for (int i = 0; i < Heroes.size() - 1; i++) {
            if (Heroes.get(i) != Heroes.get(i + 1)) {
                Heroes.remove(Heroes.get(i));
            }
            System.out.println(Heroes.get(i).getName());
        }
        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)


        Collections.sort(Heroes, new NameComparator());
        System.out.println(" ");
        System.out.println("Order by Name");
        System.out.println(" ");
        for(Hero character : Heroes) {
            System.out.println(character.getName() + " Par ordre alphabétique");
        }
        // TODO 2: Add a Comparator and sort by age (descending)

Collections.sort(Heroes, new AgeComparator());
        System.out.println(" ");
        System.out.println("Order by Age");
        System.out.println(" ");
        for (Hero character : Heroes){
            System.out.println(character.getName() + " à " + character.getAge() + " ans ");
        }

    }


    }

