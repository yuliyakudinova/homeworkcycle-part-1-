package ru.netology.sqr;

public class SQRService {
    int count = 0;

    public int sqrCalculateSquare(int bottomBound, int upperBound) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomBound && i * i <= upperBound) {
                count = count + 1;
            }
        }
        return count;
    }
}
