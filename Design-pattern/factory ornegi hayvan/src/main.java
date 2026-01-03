public class main {
    public static void main(String [] args){
        HayvanFabrikasi kediFabrikasi=new KediFabrikasi();
        HayvanFabrikasi kopekFabrikasi=new KopekFabrikasi();
        Hayvan kedi =kediFabrikasi.hayvanUret();
        Hayvan kopek =kopekFabrikasi.hayvanUret();
        kedi.SesCıkar();
        kopek.SesCıkar();
    }
}
