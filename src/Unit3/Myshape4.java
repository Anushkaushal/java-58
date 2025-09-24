package Unit3;

public class Myshape4 {
    public static void main(String[] args) {
        Shape4 s = new New4Shape();

        // Shape4 s = new Shape4();
        // run time polymorphism--> kon s use krga shape? or newshape?
        // method obveridingn kiya h 2 class
        // overloading mein 2 class
        s.draw(15);
        s.draw(12,34);

    }
}
