package main.java.tasks.day9;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class RunnerStreams {
    public static void main(String[] args) {

        //для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму
        IntStream.range(1, 21)
                .filter(i -> i % 2 == 0).peek(i -> System.out.println("values in inches " + i * 2.54))
                .reduce((s1, s2) -> s1 + s2).ifPresent(System.out::println);


        //сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue. Определить, содержаться ли в данной коллекции числа,
        // которые делятся и на 3 и на 5 с помощь stream

        boolean result;
        result = IntStream.generate(() -> (int) (1 + Math.random() * 30))
                .limit(20)
                .anyMatch(x -> x % 3 == 0 || x % 5 == 0);

        System.out.println(result + " на 3 и на 5 с помощь stream");

        //создать класс Person, с полями name, surname, age.
        // Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
        // Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21,
        // выводит их имена и возраст в консоль,
        // сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator),
        // берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию

        List<Person> personList = IntStream.rangeClosed(1, 9).boxed()
                .map(integer -> new Person("Name" + integer, "surname", (int) (15 + Math.random() * 15))).collect(Collectors.toList());

        personList.stream().filter(person -> person.getAge() <= 21)
                .peek(p -> System.out.println("Name is " + p.getName() + " Age: " + p.getAge()))
                .sorted(Comparator.comparing(Person::getSurName)
                        .thenComparing(Person::getName)
                ).limit(4)
                .collect(Collectors.toList()).stream().forEach(person -> System.out.println(person.getName() + " " + person.getSurName() + " " + person.getAge()));

        //построчно прочитать файл и создать стрим из его строк,
        // пропустив первые 4 строки собрать коллекцию в отдну строку,
        // разделить на по <br>,
        // оставить только те, что начинаются с "Date log:",
        // в каждой строке оставить только первые 20 символов,
        // к каждой в конец дописать значение текущей даты

        System.out.println("Reading file by streams");

        String fileName = "/Users/daniilrusanov/dev/JC_AT_DanRusanov/src/main/java/tasks/day9/file_reader/file.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            Arrays.stream(stream.skip(4)
                    .collect(Collectors.joining())
                    .split("<br>")).forEach(System.out::println);
//                    .filter(s -> s.startsWith("Date log:"))
//                    .map(s -> s.length() > 20 ? s.substring(0, 20) : s)
//                    .map(s -> s + " " + new SimpleDateFormat("DDMMYYYY").format(Calendar.getInstance().getTime()))
//                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
