public abstract class Kendaraan {
    private String id;
    private String merek;
    private String model;
    private String warna;
    private int tahunProduksi;
    private double kapasitasMesin;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getId(){ 
        return id; 
    }
    public String getMerek(){ 
        return merek; 
    }
    public String getModel(){ 
        return model; 
    }
    public int getTahunProduksi(){ 
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahun){ 
        this.tahunProduksi = tahun; 
    }
    public String getWarna(){ 
        return warna;
    }
    public void setWarna(String warna){ 
        this.warna = warna; 
    }

    public double getKapasitasMesin() { 
        return kapasitasMesin; 
    }

    public void setKapasitasMesin(double kapasitasMesin) { 
        this.kapasitasMesin = kapasitasMesin; 
    }

    public abstract double hitungPajak();
    public abstract String getTipeKendaraan();
}