
public interface ElementFichier {
    public String getNom();
    public String getType();
    public void decrire();
    public void ajouter(ElementFichier element);
    public void supprimer(ElementFichier element);
    public ElementFichier obtenir(int index);
}