package main.java.tasks.day7.task1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnerPrintValueByDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int monthValue;
        monthValue = Integer.valueOf(bufferedReader.readLine());

        System.out.println("Input month ID: ");
        switch (monthValue) {
            case 1:
                System.out.println("February");
                break;
            case 2:
                System.out.println("March");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + monthValue);
        }

        bufferedReader.close();

    }
}
