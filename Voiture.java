public class Voiture extends Vehicule {
    private String couleur;

    // Constructeur
    public Voiture(int id, String marque, String typeDeCarburant, String couleur) {
        super(id, marque, typeDeCarburant);
        this.couleur = couleur;
    }

    // Getter et Setter pour la couleur (optionnel selon l'exigence)
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + ", couleur=" + couleur + "]";
    }
}
