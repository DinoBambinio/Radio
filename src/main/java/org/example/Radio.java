package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) { // Номер текущей станции от 0 до 9
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void next() {   // переключение на следующую станцию
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }

    }

    public void prev() {  // предыдущая станция
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }

    }

    public void customStation() {  //пользовательская станция
        int newCurrentStation = getCurrentStation();
        setCurrentStation(newCurrentStation);
    }

    public int getCurrentStation() {  // получение текущего значения станции
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) { // пределы громкости от 0 до 10
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {  // получение текущего значения громкости
        return currentVolume;
    }

    public void increaseVolume() {  // достижение максимального уровня громкости
        if (currentVolume >= 10) {
            currentVolume = 10;
        } else {
            currentVolume++;
        }
    }

    public void decreaseVolume() {  // достижение минимального уровня громкости
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }

}