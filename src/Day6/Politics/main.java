package Day6.Politics;

public class main {
    public static void main(String[] args) {
        MP mp = new MP(new Constitiuency("badarpur"),new Driver("Hariya"),40000);
        Minister minister = new Minister(new Constitiuency("Varanasi"),new Driver("Munna"),50000);
        PM pm = new PM(new Constitiuency("India"),new Driver("Shera"),15000000);

        System.out.println();

    }
}
