package Day6.Politics;

public  enum Profile {
    MP(100000),
    MINISTER(1000000),
    PM(10000000);

    int exceedingLimit;

    Profile(int exceedingLimit){
        this.exceedingLimit = exceedingLimit;
    }

    public int getExceedingLimit() {
        return exceedingLimit;
    }

    //    static final int exceedingLimitForMP = 100000;
//    static final int exceedingLimitForMinister = 1000000;
//    static final int exceedingLimitForPM = 10000000;
}
