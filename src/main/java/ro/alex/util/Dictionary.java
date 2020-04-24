package ro.alex.util;

import java.util.List;

public class Dictionary {

    private final DefinitionSearch search;

    public Dictionary() {
        search = new WebServiceDefinitionSearch();
    }

    public Dictionary(DefinitionSearch search) {
        this.search = search;
    }

    public List<String> getDefinitions(String word) {
        return search.getDefinition(word);
    }
}
