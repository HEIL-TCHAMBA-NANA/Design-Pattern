public class TestSingleton {
    public static void main(String[] args){

        int som = Singleton.getInstance().somme(2, 5);

        System.out.printf("la somme est %d",som);

        Singleton s1 = Singleton.getInstance(8, 3);

        s1.affiche();

        Singleton s2 = Singleton.getInstance(5, 9);

        s2.affiche();

        Singleton s3 = Singleton.getInstance(7, 5, "toto");

        s3.affiche(); //Le resultat est ainsi parce que le premier objet creer n'avait pas de parametres et donc vu que l'objet ne peut plus etre recreer, ca produit ce qu'on voit en executant
    }
}