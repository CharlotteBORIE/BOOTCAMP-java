public interface Victime {

    abstract boolean mort();
    abstract String getNom();
    abstract int getVie();

    abstract void attaque(Victime p);
    abstract int subitFrappe(int coup);
    abstract int subitCharme(int coup);

    
}
