import java.util.Scanner;

public class complex_ao
{
    public static void main(String[] args)
    {
        double real1, img1, real2, img2;

        Scanner input = new Scanner(System.in);

        System.out.println("First complex number");

        System.out.println("Enter real part of the complex number");

        real1 = input.nextDouble();

        System.out.println("Enter imaginary part of the complex number ");

        img1 = input.nextDouble();

        complexA obj1 = new complexA(real1, img1);

        System.out.println("Second complex number");

        System.out.println("Enter real part of the complex number");

        real2 = input.nextDouble();

        System.out.println("Enter imaginary part of the complex number ");

        img2 = input.nextDouble();

        complexA obj2 = new complexA(real2, img2);

        complexA obj3 = new complexA();

        int choice;

        System.out.println("Enter:-");

        System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");

        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                obj3.add(obj1, obj2);
                break;
            case 2:
                obj3.subtraction(obj1, obj2);
                break;
            case 3:
                obj3.multiplication(obj1, obj2);
                break;
            case 4:
                obj3.division(obj1, obj2);
                break;
            default:
                System.out.println("Please choice valid operation");
        }
    }

}