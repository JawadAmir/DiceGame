import java.util.Scanner;
import java.util.ArrayList ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList <Joueur> joueurs  = new ArrayList <Joueur>();
        int partie,nombreJoueur;
        System.out.println("Le nombreJoueur : ");
        nombreJoueur=sc1.nextInt();
        for(int i=1;i <= nombreJoueur;i++){
            System.out.println("\n  Le nom du joueur "+ i +": ");
            String n = sc.nextLine();
            Joueur j = new Joueur(0,n);
            joueurs.add(j);
        }
        System.out.println("Le nombre de  partie: ");
        Jeux jeux = new Jeux (joueurs,sc.nextInt());
        jeux.jouer();
        Joueur gagnant= jeux.leGangnant();
        System.out.println("Le gangnant est :\n"+gagnant.getName()+"\nSon score est :\n" +gagnant.getScore() );
    }
}
