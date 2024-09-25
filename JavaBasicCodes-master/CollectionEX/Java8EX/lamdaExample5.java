package Java8EX;

@FunctionalInterface
interface FunInter1{

    int operation(int a, int b);
}

public class lamdaExample5 {

    public static void main(String[] args) {
        FunInter1 add = (a, b) -> a+b;
        FunInter1 multiply = (a, b) -> a * b;

        System.out.println(add.operation(6 , 3));
        System.out.println(multiply.operation(4 , 5));


    }
}
