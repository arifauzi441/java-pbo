package percobaan;

public class Mahasiswa2 {
    private int nrp;
    private String nama;

    Mahasiswa2(int nrp){
        this.nrp = nrp;
    }
    Mahasiswa2(String nama){
        this.nama = nama;
    }
    Mahasiswa2(int nrp, String nama){
        this.nama = nama;
        this.nrp = nrp;
    }

    public String getNama(){
        return this.nama;
    }
    public int getNrp(){
        return this.nrp;
    }
}
