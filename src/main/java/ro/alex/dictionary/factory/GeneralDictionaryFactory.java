package ro.alex.dictionary.factory;

import ro.alex.dictionary.Dictionary;
import ro.alex.dictionary.GeneralDictionary;
import ro.alex.dictionary.Language;

import static ro.alex.search.WebServiceDefinitionSearch.newForeignLanguageInstance;

public class GeneralDictionaryFactory extends DictionaryFactory {

    @Override
    protected Dictionary create(Language language) {
        return new GeneralDictionary(newForeignLanguageInstance(language));
    }
}
