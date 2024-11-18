package percobaan;

public class Mahasiswa {
    private int nrp;
    private String nama;

    Mahasiswa(int nrp, String nama){
        this.nama = nama;
        this.nrp = nrp;
    }

    public int getNrp(){
        return this.nrp;
    }
    public String getNama(){
        return this.nama;
    }

    public void setNrp(int nrp){
        this.nrp = nrp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}