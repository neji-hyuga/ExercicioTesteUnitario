package com.digitalhouse.exerciciotesteunitario;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    // teste unitário, mto usado para calculos, serve em métodos curtos

    @Test
    public void calculoImcCorreto(){
        MainActivity mainActivity = new MainActivity();

        assertEquals(20F, mainActivity.calcularImc(80, 2));
    }
}