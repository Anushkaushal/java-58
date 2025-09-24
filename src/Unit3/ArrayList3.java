package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            product.add(sc.next());
        }
        Iterator itr = product.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(product);
        product.addFirst("lichi");
        product.addLast("li");
        product.add(3,"apple");

        Collections.sort(product);
        System.out.println(product);
        System.out.println(product.getFirst());
        System.out.println(product.getLast());
        System.out.println(product.get(2));


    }}


