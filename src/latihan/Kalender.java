package latihan;

public class Kalender {
    public int tanggal = 1;
    public int bulan = 1;
    public int tahun = 2000;

    public Kalender(int tanggal){
        this.tanggal = tanggal;
    }
    public Kalender(int bulan, int tahun){
        this.tahun = tahun;
        this.bulan = bulan;
    }
    public Kalender(int tanggal, int bulan, int tahun){
        this.tanggal = tanggal;
        this.tahun = tahun;
        this.bulan = bulan;
    }

    public int getTanggal(){
        return this.tanggal;
    }
    public int getBulan(){
        return this.bulan;
    }
    public int getTahun(){
        return this.tahun;
    }

    public void setTanggal(int tanggal){
        this.tanggal = tanggal;
    }
    public void setBulan(int bulan){
        this.bulan = bulan;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
}
