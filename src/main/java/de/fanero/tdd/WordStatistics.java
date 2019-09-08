package de.fanero.tdd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class WordStatistics {

    public static Map<Integer, Integer> createStatistics(List<String> words) {

        Map<Integer, Integer> stats = new HashMap<>();

        words.stream()
                .filter(Objects::nonNull)
                .forEach(word -> {
                    stats.compute(word.length(), (key, value) -> {

                        int oldValue = value == null ? 0 : value;
                        return oldValue + 1;
                    });
                });

        return stats;
    }
}
