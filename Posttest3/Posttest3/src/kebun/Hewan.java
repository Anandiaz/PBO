package kebun;

public class Hewan {
    private String makanan, nama;
    private int umur;

    public Hewan(String nama, String makanan, int umur){
        this.makanan = makanan;
        this.nama = nama;
        this.umur =umur;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getmakanan() {
        return makanan;
    }
    public void setmakanan(String makanan) {
        this.makanan = makanan;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
}
