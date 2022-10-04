package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

     public  class StaticServiceTest {

        @Test
        void findMax() {
            StaticService service = new StaticService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
         void findMaxNegative() {
            StaticService service = new StaticService();

            long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, - 11, -12};
            long expected = -3;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
         void findMaxNegativeWithZero() {
            StaticService service = new StaticService();

            long[] incomesInBillions = {0, -17, -8, -3, 0, -12, 0, 6, -11, 68, -18, -23};
            long expected = 68;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
         void findMaxNegativeLong() {
            StaticService service = new StaticService();

            long[] incomesInBillions = { -1, 10_000_000, 28_500, -30, 21_200, 10_000_001, -6, -12};
            long expected = 10_000_001;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
}
