package Exercitiu1;

import java.util.function.Supplier;

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
        int c = a + b, sum = 2, n1 = 1, n2 = 1;
        while(sum <= c){
           sum = n1 + n2;
           n1 = n2;
           n2 = sum;
        }
        if(sum == c)
            return true;
        return false;
    }
}
