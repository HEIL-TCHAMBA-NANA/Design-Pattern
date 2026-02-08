public class FichierPDF extends Fichier {
    public FichierPDF(String nom) {
        super(nom, "PDF");
    }

    public void decrire() {
        System.out.println("Fichier | Nom: " + nom + " | Type: " + type);
    }
}