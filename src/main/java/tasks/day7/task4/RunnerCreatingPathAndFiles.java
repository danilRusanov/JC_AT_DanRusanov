package main.java.tasks.day7.task4;

import javax.crypto.spec.PSource;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunnerCreatingPathAndFiles {

    public static void main(String[] args) throws IOException {

        System.out.println("TICKET: Создать цепочку из 4-х вложенных папок, в самой глубокой создать 2 произвольных текстовых файла, заполнить их 10 произвольными целыми числами.");

        Path path = Paths.get("/Users/daniilrusanov/dev/JC_AT_DanRusanov/src/main/java/tasks/day7/task4/dir1/dir2/dir3/dir4/");
        Files.createDirectories(path);
        String path1 = path.normalize().toString().concat(path.normalize().getRoot().toString());
        File newFile1 = new File(path1+"1.txt");
        File newFile2 = new File(path1+"2.txt");


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile1));

        bufferedWriter.write("1234567891");
        bufferedWriter.close();

        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(newFile2));
        for (int i = 0; i < 10 ; i++) {
            String str = String.valueOf(((int) (1 + (Math.random() * 10)) + " "));
            bufferedWriter2.write(str);
        }

        bufferedWriter2.close();


        System.out.println("finish");
    }

}
