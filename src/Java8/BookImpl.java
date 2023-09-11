package Java8;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book() {

            @Override
            public void read(int a,int b) {
                System.out.println("Reading ..." + a + " "+b);
            }
        };


        Book book1 = (a,b) -> System.out.println("a : " + a + " and b :"+ b);
        book.read(7,7);
        book1.read(8,8);

//        CalculatorAssignment calculator = (a, b) -> System.out.println( "Result : "+(a+b));
//        calculator.calculate(2,3);

        //callback
//        calculate((a,b) -> System.out.println( " Hello ..... Result : "+(a+b)));

        Vehicle vehicle = (str)-> System.out.println("Vechile Name : "+ str) ;
        vehicle.run("BMW");

        Furniture furniture = (shape)-> System.out.println("Shape : "+shape);
        furniture.size("Rectangular");

        Coffee coffee =(size,type)-> System.out.println("Coffee Size : " +size + " | Type : "+ type);
        coffee.size("small", "espresso");

        Nothing nothing=()-> System.out.println("Nothing.....");
    }

    //callback
//    public static void calculate(CalculatorAssignment c){
//        System.out.println("Hi : inside calculator ");
//    }
}