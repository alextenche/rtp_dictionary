package ro.alex.dictionary;

import org.junit.jupiter.api.Test;
import ro.alex.search.DefinitionSearch;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {

    @Test
    public void dictTest() {
        GeneralDictionary dictionary = new GeneralDictionary();
        List<String> definitions = dictionary.getDefinitions("hello");
        assertEquals(definitions.size(), 3);
    }

    public void mockedTest() {
        GeneralDictionary dictionary2 = new GeneralDictionary(new DummyService());

    }


    private class DummyService implements DefinitionSearch {

        @Override
        public List<String> getDefinition(String word) {
            return null;
        }
    }
}
