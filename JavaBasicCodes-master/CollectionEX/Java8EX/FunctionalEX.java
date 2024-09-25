package Java8EX;

interface Drawable0{
    public void draw();
}

public class FunctionalEX {
    public static void main(String[] args) {
        int width = 10;


        Drawable0 d= new Drawable0(){

            public void draw(){System.out.println("Drawing"+width);}
        };
        d.draw();;
    }


}
