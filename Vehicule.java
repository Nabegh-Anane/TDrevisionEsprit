public class Vehicule {
    private int id;
    private String marque;
    private String typeDeCarburant;

    // Constructeur paramétré
    public Vehicule(int id, String marque, String typeDeCarburant) {
        this.id = id;
        this.marque = marque;
        this.typeDeCarburant = typeDeCarburant;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Vehicule [id=" + id + ", marque=" + marque + ", typeDeCarburant=" + typeDeCarburant + "]";
    }

    // Méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicule vehicule = (Vehicule) obj;
        return id == vehicule.id && marque.equals(vehicule.marque);
    }
}
