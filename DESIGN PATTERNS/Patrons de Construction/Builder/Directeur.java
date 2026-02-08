public class Directeur {

    private MonteurPizza monteurPizza;

    //Le client fournit le monteur
    public void setMonteurPizza(MonteurPizza monteurPizza) {
        this.monteurPizza = monteurPizza;
    }

    //Méthode qui construit la pizza
    public void construirePizza() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
    }

    //Récupérer la pizza construite
    public Pizza getPizza() {
        return monteurPizza.getPizza();
    }
}
