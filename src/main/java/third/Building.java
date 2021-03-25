package third;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Building {

private String buildingName;

    public boolean isCondition() {
        return condition;
    }

    private boolean condition = true;

public Building(boolean isHot, String buildingName){
    if (isHot) this.condition = false;
    this.buildingName = buildingName;
}


public boolean getBuildingInfo(Building building){
    if (!condition){
    System.out.printf("%s начал понемногу разваливаться на куски. Лицевая сторона его почти вся расплавилась, и густые ручейки расплавленного металла начали заползать в угол,", buildingName);
    return true;}
    else {
        System.out.printf("%s в полном порядке", buildingName);
        return true;
    }
}



}
