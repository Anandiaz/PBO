package kebun;

public abstract class Hewan {
    protected String makanan, nama;
    protected int umur;

    protected abstract String getNama();
    protected abstract void setNama(String nama);
    protected abstract String getMakanan();
    protected abstract void setMakanan(String makanan);
    protected abstract int getUmur();
    protected abstract void setUmur(int umur);

    public final void biodata(){
        System.out.println("Nama = " + this.getNama());
        System.out.println("Makanan = " + this.getMakanan());
        System.out.println("Umur = " + this.getUmur());
    }

    public void suara(){
        System.out.print("Hewan tersebut ");
    }
    
}
