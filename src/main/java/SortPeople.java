import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

public class SortPeople {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90),
                new Person("Hans", "John", 30, 1.89),
                new Person("Iben", "Jensen", 12, 1.92)
        };

        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("Sorteret efter alder");
        Arrays.sort(people);
        for (Person person : people){
            System.out.println(person);
        }

        System.out.println("Sorteret efter efternavn");
        Arrays.sort(people, new NameComparator());
        for (Person person : people) {
            System.out.println(person);
        }


        // skriv kode herunder

    }


}
