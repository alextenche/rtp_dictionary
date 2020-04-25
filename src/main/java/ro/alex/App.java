package ro.alex;

import ro.alex.dictionary.Dictionary;
import ro.alex.dictionary.HttpHelper;
import ro.alex.dictionary.Language;
import ro.alex.dictionary.WebServiceDefinitionSearch;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        List<String> definitions = dictionary.getDefinitions("computer");
        definitions.forEach(System.out::println);

        Dictionary dictionary1 = new Dictionary(new WebServiceDefinitionSearch());
        List<String> definitions1 = dictionary1.getDefinitions("plane");
        definitions1.forEach(System.out::println);

        Dictionary dictionary2 = new Dictionary(new WebServiceDefinitionSearch(new HttpHelper(), Language.SPANISH));
        List<String> definitions2 = dictionary2.getDefinitions("hola");
        definitions2.forEach(System.out::println);

        Dictionary dictionary3 = Dictionary.english();
        List<String> definitions3 = dictionary3.getDefinitions("tea");
        definitions3.forEach(System.out::println);

        Dictionary dictionary4 = Dictionary.spanish();
        List<String> definitions4 = dictionary4.getDefinitions("hola");
        definitions4.forEach(System.out::println);
    }
}
