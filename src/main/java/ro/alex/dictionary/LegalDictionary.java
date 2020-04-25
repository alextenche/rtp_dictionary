package ro.alex.dictionary;

import java.util.List;

public class LegalDictionary implements Dictionary {

    private Language language;

    public LegalDictionary(Language language) {
        this.language = language;
    }

    @Override
    public List<String> getDefinitions(String word) {
        return List.of("legal dictionary not implemented yet");
    }
}
