package tugas.perbankan;

public class Bank {
    private Nasabah[] nasabah = new Nasabah[10];
    private int jumlahNasabah = 0;

    public Bank(){

    }

    public void tambahNasabah(String namaAwal, String namaAkhir){
        this.nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }

    public int getJumlahNasabah(){
        return this.jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks){
        return this.nasabah[indeks];
    }
}
