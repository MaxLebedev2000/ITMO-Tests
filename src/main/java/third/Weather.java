package third;

public class Weather {

    private int temperature;

    private int volumeLevel;

    public Weather(int temperature, int volumeLevel) {
        this.temperature = temperature;
        this.volumeLevel = volumeLevel;
    }
    @Override
    public String toString(){
        if ((this.temperature > 5)&&(this.volumeLevel>5)){
        return "невообразимыми";} else {return  "в пределах разумного";}
    }


    public int getTemperature() {
        return temperature;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
