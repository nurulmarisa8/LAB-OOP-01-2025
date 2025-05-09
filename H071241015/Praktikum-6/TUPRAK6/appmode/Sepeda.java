import java.util.Date;

public class Sepeda extends Kendaraan implements IServiceable {
    private String jenisSepeda;
    private int jumlahGear;
    private double kapasitasMesin;

    public Sepeda(String merek, String model) {
        super(merek, model);

    }

    public String getTipeKendaraan() { 
        return "Sepeda"; 
    }

    public boolean berhenti() { 
        return true; 
    }
    
    public double getKecepatan() { 
        return 0.0; 
    }

    public void setKecepatan(double kecepatan) {

    }

    public boolean periksaKondisi() { 
        return true; 
    }

    public void lakukanServis() {

    }

    public Date getWaktuServisTerakhir() { 
        return new Date(); 
    }

    public void setWaktuServis(Date waktu) {

    }

    public double hitungBiayaServis() { 
        return 0.0; 
    }

    public String getJenisSepeda() { 
        return jenisSepeda; 
    }

    public void setJenisSepeda(String jenisSepeda) { 
        this.jenisSepeda = jenisSepeda; 
    }

    public int getJumlahGear() { 
        return jumlahGear; 
    }

    public void setJumlahGear(int jumlahGear) { 
        this.jumlahGear = jumlahGear; 
    }

    public double getKapasitasMesin() { 
        return kapasitasMesin; 
    }

    public void setKapasitasMesin(double kapasitasMesin) { 
        this.kapasitasMesin = kapasitasMesin; 
    }

    public double hitungPajak(){
        return kapasitasMesin * 50000;
    }
    
}