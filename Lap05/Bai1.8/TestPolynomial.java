package homework5;

public class TestPolynomial
{
    public static void main(String[] args)
    {
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial polynomial = new MyPolynomial(coeffs);
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println(polynomial1.toString());
        System.out.println(polynomial2.toString());

        System.out.println(polynomial1.evaluate(2));
        MyPolynomial polynomial3 = polynomial1.add(polynomial2);
        System.out.println(polynomial3.toString());
        MyPolynomial polynomial4 = polynomial1.multiply(polynomial2);
        System.out.println(polynomial4.toString());

    }
}
