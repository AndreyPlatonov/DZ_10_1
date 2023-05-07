public class Radio {

    private int beginRadioStation = 0;
    private int quantityRadioStation = 10;
    private int endRadioStation = beginRadioStation + quantityRadioStation - 1;
    private int currentRadioStation = beginRadioStation;
    private int currentVolume;

    public Radio(int quantityStation) {
        if (quantityStation > 0) {
            this.endRadioStation = this.beginRadioStation + quantityStation - 1;
            this.quantityRadioStation = quantityStation;
        }
    }

    public Radio() {
        this.endRadioStation = 9;
        this.quantityRadioStation = 10;
        this.beginRadioStation = 0;
        this.currentRadioStation = 0;

    }


    public void nextRadioStation() {
        if (currentRadioStation == endRadioStation) {
            setRadioStation(beginRadioStation);
        } else {
            setRadioStation(currentRadioStation + 1);
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == beginRadioStation) {
            setRadioStation(endRadioStation);
        } else {
            setRadioStation(currentRadioStation - 1);
        }
    }

    public void setRadioStation(int numberRadioStation) {
        if (numberRadioStation < beginRadioStation | numberRadioStation > endRadioStation) {
            return;
        }
        currentRadioStation = numberRadioStation;
    }

    public int getRadioStation() {
        return currentRadioStation;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getBeginRadioStation() {
        return beginRadioStation;
    }

    public int getEndRadioStation() {
        return endRadioStation;
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
