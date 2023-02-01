package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentAvgVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentLessVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMoreVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAvgVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.increaseVolume();

        int expected = 61;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseAvgVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.decreaseVolume();

        int expected = 39;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentAvgStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentLessStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMoreStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAvgStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMoreStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevAvgStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentAvgNewStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentLessNewStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-1);

        int expected = 14;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMoreNewStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(30);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAvgNewStation() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMoreNewStation() {
        Radio radio = new Radio(91);
        radio.setCurrentStation(90);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevAvgNewStation() {
        Radio radio = new Radio(45);
        radio.setCurrentStation(30);

        radio.prevStation();

        int expected = 29;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessNewStation() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
}