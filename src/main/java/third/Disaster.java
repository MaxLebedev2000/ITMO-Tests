package third;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Disaster {
    private  Weather weather;


    private boolean hot = false;



    private String incident;

    public Disaster (Weather weather, String disaster){
        this.weather = weather;
        this.incident = disaster;
        if (weather.getTemperature()>5) this.hot = true;

    }


    public boolean getSituation (Disaster disaster){
        if( disaster.incident != null){
        System.out.printf("%s началось. Жар и шум были %s. ",disaster.incident,disaster.weather.toString());
        return true;
        } else {
            System.out.printf("Ничего не произашло. Жар и шум были %s. ",disaster.weather.toString());
            return true;
        }
    }



    public Weather getWeather() {
        return weather;
    }

    public String getIncident() {
        return incident;
    }

    public boolean isHot() {
        return hot;
    }



}
