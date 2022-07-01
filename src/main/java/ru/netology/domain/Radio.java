package ru.netology.domain;

public class Radio {

    private int currentStationNumber = 0;
    private int currentVolume = 0;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStationNumber(int NewCurrentStationNumber) {
        if (NewCurrentStationNumber > 9) {
            return;
        }
        if (NewCurrentStationNumber < 0) {
            return;
        }
        this.currentStationNumber = NewCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber == 9) {
            setCurrentStationNumber(0);
        } else {
            setCurrentStationNumber(currentStationNumber + 1);
        }
    }

    public void prev() {
        if (currentStationNumber == 0) {
            setCurrentStationNumber(9);
        } else {
            setCurrentStationNumber(currentStationNumber - 1);
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}