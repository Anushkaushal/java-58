package Unit3;

public class collages4tudent extends Student4{
    public int roll_no;
    public collages4tudent(String address,int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
        public void show_roll(){
            System.out.println("roll no--> "+roll_no);
        }


}
