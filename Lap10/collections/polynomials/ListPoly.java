package com.oop.collections.polynomials;
import java.util.ArrayList;
import java.util.List;
public class ListPoly extends AbstractPoly
{
    List<Double> coefficients;
    public ListPoly(double[] coeffs){
        coefficients = new ArrayList<>();
        for (int i = 0; i < coeffs.length; i++) {
            coefficients.add(coeffs[i]);
        }
    }

    public int degree() {
        return coefficients.size()-1;
    }

    public Poly derivative() {
        return new ListPoly(derive());
    }

    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    public double[] coefficients() {
        double[] coeffs  = new double[coefficients.size()];
        for (int i=0; i<coefficients.size(); i++){
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }
}
