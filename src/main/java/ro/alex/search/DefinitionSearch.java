package ro.alex.search;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public interface DefinitionSearch {

    List<String> getDefinition(String word);

    default List<String> extractDefinitions(String json) {

        Predicate<String> nonEmptyDefinition = line -> line.contains("definition") &&
                line.substring(line.lastIndexOf(":") + 3).trim().length() > 3;

        Function<String, String> extractDefinition = line -> line.substring(line.lastIndexOf(":") + 3, line.length() - 2);

        List<String> defs =
                stream(json.split("\\n"))
                        .filter(nonEmptyDefinition)
                        .map(extractDefinition)
                        .collect(toList());

        return defs.isEmpty() ? List.of("Nothing found") : defs;
    }

}
