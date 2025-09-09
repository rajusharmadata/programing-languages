/*
Question 1 : Print the sum, difference and product of two complex numbers by creating a
class named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by the user.
 */
  import java.util.*;
 public class solution1 {
 
     public static void main(String[] args) {
        Complex c1 = new Complex(4, 6);
        Complex c2 = new Complex(2, 3);
         // Adding two complex numbers
        Complex cal = Complex.add(c1, c2);
        System.out.print("Sum: ");
        cal.printComplex();

     }
 }

 class Complex{
    
    int real ;
    int imag;

    public Complex(int r,int i){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real),(a.imag + b.imag));
    }
    public static Complex dif(Complex a, Complex b){
        return new Complex((a.real - b.real),(a.imag - b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex((a.real* b.real)-(a.imag * b.imag),(a.real* b.real)+(a.imag * b.imag));
    }

    public void printComplex(){
        if (real == 0 && imag != 0){
            System.out.println(imag + "i");
        }
        else if(imag ==0 && real !=0){
            System.err.println(real);
        }else{
            System.out.println(real + "+" + imag + "i");
        }
    }


    }

 
 /*
  * 
  */