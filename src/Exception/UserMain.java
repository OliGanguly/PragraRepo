package Exception;

public class UserMain {
    public static void main(String[] args) throws WrongAgeInput {
        User user = new User();
        user.makePayment();
        System.out.println(user.name + " Your Age: " + user.showAge(60));

    }
}
