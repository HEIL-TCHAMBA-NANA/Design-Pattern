public abstract class Fichier implements ElementFichier {
    protected String nom;
    protected String type;

    public Fichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public void ajouter(ElementFichier element) {
        throw new UnsupportedOperationException("Impossible d'ajouter à un fichier.");
    }

    public void supprimer(ElementFichier element) {
        throw new UnsupportedOperationException("Impossible de supprimer d'un fichier.");
    }

    public ElementFichier obtenir(int index) {
        throw new UnsupportedOperationException("Un fichier n'a pas d'enfants.");
    }
}