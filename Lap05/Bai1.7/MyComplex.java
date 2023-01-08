package homework5;
public class MyComplex
{
    private double real;
    private double imag;

    public MyComplex(){
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal(){
        return imag == 0;
    }

    public boolean isImaginary(){
        return real == 0;
    }

    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another){
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude(){
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double argument(){
        return Math.atan2(this.imag, this.real);
    }
    public MyComplex add(MyComplex right){
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right){
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right){
        return new MyComplex(this.real * right.real - this.imag * right.imag, this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right){
        double mau = right.real * right.real + right.imag * right.imag;
        double real = (this.real * right.real + this.imag * right.imag) / mau;
        double imag = (-1.0) * (this.real * right.imag - this.imag * right.real) / mau;
        return new MyComplex(real, imag);
    }

    public MyComplex conjugate(){
        return new MyComplex(this.real, (-1.0) * this.imag);
    }

}
