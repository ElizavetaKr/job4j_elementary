package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2And2And2Then2() {
        int a = 2;
        int b = 2;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And2And5Then5() {
        int a = 1;
        int b = 2;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And2And5And7Then7() {
        int a = 1;
        int b = 2;
        int c = 5;
        int d = 7;
        int result = Max.max(a, b, c, d);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3And3And3And3Then3() {
        int a = 3;
        int b = 3;
        int c = 3;
        int d = 3;
        int result = Max.max(a, b, c, d);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}