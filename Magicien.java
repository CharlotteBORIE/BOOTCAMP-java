public class Magicien extends Sorcier implements SuperPouvoir{

    public Magicien (String Nom, int PV){
        super(Nom, PV);
    }
    
    @Override
    public double getPouvoir(){
        return this.pouvoir*extra;
    }

    public double sort(){
        return Math.random()*this.pouvoir;
    }

    @Override
    public int subitCharme(int coup){
        return (int)(-this.sort()*coup);
    }
}
