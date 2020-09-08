public class Monstre extends Personnage {

    public Monstre(String Nom, int PV){
        super(Nom ,PV);
    }

    public void attaque(Victime p){
        if (!this.mort()){
            int replique =p.subitFrappe(-this.PV/2);
            this.addVie(-replique);
        }
    }

    public int subitFrappe(int coup){
        this.addVie(coup);
        return this.getVie()/2;
    }

    public int subitCharme(int coup){
        this.addVie(coup);
        return this.getVie()/4;
    }
}
