import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @Test
    public void test2(){
        Divisible3 d1 = new Divisible3("2");
        String resultadoReal = d1.divide();
        String resultadoEsperado = "SI";

        assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void test6(){
        Divisible3 d1 = new Divisible3("6");
        String resultadoReal = d1.divide();
        String resultadoEsperado = "SI";

        assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void test4(){
        Divisible3 d1 = new Divisible3("4");
        String resultadoReal = d1.divide();
        String resultadoEsperado = "NO";

        assertEquals(resultadoEsperado, resultadoReal);

    }
}