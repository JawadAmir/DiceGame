import java.util.ArrayList;
public class Jeux {
    ArrayList<Joueur> joueurs;
    int partie;
    public Jeux(ArrayList<Joueur>joueurs,int partie) {
        this.joueurs = joueurs;
        this.partie = partie;
    }
    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }
    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    public void jouer(){
        for(Joueur j : joueurs)
        {
            Jeu jeu = new Jeu(j,partie);
            jeu.jouer();
        }
    }
    public Joueur leGangnant(){
        int maxScore=0;
        Joueur joueur = null;
        for(Joueur j : joueurs){
            if(j.getScore()>maxScore){
                maxScore=j.getScore();
                joueur=j;
            }
        }
        return joueur;
    }
}

