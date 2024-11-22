public class Camion extends Vehicule {
    private int nbrPlace;

    // Constructeur
    public Camion(int id, String marque, String typeDeCarburant, int nbrPlace) {
        super(id, marque, typeDeCarburant);
        this.nbrPlace = nbrPlace;
    }

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + ", nbrPlace=" + nbrPlace + "]";
    }
}
