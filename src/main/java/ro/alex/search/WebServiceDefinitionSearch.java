package ro.alex.search;

import ro.alex.util.HttpHelper;
import ro.alex.dictionary.Language;

import java.util.List;


public class WebServiceDefinitionSearch implements DefinitionSearch {

    private static final String URI = "https://googledictionaryapi.eu-gb.mybluemix.net/?define=";
    private final HttpHelper httpHelper;
    private Language language;

    public WebServiceDefinitionSearch() {
        this.httpHelper = new HttpHelper();
    }

    public WebServiceDefinitionSearch(Language language) {
        this.httpHelper = new HttpHelper();
        this.language = language;
    }

    public WebServiceDefinitionSearch(HttpHelper httpHelper, Language language) {
        this.httpHelper = httpHelper;
        this.language = language;
    }

    public static WebServiceDefinitionSearch newInstance() {
        return new WebServiceDefinitionSearch(new HttpHelper(), Language.ENGLISH);
    }

    public static WebServiceDefinitionSearch newForeignLanguageInstance(Language language) {
        return new WebServiceDefinitionSearch(new HttpHelper(), language);
    }

    public List<String> getDefinition(String word) {
        String responseBody = httpHelper.sendGet(URI + word + "&language=" + language);

        return extractDefinitions(responseBody);
    }

}
