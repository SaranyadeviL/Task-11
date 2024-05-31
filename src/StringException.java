public class StringException {
    public static void main(String[] args) {

        String text = "Hello World";
        try{
            //accessing an invalid index to trigger the exception
            char invalidIndexChar = text.charAt(20);
            System.out.println("Character at index:" + invalidIndexChar);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException:" + e.getMessage());

        }
    }
}
