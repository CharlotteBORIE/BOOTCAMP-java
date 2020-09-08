public abstract class Personnage implements Victime {

    String Nom;
    int PV;

    public Personnage (String name, int pv){
        this.Nom=name;
        this.PV=pv;
    }

    public String getNom(){
        return this.Nom ;
    }

    public boolean mort(){
        if (this.PV<=0){
            return true ;
        }
        return false ;
    }

    public int getVie(){
        return this.PV;
    }

    public void addVie(int num){
        this.PV= this.PV+num;
    }

    public String toString(){
        if (this.mort()){
            return this.Nom+" est mort.";
        }
            
        return this.Nom+" as "+this.PV+" pv.";
        
    }

    
}    

