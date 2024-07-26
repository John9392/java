public class ArrayDecs {
    int[] cityPop = new int[20];
    String[] squad = new String[11];
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    public void printArrays() {
        System.out.println("Planet Names: ");
        for (String planet : planets) {
            System.out.println(planet);
        }
        System.out.println("\nCity Populations (default values, as they're not initialized yet): ");
        for (int pop : cityPop) {
            System.out.println(pop);
        }

        System.out.println("\nSquad members (default values, as they're not initialized yet): ");
        for (String player : squad) {
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        ArrayDecs arrayDecs = new ArrayDecs();
        arrayDecs.printArrays();
    }
}