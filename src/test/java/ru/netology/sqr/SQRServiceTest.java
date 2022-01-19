package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"squares,0,300,8", "squares,100,10000,90"})
    void sqrCalculateSquare(String testName, int bottomBound, int upperBound, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCalculateSquare(bottomBound, upperBound);

        assertEquals(expected, actual);
    }
}