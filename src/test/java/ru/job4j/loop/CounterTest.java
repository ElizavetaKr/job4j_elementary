package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumMinus1To2Then2() {
        int start = -1;
        int finish = 2;
        int expected = 2;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum2To2Then2() {
        int start = 2;
        int finish = 2;
        int expected = 2;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum5To2Then0() {
        int start = 5;
        int finish = 2;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum5To10Then45() {
        int start = 5;
        int finish = 10;
        int expected = 45;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}