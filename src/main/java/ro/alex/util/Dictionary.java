package ro.alex.util;

import java.util.List;

import static ro.alex.util.WebServiceDefinitionSearch.newForeginLanguageInstance;
import static ro.alex.util.WebServiceDefinitionSearch.newInstance;

public class Dictionary {

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
        return new Dictionary(newInstance());
    }

    public static Dictionary spanish(){
        return new Dictionary(newForeginLanguageInstance(Language.SPANISH));
    }

    public List<String> getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
