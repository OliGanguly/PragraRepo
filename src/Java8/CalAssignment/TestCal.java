package Java8.CalAssignment;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestCal {

    public static void main(String[] args) {
        System.out.println("Calculator...");
//        operationsAddintion((a,b)->a+b);
//        operationsSubstration((a,b)->a-b);
//        operationSubstractions((a,b)->a*b);
//        operationDevision((a,b)->a/b);

        Consumer<String> consumer = (data)-> System.out.println(data.trim().toUpperCase());
        consumer.accept("    Oli         ");
        BiConsumer<Integer , Integer> biConsumer =(num2 , num1)-> System.out.println(num1+num2);
        biConsumer.accept(67,23);
//        predicate return value boolean
        Predicate<Integer> predicate =(i)->i%2==0;
        System.out.println(predicate.test(5));
        Supplier<String> supplier =() -> "hello oli";
        System.out.println(supplier.get());

    }
    static void operationsAddintion(CalExample opp){
        System.out.println("Addition : "+opp.func(2,5));
    }
    static  void operationsSubstration(CalExample opp){
        System.out.println("Substraction : " +  opp.func(5,2));
    }
    static void operationSubstractions(CalExample opp){
        System.out.println("Substraction : " +  opp.func(5,2));
    }
    static void operationDevision(CalExample opp){
        System.out.println("Substraction : " +  opp.func(10,2));
    }

}
