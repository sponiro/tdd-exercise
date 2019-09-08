package de.fanero.tdd;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordStatisticsTest {

    @Test
    public void emptyWords() {

        Map<Integer, Integer> statistics = WordStatistics.createStatistics(Collections.<String>emptyList());

        assertThat(statistics.size(), is(0));
    }

    @Test
    public void singleWord() {

        Map<Integer, Integer> statistics = WordStatistics.createStatistics(Arrays.asList("word"));

        assertThat(statistics.get(4), is(1));
    }

    @Test
    public void twoWords() {

        Map<Integer, Integer> statistics = WordStatistics.createStatistics(Arrays.asList("word", "moly"));

        assertThat(statistics.get(4), is(2));
    }

    @Test
    public void nullWord() {

        Map<Integer, Integer> statistics = WordStatistics.createStatistics(Arrays.asList((String) null));

        assertThat(statistics.size(), is(0));
    }
}