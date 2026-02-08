import java.util.ArrayList;
import java.util.List;

public class Dossier implements ElementFichier {
    private String nom;
    private List<ElementFichier> elements;

    public Dossier(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return "Dossier";
    }

    public void decrire() {
        System.out.println("Dossier | Nom: " + nom);
        for (ElementFichier element : elements) {
            element.decrire();
        }
    }

    public void ajouter(ElementFichier element) {
        elements.add(element);
    }

    public void supprimer(ElementFichier element) {
        elements.remove(element);
    }

    public ElementFichier obtenir(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }
}