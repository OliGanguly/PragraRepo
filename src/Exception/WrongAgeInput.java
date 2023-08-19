package Exception;

public class WrongAgeInput extends  Exception{
    public WrongAgeInput(String wrongAgeInput) {
        System.out.println(wrongAgeInput);
    }
}


