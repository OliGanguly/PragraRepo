public interface Animal {
    void sleep();
}
class  TestMain{
    public static void main(String[] args) {
       Animal animal =  ()-> System.out.println("Animal Sleeping ...") ;
       callAnimal(()-> System.out.println("Animal Sleeping ..."));
    }
    public static void callAnimal(Animal animal){
//        System.out.println(animal.sleep());
        System.out.println("Hello from animal");
    }
}
