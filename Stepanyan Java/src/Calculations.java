public class Calculations {
    private final int a;

    private final int b;

    public Calculations(int first, int second) {
        this.a = first;
        this.b = second;
    }

    public void Comparison() {
        if (a > b)
            System.out.println(a + " > " + b);

        if (a < b)
            System.out.println(a + " < " + b);

        if (a == b)
            System.out.println(a + " = " + b);
    }

    public int add() {
        int add;
        add = a + b;
        return add;
    }

    public int sub(){
        int sub;
        sub = a - b;
        return sub;
    }

    public int prod() {
        int prod;
        prod = a * b;
        return prod;
    }

    public double div() {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("На ноль недопустимо!");
            return Double.NaN;
        }
    }

}
