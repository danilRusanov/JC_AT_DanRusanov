package main.java.tasks.day7.task3;

import java.io.*;
import java.util.Scanner;

public class RunnerInputFileStream {

    public static void main(String[] args) throws IOException {

        int countSigns = 0;
        int countWords = 0;

        try {
            File file = new File("/Users/daniilrusanov/dev/JC_AT_DanRusanov/src/main/java/tasks/day7/files/a.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));


            Scanner scanner = new Scanner(System.in);
            boolean isExit = false;
            String strLine;

            System.out.println("Input some strings value: ");
            while (!isExit) {
                strLine = scanner.nextLine();
                if (strLine.equalsIgnoreCase("EXIT")) {
                    isExit = strLine.equalsIgnoreCase("EXIT");
                    System.out.println("EXIT has been inputted. Console has closed");
                    break;
                }
                bw.write(strLine);
            }

            bw.write("alalalalala lalalalal asldkasldklaskdl askdl kasld");

            scanner.close();
            bw.close();


            BufferedReader outReading = new BufferedReader(new FileReader(file));

            String line;

            while ((line = outReading.readLine()) != null) {
                countWords += (line.split(" ")).length;
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '!' || line.charAt(i) == ',' || line.charAt(i) == ';' || line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == '-' || line.charAt(i) == '\'' || line.charAt(i) == '\"' || line.charAt(i) == ':') {
                        countSigns++;
                    }
                }
                System.out.println("Count of not Alphabet signs is " + countSigns);
            }
            outReading.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Count of words is " + countWords);
    }
}
