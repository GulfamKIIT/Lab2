import java.util.Scanner;

 class rectangle {
    int length,breadth;
    int area,perimeter;
    void read()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length=" );
        System.out.println("enter the breadth=");

    }
    void calculate()
    {
        area=length*breadth;
        perimeter=2*(length+breadth);

    }
    void display()
    {
        System.out.println("enter the area="+area);
        System.out.println("enter the breadth="+perimeter);

    }
    public class main {
        public static void main(String[] args) {
            rectangle r = new rectangle();
            r.read();
            r.calculate();
            r.display();
        }
    }

        }

