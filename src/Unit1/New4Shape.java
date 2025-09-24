package Unit1;

public class New4Shape extends Shape4 {
    @Override
    public void draw(double l) {
        double area= l*l;
        System.out.println("New shape"+area);
    }
}
