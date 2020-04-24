package ro.alex.util;

import ro.alex.util.DefinitionSearch;
import ro.alex.util.HttpHelper;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class WebServiceDefinitionSearch implements DefinitionSearch {

    private static final String URI = "https://googledictionaryapi.eu-gb.mybluemix.net/?define=";
    private final HttpHelper httpHelper;

    public WebServiceDefinitionSearch() {
        this.httpHelper = new HttpHelper();
    }

    public List<String> getDefinition(String word) {
        String responseBody = httpHelper.sendGet(URI + word);

        return extractDefinitions(responseBody);
    }

    public static List<String> extractDefinitions(String json) {

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
