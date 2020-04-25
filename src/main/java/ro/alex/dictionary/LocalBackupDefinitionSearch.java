package ro.alex.dictionary;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LocalBackupDefinitionSearch implements DefinitionSearch {

    public static LocalBackupDefinitionSearch newInstance() {
        return new LocalBackupDefinitionSearch();
    }

    @Override
    public List<String> getDefinition(String word) {

        String content;
        try {
            content = Files.readString(Paths.get("rfp_dictionary/src/main/resources/BackupLocalDefinitions.json", String.valueOf(StandardCharsets.UTF_8)));

        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }

        String sub1 = content.substring(content.indexOf("word\": \"" + word) + 4);
        String sub2 = sub1.substring(0, sub1.indexOf("word\": \""));

        return extractDefinitions(sub2);
    }
}
