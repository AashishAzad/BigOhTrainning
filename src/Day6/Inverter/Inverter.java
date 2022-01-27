package Day6.Inverter;

public class Inverter {

    static float powerRating(float current, float voltage){

        return current*voltage;
    }
}

class SolarInverter extends Inverter {

    float current;
    float voltage;
    int panels;
    boolean battery;
    boolean grid;

    SolarInverter(float current, float voltage, int panels){

        this.current = current;
        this.voltage = voltage;
        this.panels = panels;
    }

    float getRatings(){

        return Inverter.powerRating(current,voltage);
    }

    void hasBattery(boolean battery) {

        this.battery = battery;
    }

    void isGridON(boolean grid) {
        this.grid = grid;
    }
}

class NonSolarInverter extends Inverter {

    float current;
    float voltage;

    NonSolarInverter(float current, float voltage) {

        this.current = current;
        this.voltage = voltage;

    }

    float getRatings(){
        return Inverter.powerRating(current,voltage);
    }
}


