package Day6.Politics;

public class Comissioner {

    Comissioner(){

    }

    boolean exceedsSpendingLimit(Profile profile, int spend){
        if(profile.getExceedingLimit()<spend){
            return true;
        }
        return false;
    }

    public boolean canArrest(Profile profile, int spend){

        switch (profile){
            case PM:
                return false;

            case MP:
                if(exceedsSpendingLimit(profile,spend)){
                    return true;
                }
                break;
            case MINISTER:
                if (PM.givePermission(spend)){
                    return true;
                }
                break;
                default:
                    return false;
            }
            return false;
    }

}
