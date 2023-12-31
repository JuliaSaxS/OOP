
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
 public class Main {

    public static void main(String[] args) {

        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("1", 29);

        StudentGroup group2 = new StudentGroup("2", 31);

        StudentGroup group3 = new StudentGroup("3", 30);


        stream.addGroup(group1);

        stream.addGroup(group2);

        stream.addGroup(group3);
/*
 * Цикл `for` используется для вывода списка групп на консоль, 
 * а после этогосписок сортируется методом `sort` класса `Collections`, используя интерфейс`Comparable`.
 */
 
        for (StudentGroup group : stream) {

            System.out.println(group);

        }

        Collections.sort(stream.getGroups());

        for (StudentGroup group : stream) {

            System.out.println(group);

        }

    }

/*
 * После сортировки группы выводятся на консоль в отсортированном порядке.
 */
} 
