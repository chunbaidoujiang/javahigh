import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA"); Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);

        System.out.println();

    }
}
