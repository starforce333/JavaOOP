package lesson09.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        listTest(myList, 10);

    }

    public static void listTest(List<Integer> list, int num) {
        for (int i = 0; i < num; i++) {
            Random rnd = new Random();
            int tmp = rnd.nextInt(50);
            list.add(tmp);
        }
        System.out.println(list);
        list.remove(0);
        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println(list);
    }
}

//        3)  Считайте  из  файла  текст  на  английском  языке,  вычислите
//        относительную  частоту  повторения  каждой  буквы  и  выведите  на
//        экран  результат  в  порядке  убывания  относительной  частоты
//        повторения.
//        4) Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди
//        за  «двойной  колой».  Как  только  человек  выпьет  такой  колы,  он
//        раздваивается и оба становятся в конец очереди, чтобы выпить еще
//        стаканчик.    Напишите  программу,  которая  выведет  на  экран
//        состояние  очереди    в  зависимости  от  того,  сколько  стаканов  колы
//        выдал аппарат с чудесным напитком. Например, если было выдано
//        только два стакана, то очередь выглядит как:
//        [Volovitc, Kutrapalli, Penny, Sheldon, Sheldon, Leonard, Leonard]
