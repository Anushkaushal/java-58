package Unit3;

public class SchooolStudent extends Student{
    SchooolStudent(int roll_no,String name){

        super(roll_no,name);
    }
    public void attend_class(){
        System.out.println(name+"is attend class offline");
    }
    public void give_exam(){
        System.out.println(name+"giving exam on pen");
    }
}

