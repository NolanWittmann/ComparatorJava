import java.util.Comparator;

public class AgeComparator implements Comparator <Hero>{


    @Override
    public int compare(Hero hero1, Hero hero2) {
        if (hero1.getAge() < hero2.getAge()) {
            return -1;
        } else {

        return 1;
        }
        }
    }

