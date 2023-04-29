import java.util.Scanner;
class Complex {
    int real, imaginary;
    Complex() {
   real = 0;
        imaginary = 0;
    }

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public Complex Mul_Complex(Complex c1, Complex c2) {
        int real_part = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int imaginary_part = c1.real * c2.imaginary + c1.imaginary * c2.real;
        Complex result = new Complex(real_part, imaginary_part);
        return result;

    }

    public void Display() {
        System.out.println(real + "+" + imaginary + "i");

    }

}

public class Test_Complex {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);      
        int c1_real = z.nextInt();
        int c1_imaginary = z.nextInt();

       

        int c2_real = z.nextInt();

        int c2_imaginary = z.nextInt();

        Complex c1 = new Complex(c1_real, c1_imaginary);

        Complex c2 = new Complex(c2_real, c2_imaginary);

        Complex result = c1.Mul_Complex(c1, c2);

        result.Display();

    }

}
