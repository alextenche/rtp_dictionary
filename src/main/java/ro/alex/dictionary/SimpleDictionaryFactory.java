package ro.alex.dictionary;

import static ro.alex.search.WebServiceDefinitionSearch.newForeignLanguageInstance;

public class SimpleDictionaryFactory {

    public static GeneralDictionary newDictionaryWith(Language language) {
        return new GeneralDictionary(newForeignLanguageInstance(language));
    }

    public static GeneralDictionary english() {
        return new GeneralDictionary(newForeignLanguageInstance(Language.ENGLISH));
    }

    public static GeneralDictionary spanish() {
        return new GeneralDictionary(newForeignLanguageInstance(Language.SPANISH));
    }

    public static Dictionary ofType(DictionaryType type) {
        switch (type) {
            case LEGAL:
                return new LegalDictionary(Language.ENGLISH);
            case MEDICAL:
                return new MedicalDictionary(Language.ENGLISH);
            default:
                throw new IllegalArgumentException("we currnetly don't support dictionaries of type " + type);
        }
    }

}
