package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
