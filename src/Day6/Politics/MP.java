package Day6.Politics;

public class MP {
    Constitiuency constitiuency;
    Driver driver;
    int spend;
    Profile profile;

//    MP(){
//
//    }

    MP(Constitiuency constitiuency, Driver driver, int spend){
        this.constitiuency = constitiuency;
        this.driver = driver;
        this.spend = spend;
        profile = Profile.MP;
    }




}

class Minister extends MP{

    Minister(Constitiuency constitiuency, Driver driver, int spend){
        super(constitiuency,driver,spend);
        profile = Profile.MINISTER;
    }

}

class PM extends MP{

    PM(Constitiuency constitiuency,Driver driver, int spend){
        super(constitiuency,driver,spend);
        profile = Profile.PM;
    }


    Aircraft aircraft;
    public void assignAircraft(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    public static boolean givePermission(int money){
        if(money>Profile.MINISTER.getExceedingLimit()){
            return true;
        }
        return false;
    }

}
