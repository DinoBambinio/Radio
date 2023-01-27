package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {   // Номер текущей радиостанции от 0 до 9
    @Test
    public void currentStationNumber() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentStationNumber2() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentStationNumber3() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextStation() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentStation(4);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        org.example.Radio radio = new org.example.Radio();

        radio.setCurrentStation(3);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevStation2() {
        org.example.Radio radio = new org.example.Radio();

        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void prevStation3() {
        org.example.Radio radio = new org.example.Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void customRadioStation() {
        org.example.Radio radio = new org.example.Radio();

        radio.setCurrentStation(7);
        radio.customStation();

        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentVolume() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(7);

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentVolumeLessThanMin() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpTheVolume() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpTheVolumeMax() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpTheVolumeMoreMax() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(11);

        radio.increaseVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheVolume() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();


        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnDownTheVolumeMin() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheVolumeLessThanMin() {
        org.example.Radio radio = new org.example.Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }
}