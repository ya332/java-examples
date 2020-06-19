public class CallingMethodsInSameClass {
    public static void main(String[] args){
            printOne();
            printTwo();
            printThree();
        }
    public static void printOne(){
        System.out.println("printOne called!");
    }
    public static void printTwo(){
        System.out.println("printTwo called!");
    }
    public static void printThree(){
        printOne();
        printTwo();
    }
}
