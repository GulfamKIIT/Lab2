public class overload {

    // Method 1: subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    // Method 2: subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }

    // Method 3: subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two double values: " + (a - b));
    }

    // Main method (Driver code)
    public static void main(String[] args) {

        // Creating object of the same class
        Subtract obj = new Subtract();

        // Calling overloaded subtract methods
        obj.subtract(20, 10);
        obj.subtract(30, 10, 5);
        obj.subtract(15.5, 5.2);
    }
}

