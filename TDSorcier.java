import java.util.*;

public class TDSorcier {

    public static void main(String[] args) {

        Random ran= new Random() ;

        Victime[] table= new Victime[13];

        table[0]= new Monstre("M1", ran.nextInt(100));
        table[1]= new Monstre("M2", ran.nextInt(100));
        table[2]= new Monstre("M3", ran.nextInt(100));
        table[3]= new Monstre("M4", ran.nextInt(100));
        table[4]= new Monstre("M5", ran.nextInt(100));
        table[5]= new Sorcier("S1", ran.nextInt(100));
        table[6]= new Sorcier("S2", ran.nextInt(100));
        table[7]= new Sorcier("S3", ran.nextInt(100));
        table[8]= new Magicien("MA4", ran.nextInt(100));
        table[9]= new Magicien("MA5", ran.nextInt(100));
        table[10]= new NainJardin();
        table[11]= new NainJardin();
        table[12]= new NainJardin();
        
        System.out.println("M1:"+table[0].getVie()+" M2:"+table[1].getVie()+" M3:" +table[2].getVie()+" M4:"+table[3].getVie()+" M5:"+table[4].getVie()+"   S1:"+table[5].getVie()+" S2:"+table[6].getVie()+" S3:"+table[7].getVie()+" MA4:"+table[8].getVie()+" MA5:"+table[9].getVie());
        
        System.out.println(vivants(table));
        System.out.println(sorciers_vivants(table));

        while (vivants(table)!=sorciers_vivants(table) && vivants(table)>1){
            int x=ran.nextInt(10);
            int y=ran.nextInt(10);
            while(x==y || table[y].mort()){
                y=ran.nextInt(10);
            }
            table[x].attaque(table[y]);
            System.out.println(table[x].getNom()+" attaque "+table[y].getNom());
            System.out.println("M1:"+table[0].getVie()+" M2:"+table[1].getVie()+" M3:" +table[2].getVie()+" M4:"+table[3].getVie()+" M5:"+table[4].getVie()+"   S1:"+table[5].getVie()+" S2:"+table[6].getVie()+" S3:"+table[7].getVie()+" MA4:"+table[8].getVie()+" MA5:"+table[9].getVie());
        
            }
        
        for (int i=0; i<10;i++){
            System.out.println(table[i]);
        }

        int m=0;
        for (int i=0; i<3;i++){
            if (table[i+10].mort()){
                m++;
            }}
        System.out.println(m+"sont cassé");
        }

        
    public static int vivants(Victime[] table){
        int m=0;
        for (int i=0;i<10; i++){
            if(table[i].mort()){
                m++;
            }
        }
        return 10-m;
    }

    public static int sorciers_vivants(Victime[] table){
        int s=0;
        for (int j=0;j<3; j++){
            if(table[j+5].mort()){
                s++;
            }
        }
        return 3-s;
        
    }
    
}
