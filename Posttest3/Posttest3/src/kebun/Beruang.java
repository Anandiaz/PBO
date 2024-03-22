package kebun;

public class Beruang extends Hewan{
    private double bobot;

    public Beruang (String jenis, String makanan, int umur, double bobot){
        super(jenis, makanan, umur);
        this.bobot = bobot;
    }

    public double getbobot() {
        return bobot;
    }

    public void setbobot(double bobot) {
        this.bobot = bobot;
    }
    public void biodata(){
        System.out.println("Nama = " + super.getNama());
        System.out.println("Makanan = " + super.getmakanan());
        System.out.println("Umur = " + super.getUmur());
        System.out.println("bobot = " + this.bobot + " Kg");
    }
}
