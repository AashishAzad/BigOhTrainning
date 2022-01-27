package Day6.Inverter;

public class Main {

        public static void main(String[] args) {

            //Solar Inverters

            SolarInverter PCU = new SolarInverter(4,2.5f,3);
            System.out.println(PCU.getRatings());
            PCU.hasBattery(true);
            PCU.isGridON(false);

            SolarInverter GTI = new SolarInverter(5.2f,3.6f,4);
            System.out.println(GTI.getRatings());
            GTI.hasBattery(false);
            GTI.isGridON(true);

            SolarInverter Regalia = new SolarInverter(5.2f,3.6f,4);
            System.out.println(Regalia.getRatings());

            //Non Solar Inverters

            NonSolarInverter Zelio = new NonSolarInverter(5.2f,6.8f);
            System.out.println(Zelio.getRatings());

            NonSolarInverter iCruze = new NonSolarInverter(2.6f, 4.5f);
            System.out.println(iCruze.getRatings());
        }


}
