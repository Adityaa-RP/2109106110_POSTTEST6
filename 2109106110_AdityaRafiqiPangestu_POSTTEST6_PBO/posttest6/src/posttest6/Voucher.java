package posttest6;

abstract class Voucher {
    protected String voucher;
    protected String paket;
    protected String masa;
    protected int kode;
    protected int harga;

    public Voucher (String voucher, String paket, String masa, int kode, int harga) {
        this.voucher = voucher;
        this.paket = paket;
        this.masa = masa;
        this.kode = kode;
        this.harga = harga;
    }

    //----------VOUCHER----------
//    public String getVoucher() {
//        return voucher;
//    }
//
//    public void setVoucher(String voucher) {
//        this.voucher = voucher;
//    }
//    
    //----------PAKET----------
//    public String getPaket() {
//        return paket;
//    }
//
//    public void setpaket(String paket) {
//        this.paket = paket;
//    }
//    
    //----------MASA----------
//    public String getMasa() {
//        return masa;
//    }
//
//    public void setMasa(String Masa) {
//        this.masa = Masa;
//    }
    
    //----------KODE----------
//    public int getKode() {
//        return kode;
//    }
//
//    public void setKode(int kode) {
//        this.kode = kode;
//    }
    
    //---------HARGA----------
//    public int getHarga() {
//        return harga;
//    }
//
//    public void setHarga(int harga) {
//        this.harga = harga;
//    }

    //----------DISPLAY----------
    
    abstract void setVoucher(String voucher);
    abstract void setPaket(String paket);
    abstract void setMasa(String masa);
    abstract void setKode(int kode);
    abstract void setHarga(int harga);
    
    abstract String getVoucher();
    abstract String getPaket();
    abstract String getMasa();
    abstract int getKode();
    abstract int getHarga();


    public String display () {
        return voucher + " | " + paket + " | " + masa + " | " + kode + " |Rp.  " + harga;
    }
}
