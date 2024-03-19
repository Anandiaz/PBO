package kebun;

public class Hewan {
    private String jenis, nama, habitat;
    private int umur;

    public Hewan(String jenis, String nama, String habitat, int umur){
        this.jenis = jenis;
        this.nama = nama;
        this.habitat =habitat;
        this.umur =umur;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
}
