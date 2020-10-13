package _7_Polimorfisme_Prak;
public class Non_Member extends Induk{
    public Non_Member(){}
    public Non_Member(String Nama, String NIK, String No_HP, String Alamat){
        super(Nama, NIK, No_HP, Alamat);
    }
    
    @Override
    public void PesanAll(int macamKamar, String Hari){
        System.out.println("Jumlah Jenis Kamar : " + macamKamar);
        n = new int[macamKamar];
        TarifKamar = new double[macamKamar];
        JenisKamar = new String[macamKamar];
        System.out.println("Format Pesan Kamar : <jumlah> (spasi) <tipe>");
        this.Hari = Hari;
        for (int i = 0; i < macamKamar; i++) {
            System.out.print("   "+(i+1) + ". ");
            n[i] = in.nextInt();
            JenisKamar[i] = in.next(); 
            CountFasilitasAndMakan(JenisKamar[i],n[i]);
            JumlahKamar += n[i];
        if(JumlahKamar <= 5){
            SetHargaKamar(i);
        }
        else{System.out.println("Jumlah Kamar Melebihi Limit"); break;}
        }
        System.out.print("Tambah Fasilitas / Makanan ? Y / N : ");
        String Tambah = in.next();
        if(Tambah.equals("Y")){
            setTambahFasilitasAndMakan();
            System.out.print("Tambah Lagi ? Y / N : ");
            Tambah = in.next();
            if(Tambah.equals("Y")){
            setTambahFasilitasAndMakan();
            }
        }
        setTotal();    
        setDiskonTotal();
    }
    
    @Override
    public void setDiskonTotal(){}
    
    @Override
    public void TampilkanInfo(){
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i]; j++) {
                System.out.println("\t"+JenisKamar[i] + " : " + TarifKamar[i]);
            }
        }
        System.out.println("Total : " + getTotal());
        System.out.println("Diskon Member : " + getDiskon());
        System.out.println("Biaya kamar : " + getTotalTerdiskon());
        System.out.println("Fasilitas diperoleh : ");
        System.out.println(" - ");
        System.out.println("Tambahan pesanan fasilitas : ");
        if(nPlusFasilitas.length != 0){
            for (int i = 0; i < nPlusFasilitas.length; i++) {
                System.out.println("\t"+FasilitasPlus[i] + " " + nPlusFasilitas[i] + " x " + Tarif_Fasilitas[i] + " = " + (nPlusFasilitas[i] * Tarif_Fasilitas[i]));
            }
        }
        else{System.out.println(" - ");}
        System.out.println("Voucher makan diperoleh : ");
        for (int i = 0; i < Makan.length; i++) {
            if(i < 1){
            System.out.println((i+1) +". " + Makan[i] + " : " + JumlahMakan[i] + " (Free)");
            }
            else{
            System.out.println((i+1) +". " + Makan[i] + " : " + JumlahMakan[i]);
            }
        }
        System.out.println("Tambahan pesanan makanan : ");
        if(nPlusMakan.length != 0){
            for (int i = 0; i < nPlusMakan.length; i++) {
                System.out.println((i+1) +". "+ MakanPlus[i] + " " + nPlusMakan[i] + " x " + Tarif_Makan[i] + " = " + (nPlusMakan[i] * Tarif_Makan[i]));
            }
        }
        else{
            System.out.println(" - ");
        }
        System.out.println("Total yang harus dibayarkan : " + getTotalTerdiskonPlusTambahan());
    }
    
    @Override
    public String toString() {
        return (super.toString() + 
                "\nStatus Member : Non - Member" +
                "\nJumlah Pesan Kamar : " + JumlahKamar);
    }

    @Override
    public void CountFasilitasAndMakan(String JenisKamar, int n) {
        if(JenisKamar.equals("Suite")){
            JumlahMakan[0] += 6 * n;
        }
        else if(JenisKamar.equals("Double")){
            JumlahMakan[0]     += 2 * n;
        }
        else{
            JumlahMakan[0]     += 1 * n;
        }
    }
    
    @Override
    public void setTambahFasilitasAndMakan(){
        System.out.print("Jenis Tambahan : "); 
        String Jenis = in.next();
        System.out.print("Jumlah macam tambahan : ");
        int Jumlah = in.nextInt();
        if(Jenis.equals("Fasilitas")){
            nPlusFasilitas = new int[Jumlah];
            FasilitasPlus = new String[Jumlah];
            System.out.println("Format Pesan Tambahan : <jumlah> (spasi) <tipefasilitas>");
            for (int i = 0; i < Jumlah; i++) {
                System.out.print((i+1) + ". "); nPlusFasilitas[i] = in.nextInt();
                FasilitasPlus[i] = in.nextLine(); 
                JumlahFasilitasNonFree[i] += nPlusFasilitas[i];
            }
        }
        else{
            nPlusMakan = new int[Jumlah];
            MakanPlus = new String[Jumlah];
            System.out.println("Format Pesan Tambahan : <jumlah> (spasi) <TipeVoucherMakan>");
            for (int i = 0; i < Jumlah; i++) {
                System.out.print((i+1) + ". "); nPlusMakan[i] = in.nextInt();
                MakanPlus[i] = in.next(); 
                JumlahMakanNonFree[i] += nPlusMakan[i];
            }
        }
    }
}
