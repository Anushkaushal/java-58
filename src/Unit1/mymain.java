package Unit1;

public class mymain {

    static{
        System.out.println("I am static");
    }


    public static void main(String[] args) {

        // class k nam -->
        //Student st = new Student(50,"Anushka");
        employee e1 = new employee("anu",10);
        e1.display();

//        st.roll=50; // calling instance variable
//        st.name = "Anushka";
employee.empinfo();
        //st.display();
        //System.out.println("Hello Google");
        // class is a blue print by which object is created
        Myinterface s2 = new Myinterface();
        System.out.println("hey");
        s2.show();
    }
}
// encalpsulation(wrapping data--> pub,pri,protec

// abstraction --> hiding needed things

// multiple inheritance--nhi karta
