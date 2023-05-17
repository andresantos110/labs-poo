package main;
import complex.Complex;

/**
 * LAB3
 *
 */

public class Main
{
    public static void main(String[] args)

    {
        Complex complex1 = new complex.Complex(7.2, 5.4);
        Complex complex2 = new complex.Complex(3.2, 2.5);

        Complex complex3 = new complex.Complex(10, 5);
        Complex complex4 = new complex.Complex(10, 5);

        complex.Complex complexAdd = Complex.add(complex1, complex2);
        complex.Complex complexSub = Complex.sub(complex1, complex2);
        complex.Complex complexMult = Complex.mult(complex1, complex2);

        System.out.println("Números introduzidos: " + complex1.toString() + ", " + complex2.toString() + ", " + complex3.toString() + ", " + complex4.toString());

        System.out.println("Resultado da soma 1 com 2: " + complexAdd.toString());

        System.out.println("Resultado da subtração 1 com 2: " + complexSub.toString());

        System.out.println("Resultado da multiplicação 1 com 2: " + complexMult.toString());

        System.out.println("Comparação 1 com 2: " + complex1.equals(complex2));

        System.out.println("Comparação 3 com 4: " + complex3.equals(complex4));
    }

}
