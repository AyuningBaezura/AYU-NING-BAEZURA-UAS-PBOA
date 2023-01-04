public class pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajipokok;
    private double gajiBersih;


    public pegawai (String nama, String jabatan, double pjak) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;
    }


    public void setGajiPokok(double gajipokok){
        this.gajipokok;
    }


    public double getGajiBersih() {
        return gajiBersih;
    }

    void display (){
        gajiBersih = (gajipokok*pajak) - gajipokok;
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Bersih " + gajiBersih);
    }

    public Static void main(String[] args) {
        pegawai pegawai = new pegawai(nama: "Adam", jabatan: "Direktur," pajak: 5000); 
        pegawai.setGajipokok(gajipokok 20.000000);
        pegawai.display

}
