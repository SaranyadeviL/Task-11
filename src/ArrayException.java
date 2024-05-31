public class ArrayException {

        public static void main(String[] args) {
            int[] num = {1,2,3,4,5};

            //ArrayIndexOutOfBoundExceptions
            try{
                // Accessing an invalid index to trigger the exception
                int invalidIV = num[10]; // num[10];
                System.out.println("value at index 10: " + invalidIV);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException caught :" + e.getMessage());
            }

        }
    }

