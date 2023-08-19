package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        String[] arr = new String[10];
        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("Exception occured");

    }
}
