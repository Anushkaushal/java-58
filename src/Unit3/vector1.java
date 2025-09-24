package Unit3;

import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector<String> vt = new Vector<>(12,20);
        vt.add("First");
        vt.add("Second");
        vt.add("First");
        vt.add("Second");
        vt.add("First");
        //vt.add("Second");
        vt.add(4,"fourth");
        System.out.println(vt.capacity());
        System.out.println(vt.size());
        vt.remove(0);
        System.out.println(vt);
    }
}
