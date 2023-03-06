public class Multiplicador {

    private double a;
    private double b;

    public Multiplicador() {

        a= 0;
        b= 0;
    }

    public double multiplicar(double a,double b) {

        double res = a * b;

        return res;
    }

    public static void main(String[] args) {

        Multiplicador m = new Multiplicador();
        System.out.println(m.multiplicar(4,5));

    }

}
