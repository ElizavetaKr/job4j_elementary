package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00To20Then2() {
        Point pointFirst = new Point(0, 0);
        Point pointSecond = new Point(2, 0);
        double expected = 2;
        double output = pointFirst.distance(pointSecond);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21To2Minus2Then3() {
        Point pointFirst = new Point(2, 1);
        Point pointSecond = new Point(2, -2);
        double expected = 3;
        double output = pointFirst.distance(pointSecond);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when31to2Minus1Then2Dot24() {
        Point pointFirst = new Point(3, 1);
        Point pointSecond = new Point(2, -1);
        double expected = 2.24;
        double output = pointFirst.distance(pointSecond);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}