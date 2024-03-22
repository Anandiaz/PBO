package kebun;

public class Kucing extends Hewan {
    private String ras;

    public Kucing (String nama, String makanan, int umur, String ras){
        super(nama, makanan, umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public void biodata(){
        System.out.println("Nama = " + super.getNama());
        System.out.println("Makanan = " + super.getmakanan());
        System.out.println("Umur = " + super.getUmur());
        System.out.println("ras = " + this.ras);
    }

    

}
