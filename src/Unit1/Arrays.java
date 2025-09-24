package Unit1;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+" "+ arr[i]);
        }

    }
}
