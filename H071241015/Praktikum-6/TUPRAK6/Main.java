
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Suzuki", "T001");
        Motor motor = new Motor("Suzuki", "T001");
        Sepeda sepeda = new Sepeda("Suzuki", "T001");
        Truk truk = new Truk("Suzuki", "T001");
        mobil.setKapasitasMesin(200);


        System.out.println("Mobil: " + mobil.getTipeKendaraan() + ", Merek: " + mobil.getMerek()+ ", Pajak: " + mobil.hitungPajak() + ", Waktu: " + mobil.getWaktuServisTerakhir());
        System.out.println("Motor: " + motor.getTipeKendaraan() + ", Merek: " + motor.getMerek());
        System.out.println("Sepeda: " + sepeda.getTipeKendaraan() + ", Merek: " + sepeda.getMerek());
        System.out.println("Truk: " + truk.getTipeKendaraan() + ", Merek: " + truk.getMerek());
        
    }
}