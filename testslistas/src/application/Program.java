package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*teste em listas*/
public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Vitor");
        list.add("Keyla");
        list.add("Tel");
        list.add(2, "Marco");


        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------");
        System.out.println("Index of Vitor: " + list.indexOf("Vitor"));

        System.out.println("---------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
        System.out.println(name);
    }
}
