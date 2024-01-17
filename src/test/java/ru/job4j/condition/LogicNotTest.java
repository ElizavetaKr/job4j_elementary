package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicNotTest {

    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        int num = 3;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        int num = -1;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 4;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotPositiveTrue() {
        int num = -3;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositiveFalse() {
        int num = 3;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0NotPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int num = -2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenFalseThenAllFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenPositiveFalseThenAllFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNotPositiveIsTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllTrue() {
        int num = 4;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositiveIsTrueThenAllTrue() {
        int num = 0;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNotPositiveIsFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isFalse();
    }
}