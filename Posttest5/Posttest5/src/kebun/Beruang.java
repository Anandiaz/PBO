package kebun;

public class Beruang extends Hewan{
    private double bobot;

    public Beruang (String nama, String makanan, int umur, double bobot){
        setNama(nama);
        setMakanan(makanan);
        setUmur(umur);
        this.bobot = bobot;
    }
    
    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getNama() {
        return nama;
    }
    protected String getMakanan() {
        return makanan;
    }
    protected void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    protected int getUmur() {
        return umur;
    }
    protected void setUmur(int umur) {
        this.umur = umur;
    }

    public double getbobot() {
        return bobot;
    }

    public void setbobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void suara(){
        super.suara();
        System.out.println("Berderam");
    }

    public void biodata(double bobot){
        this.bobot = bobot;
        super.biodata();
        System.out.println("bobot = " + this.bobot + " Kg");
        suara();

    }

}
