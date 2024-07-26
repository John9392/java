public class MyCities {
    
    // Enum definition within the MyCities class
    public enum FavCities {
        // Enum constants with population values
        CLEVELAND(421048),
        NEW_YORK(8336817),
        LOS_ANGELES(3979576);
        private final int pop;
        FavCities(int population) {
            this.pop = population;
        }
        public int getPop() {
            return pop;
        }
    }

    public static void main(String[] args) {
        for (FavCities city : FavCities.values()) {
            System.out.println("The population of " + city.toString().replace('_', ' ') + " is " + city.getPop());
        }
    }
}