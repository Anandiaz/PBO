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
