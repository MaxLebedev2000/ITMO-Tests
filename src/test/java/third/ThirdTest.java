package third;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Third task tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ThirdTest {
    private Weather weather;
    private Disaster disaster;
    private Building building;
    private Entity entity;
    private Weather normWeather;
    private Disaster noDisaster;
    private Building normBuilding;
    private Entity normEntity;

    @BeforeEach
    void init() {
        weather = new Weather(7, 9);
        disaster = new Disaster(weather, "Бомбардировка");
        building = new Building(disaster.isHot(),"Компьютерный банк");
        entity = new Entity(building.isCondition(),"они");
        normWeather = new Weather(3,3);
        noDisaster = new Disaster(normWeather, null);
        normBuilding = new Building(noDisaster.isHot(),"Центральныйбанк");
        normEntity = new Entity(normBuilding.isCondition(), "персонал");



    }

    @Test
    @DisplayName(value = "Disaster and Weather test")
    void nowSituation() {
        assertTrue(disaster.getSituation(disaster));
    }

    @Test
    @DisplayName(value = "Building condition  test")
    void buildingInfo() {
        assertTrue(building.getBuildingInfo(building));
    }

    @Test
    @DisplayName(value = "Entity condition test")
    void entityCondition() {
        assertTrue(entity.entityCondition());
    }



    @Test
    @DisplayName(value = "noDisaster and normWeather test")
    void nowNormSituation() {
        assertTrue(noDisaster.getSituation(noDisaster));
    }

    @Test
    @DisplayName(value = "Building condition  test")
    void buildingNormInfo() {
        assertTrue(normBuilding.getBuildingInfo(normBuilding));
    }

    @Test
    @DisplayName(value = "Entity condition test")
    void entityNormCondition() {
        assertTrue(normEntity.entityCondition());
    }


}
