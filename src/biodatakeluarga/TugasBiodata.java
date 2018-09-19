
package biodatakeluarga;

public class TugasBiodata {
    public static void main (String[] args){
        BiodataKeluarga bk = new BiodataKeluarga();
        
        bk.setNamaAyah("Agus Budhoyo");
        bk.setNamaIbu("Ita Nurdiana");
        bk.setNamaSaudara("Hakim, Syifa, Nuzul");
        bk.setNamaSaya("Rizky");
        bk.setAlamat("Jl Kh Ahmad Dahlan No 16");
        bk.setTanggalLahir("10 Januari 2003");
        bk.setHobi("Basket, Bermain Gitar");
        bk.setCitaCita("Pengusaha sukses");
        bk.setNoTelepon("081358896016");
        
        System.out.println("Nama Ayah               :" + bk.getNamaAyah());
        System.out.println("Nama Ibu                :" + bk.getNamaIbu());
        System.out.println("Nama Saudara            :" + bk.getNamaSaudara());
        System.out.println("Nama Saya               :" + bk.getNamaSaya());
        System.out.println("Nama Alamat             :" + bk.getAlamat());
        System.out.println("Nama Tanggal Lahir      :" + bk.getTanggalLahir());
        System.out.println("Nama Hobi               :" + bk.getHobi());
        System.out.println("Nama Cita-Cita          :" + bk.getCitaCita());
        System.out.println("Nama Nomor Telepon      :" + bk.getNoTelepon());
    }
}


