package homework5;
import java.util.Scanner;
public class MyComplexApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scan.nextDouble();
        double imag1 = scan.nextDouble();
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scan.nextDouble();
        double imag2 = scan.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println();
        System.out.println("Number 1 is: " + complex1.toString());
        if (complex1.isImaginary()) {
            System.out.println(complex1.toString() + " is a pure real number");
        }
        else {
            System.out.println(complex1.toString() + " is not a pure real number");
        }

        if (complex1.isReal()) {
            System.out.println(complex1.toString() + " is a pure imaginary number");
        }
        else {
            System.out.println(complex1.toString() + " is not a pure imaginary number");
        }

        System.out.println();
        System.out.println("Number 2 is: " + complex2.toString());
        if (complex2.isImaginary()) {
            System.out.println(complex2.toString() + " is a pure real number");
        }
        else {
            System.out.println(complex2.toString() + " is not a pure real number");
        }

        if (complex2.isReal()) {
            System.out.println(complex2.toString() + " is a pure imaginary number");
        }
        else {
            System.out.println(complex2.toString() + " is not a pure imaginary number");
        }

        System.out.println();
        if (complex1.equals(complex2)){
            System.out.println(complex1.toString() + " is equal to " + complex2.toString());
        }
        else{
            System.out.println(complex1.toString() + " is not equal to " + complex2.toString());
        }

        System.out.println();
        System.out.println(complex2.argument());


        System.out.println();
        MyComplex complex3 = complex1.add(complex2);
        System.out.println(complex1.toString() + " + " + complex2.toString() + " = " + complex3.toString());


        MyComplex complex4 = complex1.subtract(complex2);
        System.out.println(complex1.toString() + " - " + complex2.toString() + " = " + complex4.toString());

        MyComplex complex5 = complex1.multiply(complex2);
        System.out.println(complex1.toString() + " * " + complex2.toString() + " = " + complex5.toString());

        MyComplex complex6 = complex1.divide(complex2);
        System.out.println(complex1.toString() + " / " + complex2.toString() + " = " + complex6.toString());

        MyComplex complex7 = complex2.conjugate();
        System.out.println(complex7.toString());

    }
}
