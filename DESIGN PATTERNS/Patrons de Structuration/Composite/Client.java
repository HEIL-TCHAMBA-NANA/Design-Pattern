public class Client {
    public static void main(String[] args) {
        // Création des fichiers
        FichierTXT fichier1 = new FichierTXT("document.txt");
        FichierPDF fichier2 = new FichierPDF("rapport.pdf");
        FichierPDF fichier3 = new FichierPDF("presentation.pdf");

        // Création des dossiers
        Dossier dossier1 = new Dossier("Documents");
        Dossier dossier2 = new Dossier("Travail");

        // Ajout de fichiers aux dossiers
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);

        dossier2.ajouter(fichier3);

        // Création d'un dossier racine
        Dossier racine = new Dossier("Racine");
        racine.ajouter(dossier1);
        racine.ajouter(dossier2);

        // Affichage de l'arbre
        System.out.println("Structure du système de fichiers\n");
        racine.decrire();

        // Test pour obtenir un element
        System.out.println("\n Obtention du 1er élément du dossier 'Documents'");
        ElementFichier elem = dossier1.obtenir(0);
        if (elem != null) {
            elem.decrire();
        }
    }
}