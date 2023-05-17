package complex;

public class Complex
{
    double real;

    double imag;

    /**
     *
     * @param real
     * @param imag
     * Constroi um objeto (numero complexo)
     */
    public Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }

    /**
     *
     * @param n1 complexo 1
     * @param n2 complexo 2
     * @return resultado da soma
     */
    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return temp;
    }

    /**
     *
     * @param n1 complexo 1
     * @param n2 complexo 2
     * @return resultado da subtração
     */
    public static Complex sub(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;

        return temp;
    }

    /**
     *
     * @param n1 complexo 1
     * @param n2 complexo 2
     * @return resultado da multiplicação
     */
    public static Complex mult(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = (n1.real * n2.real) - (n1.imag * n2.imag);
        temp.imag = (n1.imag * n2.real) - (n1.real * n2.imag);
        return temp;

    }

    /**
     * Override do método toString para imprimir corretamente.
     * @return string com a representaão do número complexo
     */
    @Override
    public String toString()
    {
        String aux1 = real + "";
        String aux2 = imag + "";
        String ret = aux1 + "+" + aux2 + "i";
        return ret;
    }

    /**
     * Override do método equals para comparar corretamente.
     * @param obj
     * @return true se forem iguals, false se nao forem
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj == this)
        {
            return true;
        }
        Complex c = (Complex) obj;
        return Double.compare(real, c.real) == 0 && Double.compare(imag, c.imag) == 0;
    }

    @Override
    public int hashCode()
    {
        int result = 17;
        int prime = 31;
        long realBits = Double.doubleToLongBits(real);
        long imagBits = Double.doubleToLongBits(imag);
        result = prime * result + (int) (realBits ^ (realBits >>> 32));
        result = prime * result + (int) (imagBits ^ (imagBits >>> 32));
        return result;
    }


}
