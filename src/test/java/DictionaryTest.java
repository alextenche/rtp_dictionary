import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ro.alex.util.DefinitionSearch;
import ro.alex.util.Dictionary;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {

    @Test
    public void dictTest() {
        Dictionary dictionary = new Dictionary();
        List<String> definitions = dictionary.getDefinitions("hello");
        assertEquals(definitions.size(), 3);
    }

    public void mockedTest() {
        Dictionary dictionary2 = new Dictionary(new DummyService());

    }


    private class DummyService implements DefinitionSearch {

        @Override
        public List<String> getDefinition(String word) {
            return null;
        }
    }
}
