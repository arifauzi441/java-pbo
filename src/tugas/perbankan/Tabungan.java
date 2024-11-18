package tugas.perbankan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this(saldo, "");
    }

    public Tabungan(int saldo, String mataUang){
        if(mataUang.equals("AUD")) this.saldo = (saldo * 10000);
        if(mataUang.equals("USD")) this.saldo = (saldo * 9000);
        if(mataUang.equals("")) this.saldo = saldo;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void simpanUang(int jumlah, String mataUang){
        if(mataUang.equals("AUD")) this.saldo += (jumlah * 10000);
        if(mataUang.equals("USD")) this.saldo += (jumlah * 9000);
        if(mataUang.equals("")) this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah){
        if(jumlah > this.saldo) return false;
        this.saldo -= jumlah;
        return true;
    }
}
