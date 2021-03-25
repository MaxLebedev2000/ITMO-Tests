package third;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Entity {
    private String entityName;
    private boolean isBuildingOk ;

    public Entity (boolean isBuildingOk, String entityName){
        this.isBuildingOk = isBuildingOk;
        this.entityName = entityName;
    }

public boolean entityCondition(){
        if (!isBuildingOk){
            System.out.printf("%s сгрудились плотнее и стали ждать конца.", entityName);
        return true;}
        else {
            System.out.printf("%s спокойно разгуливают по зданию, наслаждаясь жизнью",entityName);
            return true;
        }
}














}
