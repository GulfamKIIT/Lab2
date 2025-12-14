import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;
}

 class Studentdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input
        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            s[i].roll = sc.nextInt();

            System.out.print("Name: ");
            s[i].name = sc.next();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextFloat();
        }

        // Display
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    s[i].roll + "  " + s[i].name + "  " + s[i].cgpa
            );
        }

        // Find lowest CGPA
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);

        sc.close();
    }
}
