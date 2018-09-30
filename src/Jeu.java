public class Jeu {
    Joueur joueur;
    int partie;
    public Joueur getJoueur() {
        return joueur;
    }
    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
    public int getPartie() {
        return partie;
    }
    public void setPartie(int partie) {
        this.partie = partie;
    }
    public Jeu(Joueur joueur, int partie) {
        this.joueur = joueur;
        this.partie = partie;
    }
    public void jouer (){
        int scoreFinal = 0;
        for (int i =0 ;i <= partie;i++){
            joueur.scoreJ();
            scoreFinal += joueur.getScore();
        }
        joueur.setScore(scoreFinal);
    }
}