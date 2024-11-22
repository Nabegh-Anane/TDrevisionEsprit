import java.util.ArrayList;

public class Station {
    private int id;
    private String nom;
    private ArrayList<Vehicule> vehicules;

    // Constructeur par défaut
    public Station() {
        this.vehicules = new ArrayList<>();
    }

    // Constructeur paramétré
    public Station(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.vehicules = new ArrayList<>();
    }

    // Méthode pour ajouter un véhicule
    public void ajouterVehicule(Vehicule vehicule) throws AjoutVoitureException {
        if (vehicules.size() >= 10) {
            throw new IllegalStateException("La station ne peut pas traiter plus de 10 véhicules.");
        }
        if (vehicules.contains(vehicule)) {
            throw new AjoutVoitureException("Le véhicule existe déjà dans la station.");
        }
        vehicules.add(vehicule);
    }

    // Méthode NbrVoitureEssence
    public int NbrVoitureEssence() {
        int count = 0;
        for (Vehicule vehicule : vehicules) {
            if (vehicule instanceof Voiture && vehicule.getTypeDeCarburant().equalsIgnoreCase("essence")) {
                count++;
            }
        }
        return count;
    }

    // Méthode NbrVoitureNoire
    public int NbrVoitureNoire() {
        int count = 0;
        for (Vehicule vehicule : vehicules) {
            if (vehicule instanceof Voiture && ((Voiture) vehicule).getCouleur().equalsIgnoreCase("noire")) {
                count++;
            }
        }
        return count;
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Station [id=").append(id).append(", nom=").append(nom).append(", vehicules=").append(vehicules).append("]");
        return builder.toString();
    }
}
