package main.java.tasks.day7.task2;


import java.io.File;

public class RunnerPath {

    public static void main(String[] args) {

        //Вывод файлов и папок на диске
        File folder = new File("/Users/daniilrusanov/dev/JC_AT_DanRusanov/out/production/JC_AT_DanRusanov");
        for (File file: folder.listFiles()) {
            if (file.isDirectory() == true) {
                System.out.println(String.format("Directory name is %s", file.getName()));
            } else {
                System.out.println(String.format("File name is %s", file.getName()));
            }

        }
    }
}
