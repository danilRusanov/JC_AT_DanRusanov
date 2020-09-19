package main.java.tasks.day5;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringTask {

    public static void main(String[] args) {

// найти и вывести в консоль все дубликаты слов в строке текста, коллекции и потоки не использовать
        System.out.println("Day 5 ticket 1 - find duplicat in string");
        String duplicat = "one two three two one";
        String[] strArray = duplicat.split(" ");
        String result = "";

        for (int j = 0; j < strArray.length; j++) {
            int count = 0;
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].equalsIgnoreCase(strArray[j])) {
                    count++;
                    if (!result.contains(strArray[j]) && count > 1) {
                        result = result.concat(strArray[j].toString());
                        result = result.concat(" ");

                    }
                }
            }
        }
        System.out.println(result);


//найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль

        System.out.println("day5 ticket 2: print digits from string in array");

        String line = "1 asd 2sjsj 3%%% 4.. 58s124";
        String digitsLine = line.replaceAll("[^0-9]", " ");
        String[] digitsLineArray = digitsLine.split("\\D+");

        System.out.println("Elements of digits array");
        for (String s :
                digitsLineArray) {
            System.out.println(s);
        }



/*имеется текст лога в виде:

    access_log.2020.09.07 212.168.101.5 granted
    access_log.2020.09.07 212.168.101.6 denied

    написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
    ip 212.168.101.5: ok - 3, failed - 2*/


        String log = "access_log.2020.09.07 2.168.101.5 granted\naccess_log.2020.09.07 212.168.101.5 denied\naccess_log.2020.09.07 212.168.101.5 granted\naccess_log.2020.09.07 212.168.101.6 denied";

        String[] array1 = log.split("\\n");
        String[][] arrayProessed = new String[array1.length][2];


        for (int i = 0; i < array1.length; i++) {
            String[] arrTemp = array1[i].toString().split(" ");
            arrayProessed[i][0] = arrTemp[1];
            arrayProessed[i][1] = arrTemp[2];
        }
        System.out.println("Vivod massiva");
        System.out.print(Arrays.deepToString(arrayProessed));

        Object[][] result1 = new Object[arrayProessed.length][3];

        int okCount = 0;
        int failCount = 0;
        int position1 = 0;

        for (int i = 0; i < arrayProessed.length; i++) {
            for (int j = 0; j < arrayProessed.length; j++) {
                if (result1[j][0].equals(arrayProessed[i][0].toString())) {
                    if (arrayProessed[i][1].equalsIgnoreCase("granted")) {
                        okCount++;
                        result1[j][1] = Integer.toString(okCount);
                    }
                    if (arrayProessed[i][1].equalsIgnoreCase("denied")) {
                        okCount++;
                        result1[j][2] = Integer.toString(failCount);
                    }
                    position1++;
                } else {
                    result1[position1][0] = arrayProessed[i][0];
                    if (arrayProessed[i][1].equalsIgnoreCase("granted")) {
                        okCount++;
                        result1[position1][1] = Integer.toString(okCount);
                    }
                    if (arrayProessed[i][1].equalsIgnoreCase("denied")) {
                        okCount++;
                        result1[position1][2] = Integer.toString(failCount);
                    }
                }
            }
        }

        for (Object[] s : result1) {
            System.out.println(s);
        }
    }
}