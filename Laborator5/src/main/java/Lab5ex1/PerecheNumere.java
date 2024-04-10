package Lab5ex1;

public class PerecheNumere {
    private int a;
    private int b;

    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public PerecheNumere() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public boolean esteFibonacci(){
        int c;
        boolean verificare = false;
        for(int i = 1;i<10;i++){
            c = a+b;
            a = b;
            b = c;
            if(c-b == a){
                System.out.println("Numerele sunt consecutive in fibonaci");
                verificare = true;
                return verificare;
            }else
                return verificare;
        }
        return verificare;
    }
    public int cmmmc(){
        int c = 0;
        int v1[] = new int[20];
        int v2[] = new int[20];
        int i;

        outerloop:
        for(i = 1;i<=10;i++){
            v1[i] = a*i;
            for (int j = 1;j<=10;j++) {
                v2[i] = b * i;
                if (v1[i] == v2[j]) {
                    c = v1[i];
                    System.out.println(c);
                    break outerloop;
                }
            }
        }
        return c;
    }
   // public int
}
