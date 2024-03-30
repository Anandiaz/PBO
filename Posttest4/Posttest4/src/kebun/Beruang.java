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
