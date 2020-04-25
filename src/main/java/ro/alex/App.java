package ro.alex;

import ro.alex.dictionary.*;
import ro.alex.dictionary.factory.DictionaryFactory;
import ro.alex.dictionary.factory.GeneralDictionaryFactory;


public class App {

    public static void main(String[] args) {

        Dictionary dictionary3 = SimpleDictionaryFactory.english();
        dictionary3.getDefinitions("computer").forEach(System.out::println);

        Dictionary dictionary4 = SimpleDictionaryFactory.ofType(DictionaryType.MEDICAL);
        dictionary4.getDefinitions("doctor").forEach(System.out::println);

        DictionaryFactory dictionaryFactory = new GeneralDictionaryFactory();
        dictionaryFactory.newDictionary(Language.ENGLISH).getDefinitions("coffee").forEach(System.out::println);
    }
}
