
package posttest6;

public class Pulsa extends Voucher implements Data{
    protected String provider;
    protected int notujuan;

    public String getProvider() {
        return provider;
    }

    public int getNotujuan() {
        return notujuan;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setNotujuan(int notujuan) {
        this.notujuan = notujuan;
    }

    public Pulsa(String provider, int notujuan, String voucher, String paket, String masa, int kode, int harga) {
        super(voucher, paket, masa, kode, harga);
        this.provider = provider;
        this.notujuan = notujuan;
    }
    @Override
    public String toString() {
    return "Pulsa{" +
            "Provider    :'" + provider + '\'' +
            ", NoTujuan :" + notujuan + 
            ", Voucher  :'" + voucher + '\'' +
            ", Paket  :'" + paket + '\'' +
            ", Masa :'" + masa + '\'' +
            ", Kode :" + kode +
            ", Harga :" + harga +
            '}';
    }
    
    @Override
    public void setVoucher(String voucher) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setPaket(String paket) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setMasa(String masa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setKode(int kode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHarga(int harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getVoucher() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getPaket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getMasa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getKode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getHarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//    public String toString() {
//        return super.toString();
//    }
//    @Override
//    public void setHarga(int harga) {
//        super.setHarga(harga); 
//    }
//    @Override
//    public int getHarga() {
//        return super.getHarga(); 
//    }
//    @Override
//    public void setKode(int kode) {
//        super.setKode(kode); 
//    }
//    @Override
//    public int getKode() {
//        return super.getKode(); 
//    }
//    @Override
//    public void setMasa(String Masa) {
//        super.setMasa(Masa); 
//    }
//    @Override
//    public String getMasa() {
//        return super.getMasa(); 
//    }
//    @Override
//    public void setpaket(String paket) {
//        super.setpaket(paket); 
//    }
//    @Override
//    public String getPaket() {
//        return super.getPaket(); 
//    }
//    @Override
//    public void setVoucher(String voucher) {
//        super.setVoucher(voucher); 
//    }
//    @Override
//    public String getVoucher() {
//        return super.getVoucher(); 
//    }
//    
//    
//}