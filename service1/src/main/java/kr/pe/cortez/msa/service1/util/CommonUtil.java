package kr.pe.cortez.msa.service1.util;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUtil {

    /**
     * 호출 3회중 랜덤 1회 11초 지연
     */
    public static void randomlyRunLong() {
        final int BOUND = 3;
        final long MILLIS = 11000;
        randomlyRunLong(BOUND, MILLIS);
    }

    /**
     * 호출 {bound}회중 랜덤 1회 {millis}ms 지연
     */
    public static void randomlyRunLong(int bound, long millis){
        Random rand = new Random();

        int randomNum = rand.nextInt((bound - 1) + 1) + 1;

        if (randomNum==bound) sleep(millis);
    }

    private static void sleep(long millis){
        try {
            System.out.println("Delay .....");
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}