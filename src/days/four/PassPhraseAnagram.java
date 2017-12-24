package days.four;

import util.Constants;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PassPhraseAnagram {
    private final String passPhrase;

    PassPhraseAnagram(String passPhrase) {
        this.passPhrase = passPhrase;
    }

    public Boolean isValid() {
        String[] words = passPhrase.split(Constants.DELIMITER);

        return Arrays.stream(words)
                .map(word -> word.chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString())
                .collect(Collectors.groupingBy(s -> s))
                .values()
                .stream()
                .noneMatch((occurrences) -> occurrences.size() > 1);
    }
}
