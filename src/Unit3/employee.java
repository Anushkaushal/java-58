package Unit3;

public class employee {
    int emp_id;
    String emp_name;
    double emp_salary;

    public static void main(String[] args) {
        final int n;
        n= 16;

        System.out.println(n);

    }
    static String org_name = "GOOGLE";

    public static void empinfo(){
        System.out.println(org_name);
    }
    //
    public employee(String emp_name, int emp_id) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
    }

    public void display(){

        System.out.println(emp_name);
        System.out.println(emp_id);
    }




}
