package Lab3ex1;

public class Parabola {
    private int a;
    private int b;
    private int c;

    public Parabola(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return String.format("f(x) = %dx^2 + %dx + %d", a, b, c);
    }

    public double[] calculeazaVarf(){
        double Varfx = -b/(2*a);
        double Varfy = -b+(4*a*c)/(4*a);
        return new double[] {Varfx,Varfx};
    }
    public double[] calculMijloc(Parabola parabola1){
        double[] varf1 = this.calculeazaVarf();
        double[] varf2 = parabola1.calculeazaVarf();
        double mijlocx = (varf1[0] + varf2[0])/2;
        double mijlocy = (varf1[1] + varf2[1])/2;
        return new double[] {mijlocx,mijlocy};
    }
    public double[] coordonateSegment(Parabola parabola){
        
    }
}
