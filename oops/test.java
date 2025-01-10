class First{
    First(){
        System.out.println("First: Default constructor");
    }
    First(String name){
        System.out.println("Hello "+name+" This is First Parameterised Constructor");
    }
}
class Second extends First{
Second(){

    super("Ritik");
    System.out.println("Second: Default Constructor");
        super("Ritik");
    }
}
class test {
    public static void main(String args[]){
        Second obj = new Second();
    }
}