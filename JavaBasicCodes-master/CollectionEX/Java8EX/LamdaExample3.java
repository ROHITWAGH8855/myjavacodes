package Java8EX;

interface Sayable{
    public String day( String name);    //  we one create day method
}

public class LamdaExample3 {
    public static void main(String[] args) {

        Sayable s1 = (name) ->{

            return "Hello, "+ name;
        };
        System.out.println(s1.day("sonoo"));

        Sayable s2= name ->{
            return "Hello"+ name;
        };
        System.out.println(s2.day("sonoo"));
    }

}
