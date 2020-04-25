package ro.alex.dictionary;

import java.util.List;

import static ro.alex.dictionary.WebServiceDefinitionSearch.newForeginLanguageInstance;

public class Dictionary {

    private static final Dictionary ENG = new Dictionary(newForeginLanguageInstance(Language.ENGLISH));

    private final DefinitionSearch search;

    public Dictionary() {
        search = new WebServiceDefinitionSearch();
    }

    public Dictionary(DefinitionSearch search) {
        this.search = search;
    }

    public static Dictionary withLanguage(Language language){
        return new Dictionary(newForeginLanguageInstance(language));
    }

    public static Dictionary english(){
        return ENG;
    }

    public static Dictionary spanish(){
        return new Dictionary(newForeginLanguageInstance(Language.SPANISH));
    }

    public List<String> getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
