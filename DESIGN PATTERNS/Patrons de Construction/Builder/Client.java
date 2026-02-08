public class Client {

    public static void main(String[] args) {

        Directeur directeur = new Directeur();

        //Pour la PizzaReine
        MonteurPizza monteurReine = new MonteurPizzaReine();
        directeur.setMonteurPizza(monteurReine);
        directeur.construirePizza();
        Pizza pizzaReine = directeur.getPizza();

        System.out.println("Pizza Reine :");
        pizzaReine.print();

        //Pour la PizzaPiquante
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        directeur.setMonteurPizza(monteurPiquante);
        directeur.construirePizza();
        Pizza pizzaPiquante = directeur.getPizza();

        System.out.println("\nPizza Piquante :");
        pizzaPiquante.print();
    }
}
