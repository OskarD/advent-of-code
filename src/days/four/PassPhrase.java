package days.four;

import util.Constants;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PassPhrase {
    private final String passPhrase;

    PassPhrase(String passPhrase) {
        this.passPhrase = passPhrase;
    }

    public Boolean isValid() {
        String[] words = passPhrase.split(Constants.DELIMITER);

        return Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s))
                .values()
                .stream()
                .noneMatch((occurrences) -> occurrences.size() > 1);
    }
}
