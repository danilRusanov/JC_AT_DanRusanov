package main.java.tasks.day7.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        int monthId;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name of month:");
        String month = bufferedReader.readLine();
        switch (month) {
            case "january":
                monthId = 1;
                break;
            case "february":
                monthId = 2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        bufferedReader.close();
        System.out.printf("Month digit values is %s", monthId);
    }
}
