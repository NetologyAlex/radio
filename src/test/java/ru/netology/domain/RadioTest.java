package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldReturnWhenSetCurrentStationNumberToMaxNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentStationNumber(16);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWhenSetCurrentStationNumberToMinus1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.setCurrentStationNumber(-1);

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldUpStationNumberWhenPressNext() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void shouldDownStationNumberWhenPressPrev() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxToStationNumberWhenPressNext() {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(14);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSet0ToStationNumberWhenPressPrev() {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(0);

        radio.prev();

        int expected = 15;
        int actual = radio.getMaxStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSet15ToStationNumberWhenPressPrev() {
        Radio radio = new Radio(15);
        radio.setCurrentStationNumber(15);

        radio.prev();

        int expected = 14;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWhenSetCurrentVolumeTo11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(101);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWhenSetCurrentVolumeToMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(-1);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldUpCurrentVolumeWhenPressVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.volumeUp();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWhenCurrentVolumeEquals10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeWhenPressVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.volumeDown();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCurrentVolumeWhenPressVolumeDownAndCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}