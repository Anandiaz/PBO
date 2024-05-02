package kebun;

public class Kucing extends Hewan {
    private String ras;

    public Kucing (String nama, String makanan, int umur, String ras){
        setNama(nama);
        setMakanan(makanan);
        setUmur(umur);
        this.ras = ras;
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

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public void suara(){
        super.suara();
        System.out.println("Mengeong");
    }

    public void biodata(String ras){
        this.ras = ras;
        super.biodata();
        System.out.println("ras = " + this.ras);
        suara();
    }
    
    

}
