public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            setRadioStation(0);
        } else
            setRadioStation(currentRadioStation + 1);
        ;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            setRadioStation(9);
        } else
            setRadioStation(currentRadioStation - 1);
    }

    public void setRadioStation(int numberRadioStation) {
        if (numberRadioStation < 0 | numberRadioStation > 9) {
            return;
        }
        currentRadioStation = numberRadioStation;
    }

    public int getRadioStation() {
        return currentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            setVolume(currentVolume - 1);
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int volume) {
        if (volume < 0 | volume > 100) {
            return;
        }
        currentVolume = volume;
    }

}
