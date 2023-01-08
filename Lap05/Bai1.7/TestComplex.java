package homework5;
public class TestComplex
{
    public static void main(String[] args)
    {
        MyComplex complex1 = new MyComplex();
        MyComplex complex2 = new MyComplex(1.1, 2.2);
        System.out.println(complex1);
        System.out.println(complex2);
        if (complex2.isReal()){
            System.out.println("Is a imaginary");
        }
        else if (complex2.isImaginary()){
            System.out.println("Is a real");
        }
        System.out.println(complex2.magnitude());
        MyComplex complex3 = complex1.add(complex2);
        System.out.println(complex3.toString());
    }
}
