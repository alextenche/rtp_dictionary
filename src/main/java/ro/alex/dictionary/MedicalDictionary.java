package ro.alex.dictionary;

import java.util.List;

public class MedicalDictionary implements Dictionary {

    private Language language;

    public MedicalDictionary(Language language) {
        this.language = language;
    }

    @Override
    public List<String> getDefinitions(String word) {
        return List.of("medical dictionary not implemented yet");
    }
}
