class complexA
{
    private double real, img;

    public complexA() {
        real = 0;
        img = 0;
    }

    public complexA(double r, double i)
    {
        real = r;
        img = i;
    }

    public void add(complexA x, complexA y)
    {
        real = x.real + y.real;
        img = x.img + y.img;
        System.out.println("Additions of to complex number is  " + real + " + " + img + " i");
    }

    public void subtraction(complexA x, complexA y)
    {
        real = x.real - y.real;
        img = x.img - y.img;
        System.out.println("Subtraction of to complex number is  " + real + " + " + img + " i");
    }

    public void multiplication(complexA x, complexA y)
    {
        real = (x.real * y.real) - (x.img * y.img);
        img = (x.real * y.img) + (x.img * y.real);
        System.out.println("Multiplication of two complex number is " + real + " + " + img + " i");
    }

    public void division(complexA x, complexA y)
    {
        real = ((x.real * y.real) + (x.img * y.img)) / ((y.real * y.real) + (y.img * y.img));
        img = ((x.img * y.real) - (x.real * y.img)) / ((y.real * y.real) + (y.img * y.img));
        System.out.println("Division of two complex number is " + real + " + " + img + " i");
    }
}