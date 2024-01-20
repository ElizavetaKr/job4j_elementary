package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    void whenFirstMin() {
        int[] array = new int[]{1, 5, 6, 8};
        int expected = 1;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = new int[]{1, 5, 6, 8, 0};
        int expected = 0;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = new int[]{20, 5, 6, 8};
        int expected = 5;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }
}