package main.java.tasks.day5;


import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


    String log = "access_log.2020.09.07 2.168.101.5 granted\naccess_log.2020.09.07 212.168.101.5 granted\naccess_log.2020.09.07 212.168.101.5 granted\naccess_log.2020.09.07 212.168.101.6 denied";

    Matcher matcher = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}").matcher(log);

        while(matcher.find()) {

            String ip = matcher.group();
            int grantedCount = 0;
            int deniedCount = 0;


            Matcher granted = Pattern.compile(ip + "\\sgranted").matcher(log);
            while(granted.find()) {
                grantedCount++;
            }
            Matcher denied = Pattern.compile(ip + "\\sdenied").matcher(log);
            while(denied.find()) {
                deniedCount++;
            }
            System.out.println("ip " + ip + "; ok - " + grantedCount + " failed = " + deniedCount);
        }

    }
}
