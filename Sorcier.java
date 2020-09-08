public class Sorcier extends Personnage{

    double pouvoir;

    public Sorcier(String Nom, int PV){
        super(Nom ,PV);
        this.pouvoir=Math.random();
    }

    public void attaque(Victime p){
        if (!this.mort()){
            int replique =p.subitCharme((int)(-this.PV*this.getPouvoir()));
            this.addVie(replique);
        }
    }

    public int subitFrappe(int coup){
        this.addVie(coup);
        return (int)(this.getVie()*this.pouvoir);
    }

    public int subitCharme(int coup){
        return 0;
    }

    public double getPouvoir(){
        return this.pouvoir;
    }
}

