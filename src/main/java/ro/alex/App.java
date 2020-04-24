package ro.alex;

import ro.alex.util.Dictionary;
import ro.alex.util.HttpHelper;
import ro.alex.util.Language;
import ro.alex.util.WebServiceDefinitionSearch;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        List<String> definitions = dictionary.getDefinitions("computer");
        definitions.forEach(System.out::println);

        Dictionary dictionary1 = new Dictionary(new WebServiceDefinitionSearch());
        List<String> definitions1 = dictionary.getDefinitions("plane");
        definitions1.forEach(System.out::println);

        Dictionary dictionary2 = new Dictionary(new WebServiceDefinitionSearch(new HttpHelper(), Language.SPANISH));
        List<String> definitions2 = dictionary.getDefinitions("hola");
        definitions2.forEach(System.out::println);

    }
}
