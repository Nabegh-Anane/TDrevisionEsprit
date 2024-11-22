public class Main {
    public static void main(String[] args) {
        try {
            Station station = new Station(1, "Station de lavage");

            Voiture voiture1 = new Voiture(101, "Toyota", "essence", "noire");
            Voiture voiture2 = new Voiture(102, "Honda", "diesel", "rouge");
            Camion camion1 = new Camion(201, "Mercedes", "essence", 2);

            station.ajouterVehicule(voiture1);
            station.ajouterVehicule(voiture2);
            station.ajouterVehicule(camion1);

            System.out.println(station);
            System.out.println("Nombre de voitures essence: " + station.NbrVoitureEssence());
            System.out.println("Nombre de voitures noires: " + station.NbrVoitureNoire());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
