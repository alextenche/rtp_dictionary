package ro.alex.dictionary;

import ro.alex.search.DefinitionSearch;
import ro.alex.search.LocalBackupDefinitionSearch;
import ro.alex.search.WebServiceDefinitionSearch;

import java.util.List;

public class GeneralDictionary implements Dictionary {

    private static final GeneralDictionary ENG = new GeneralDictionary(LocalBackupDefinitionSearch.newInstance());

    private DefinitionSearch search;

    public GeneralDictionary() {
        search = new WebServiceDefinitionSearch();
    }

    public GeneralDictionary(DefinitionSearch search) {
        this.search = search;
    }



    public List<String> getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
