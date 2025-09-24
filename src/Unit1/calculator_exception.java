package Unit1;

import java.util.Scanner;
public class calculator_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z=0 ;
        System.out.println("Enter two numbers");

        try {
            x = sc.nextInt();
            y= sc.nextInt();

            z = x/y;
            System.out.println("Exception not occur");
        }


        catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Goli");
            //System.out.println(z);
        }
        catch(Exception e){

            System.out.println(e.getMessage());
            System.out.println("Exception aya bam");

        }
        finally{
            System.out.println(z);
            //System.out.println(x);
        }


    }


}
