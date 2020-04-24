import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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

}
