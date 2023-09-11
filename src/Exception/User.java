package Exception;

public class User {
   String name="oli";


    public int showAge(int age) throws WrongAgeInput {
//        System.out.println(age);
        if(age < 18){
            throw new WrongAgeInput(name + " User should be  18 yeras old or more ");
        }

        return age;
    }

    public void makePayment(){
        System.out.println(name + " you heve to pay by "+PaymentEnum.CREDIT + " or " +
                PaymentEnum.DEBIT + " or " + PaymentEnum.MASTERCARD + " or " + PaymentEnum.PAYPAL + " way");
    }

}



