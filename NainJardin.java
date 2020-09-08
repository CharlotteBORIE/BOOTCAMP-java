import java.util.*;

public class NainJardin implements Victime {

    //créé l'objet random
    Random ran= new Random() ;

    int solidite= 15+ran.nextInt(65);

    public int getVie(){
        return solidite;
    }

    public String getNom(){
        return "Nain";
    }

    public void attaque(Victime p){
        //il n'attaque pas
    }


    public int subitFrappe(int coup){
        if (coup>solidite){
            this.solidite=0;
        }
        return coup;
    }
    public int subitCharme(int coup){
        return 5;
    }

    public boolean mort(){
        if (solidite==0){
            return true;
        }
        return false;
    }
}
