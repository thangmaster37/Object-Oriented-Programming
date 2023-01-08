package com.oop.collections.polynomials;

public class ArrayPoly extends AbstractPoly
{
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients){
        this.coefficients = coefficients;
    }

    public int degree() {
        return coefficients.length - 1;
    }

    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    public double coefficient(int degree) {
        return coefficients[degree];
    }

    public double[] coefficients() {
        return coefficients;
    }
}
