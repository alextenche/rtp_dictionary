package ro.alex.dictionary;

public enum Language {

    ENGLISH("en"), SPANISH("es");

    private final String language;

    Language(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return language;
    }

}
