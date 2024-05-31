public class AgeValidate {
    public static void main(String[] args) {
        try {
            int age = getAgeFromUser();
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or higher ");
            }
            System.out.println("valid age entered :" + age);
        }
        catch (InvalidAgeException e){
            System.err.println(e.getMessage());


        }
    }
    public static int getAgeFromUser(){
        // get age from user
        return 15;
    }
}
