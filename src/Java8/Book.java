package Java8;


@FunctionalInterface
public interface Book {
    public void read(int a,int b);
}
 interface  Calculator{
    void calculate(int num1,int num2);
}

@FunctionalInterface
interface  Vehicle{
    void run(String model);
}
@FunctionalInterface
interface Furniture{
    void size(String shape);
}
@FunctionalInterface
interface Coffee{
    void size(String size,String type);
}
@FunctionalInterface
interface Nothing{
    void something();
}
//FUNCTIONAL PROGRAMMING - make fun exist outside of the class,pass a func to another func
