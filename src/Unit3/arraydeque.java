////package Unit3;
////
////import java.util.ArrayDeque;
////import java.util.Deque;
////
////public class arraydeque {
////    public static void main(String[] args) {
////        Deque<String> dq = new ArrayDeque<>();
////        dq.addFirst("zero");
////        dq.addLast("second");
////        System.out.println(dq.getLast());
////        System.out.println(dq.getFirst());
////        System.out.println(dq);
////        System.out.println(dq.removeFirst());
////        System.out.println(dq.removeLast());
////    }
////}
//
//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        int length= A.length()+B.length();
//        /* Enter your code here. Print output to STDOUT. */
//        int a = A.charAt(0)-'0';
//        int b = B.charAt(0)-'0';
//        if(a>b){
//            System.out.println("No");
//        }
//        else{
//            System.out.println("Yes");
//        }
//        String firstLetter = A.substring(0, 1).toUpperCase();
//        String sec = B.substring(0, 1).toUpperCase();
//        String remainingLetters = A.substring(1);
//        String secn= B.substring(0, 1).toUpperCase();
//
//        System.out.print(firstLetter+remainingLetters);
//        System.out.println(sec+secn);
//
//
//    }
//}
//
//
//
//
