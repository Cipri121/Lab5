package Exercitiu1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci1() {
        PerecheNumere p = new PerecheNumere();
        assertTrue(p.Fibonacci(1, 1));
    }
    @Test
    void fibonacci2() {
        PerecheNumere p = new PerecheNumere();
        assertFalse(p.Fibonacci(3, 4));
    }
    @Test
    void fibonacci3() {
        PerecheNumere p = new PerecheNumere();
        assertTrue(p.Fibonacci(13, 21));
    }
}