public class FichierTXT extends Fichier {
    public FichierTXT(String nom) {
        super(nom, "TXT");
    }

    public void decrire() {
        System.out.println("Fichier | Nom: " + nom + " | Type: " + type);
    }
}