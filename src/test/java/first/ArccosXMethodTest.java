package first;

import first.ArccosXMethod;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("First task tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ArccosXMethodTest {
    private final ArccosXMethod arccosXMethod = new ArccosXMethod();
    private final double DELTA = 0.06;
    private final double NEGATIVE_INFINITY = -9223372036854775808L;
    private final double POSITIVE_INFINITY = 9223372036854775807L;


    @ParameterizedTest(name = "Calculate arccos({0})")
    @CsvFileSource(resources = "/data.csv")
    void test(Double expectedResult, Double x) {
        System.out.printf("expectedResult = %f, x = %f, realResult = %f", expectedResult, x, arccosXMethod.arccosXCalculate(x));
        assertEquals(expectedResult, arccosXMethod.arccosXCalculate(x), DELTA);
    }

    @ParameterizedTest(name = "Calculate arccos({0}) ")
    @CsvSource(value = {"1"})
    void negativeInfinityTest(Double x) {
        System.out.printf("expectedResult = %f, x = %f, realResult = %f", NEGATIVE_INFINITY, x, arccosXMethod.arccosXCalculate(x));
        assertEquals(NEGATIVE_INFINITY, arccosXMethod.arccosXCalculate(x), DELTA);
    }

    @ParameterizedTest(name = "Calculate arccos({0}) ")
    @CsvSource(value = {"-1"})
    void positivesInfinityTest(Double x) {
        System.out.printf("expectedResult = %f, x = %f, realResult = %f", POSITIVE_INFINITY, x, arccosXMethod.arccosXCalculate(x));
        assertEquals(POSITIVE_INFINITY, arccosXMethod.arccosXCalculate(x), DELTA);
    }

    @ParameterizedTest(name = "Calculate arccos({0})")
    @CsvSource(value = {"-1.04", "1.04"})
    void beyondBorderstest( Double x) {
        System.out.printf("expectedResult = %f, x = %f, realResult = %f", 0.0, x, arccosXMethod.arccosXCalculate(x));
        assertEquals(0.0, arccosXMethod.arccosXCalculate(x), DELTA);
    }



}


