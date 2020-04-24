package ro.alex.util;

public enum Language {

    ENGLISH("en"), SPANISH("es");

    private String language;

    Language(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return language;
    }

}
