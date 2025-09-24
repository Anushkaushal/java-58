package Unit1;

public class MyException5 {
    public static void main(String[] args) {
        // obect banaya
        userdefineexception vdf = new userdefineexception();
        try
        {
            vdf.validate(12);
            vdf.validate(19);
        }
        catch(InvalidAgeException5 e){
            System.out.println(e.getMessage());
        }
    }
}
