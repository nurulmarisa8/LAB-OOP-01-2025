public class Truk extends Kendaraan implements IBergerak {
    private double kapasitasMesin;
    private double hitungPajak;

    public Truk(String merek, String model) {
        super(merek, model);
        
    }

    public String getTipeKendaraan() { 
        return "Truk"; }


    public boolean bergerak() { 
        return true; }


    public boolean berhenti() { 
        return true; }
        

    public double getKecepatan() { 
        return 0.0; }


    public void setKecepatan(double kecepatan) {
        
    }

    public double getKapasitasMesin() { 
        return kapasitasMesin; 
    }

    public void setKapasitasMesin(double kapasitasMesin) { 
        this.kapasitasMesin = kapasitasMesin; 
    }

    public double hitungPajak(){
        return kapasitasMesin * this.hitungPajak;
    }

}