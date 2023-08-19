package Exception;

import java.util.Scanner;

public class ExceptionTest {

        public static void main(String[] args) {
            String[] arr = new String[10];

            //try with resources
            try(Scanner sc= new Scanner(System.in)) //no need to close its automatically closed
            {
                System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
            finally {
//                sc.close()
                System.out.println("Block will execute no matter what");
            }
            System.out.println("Exception occured");

        }

}
