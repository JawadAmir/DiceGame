public class Joueur {
    int score;
    String name;
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Joueur(int score,String name){
        this.score = score;
        this.name = name;
    }
    public void scoreJ(){
        De de = new De();
        setScore(de.lancerDe());
    }
}

