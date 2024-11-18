package latihan;

public class Truk {
    private double muatan;
    private double muatanMaks;

    public Truk(double beratmaks){
        this.muatanMaks = beratmaks * 10;
    }

    public double getMuatan() {
        return newtsToKilo(this.muatan);
    }
    public double getMuatanMaks() {
        return newtsToKilo(this.muatanMaks);
    }

    public boolean tambahMuatan(double berat){
        berat = kiloToNewts(berat);
        if(this.muatan + berat <= this.muatanMaks){
            this.muatan += berat;
            return true;
        }
        return false;
    }

    public double newtsToKilo(double berat){
        return berat / 10;
    }
    public double kiloToNewts(double berat){
        return berat * 10;
    }
}