package Unit3;

public class userdefineexception {
    public void validate(int age)throws InvalidAgeException5{
        if(age<18){
            throw new InvalidAgeException5("Not eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
}
