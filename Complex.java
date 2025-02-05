public class Complex {
    private double real;
    private double imag;
    public Complex(double real, double imag) {
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

    public Complex add(Complex a) {
        return new Complex(this.real+a.getReal(), this.imag+a.getImag());

    }


    public Complex sub(Complex a) {
        return new Complex(this.real-a.getReal(), this.imag-a.getImag());
    }

}

class TestComplex {
    public static void main(String[] args) {
        Complex a = new Complex(1.33, 4.64);
        Complex b = new Complex(3.18, 2.74);
        Complex c =  a.add(b);

        System.out.println("c=a+b="+c.getReal() + " " + c.getImag());

        Complex d = c.sub(a);
        System.out.println("d=c-a="+d.getReal() + " " + d.getImag());
    }

}
