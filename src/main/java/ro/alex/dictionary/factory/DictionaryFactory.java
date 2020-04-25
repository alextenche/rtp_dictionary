package ro.alex.dictionary.factory;

import ro.alex.dictionary.Dictionary;
import ro.alex.dictionary.Language;

public abstract class DictionaryFactory {

    public Dictionary newDictionary(Language language) {
        return create(language);
    }

    protected abstract Dictionary create(Language language);
}
