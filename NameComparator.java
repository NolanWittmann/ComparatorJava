import java.util.Comparator;

public class NameComparator implements Comparator <Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
