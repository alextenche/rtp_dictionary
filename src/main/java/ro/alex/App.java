package ro.alex;

import ro.alex.util.Dictionary;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        List<String> definitions = dictionary.getDefinitions("computer");
        definitions.forEach(System.out::println);

    }
}
