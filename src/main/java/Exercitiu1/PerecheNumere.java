package Exercitiu1;


public class PerecheNumere {
    private int num1;
    private int num2;


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public PerecheNumere(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }
    public PerecheNumere() {
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public boolean Fibonacci(int a, int b){
        int c = a + b;
        int n1 = 1;
        int n2 = 1;
        while(n1 + n2 <= c){
           n2 += n1;
           n1 ^=n2;
           n2 = n1 ^n2;
           n1 ^=n2;
        }
        return n1 == c;
    }
}
