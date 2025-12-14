class Subtract {


    void subtract(int a, int b)
    {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction of two double values: " + (a - b));
    }

    public static void main(String[] args) {

        Subtract obj = new Subtract();

        obj.subtract(20, 10);
        obj.subtract(30, 10, 5);
        obj.subtract(15.5, 5.2);
    }
}

