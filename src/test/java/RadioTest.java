import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNextStationOver() {
        Radio radioTest = new Radio(20);
        radioTest.setRadioStation(radioTest.getEndRadioStation());
        radioTest.nextRadioStation();

        int expected = radioTest.getBeginRadioStation();
        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio radioTest = new Radio();
        radioTest.setRadioStation(6);
        radioTest.nextRadioStation();

        int expected = 7;
        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPrevStationUnder() {
        Radio radioTest = new Radio(48);
        radioTest.setRadioStation(radioTest.getBeginRadioStation());
        radioTest.prevRadioStation();

        int expected = radioTest.getEndRadioStation();
        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio radioTest = new Radio(0);
        radioTest.setRadioStation(6);
        radioTest.prevRadioStation();

        int expected = 5;
        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioStationOver() {
        Radio radioTest = new Radio(50);
        radioTest.setRadioStation(radioTest.getBeginRadioStation() + radioTest.getQuantityRadioStation());
        int expected = radioTest.getBeginRadioStation();
        int actual = radioTest.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationUnder() {
        Radio radioTest = new Radio(13);
        radioTest.setRadioStation(radioTest.getBeginRadioStation() - 1);

        int expected = radioTest.getBeginRadioStation();
        int actual = radioTest.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radioTest = new Radio();
        radioTest.setVolume(67);
        radioTest.increaseVolume();
        int expected = 68;
        int actual = radioTest.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeOver() {
        Radio radioTest = new Radio();
        radioTest.setVolume(100);
        radioTest.increaseVolume();
        int expected = 100;
        int actual = radioTest.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        Radio radioTest = new Radio();
        radioTest.setVolume(67);
        radioTest.decreaseVolume();
        int expected = 66;
        int actual = radioTest.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeUnder() {
        Radio radioTest = new Radio();
        radioTest.setVolume(0);
        radioTest.decreaseVolume();
        int expected = 0;
        int actual = radioTest.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolumeOver() {
        Radio radioTest = new Radio();
        radioTest.setVolume(101);
        int expected = 0;
        int actual = radioTest.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeUnder() {
        Radio radioTest = new Radio();
        radioTest.setVolume(-2);
        int expected = 0;
        int actual = radioTest.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
