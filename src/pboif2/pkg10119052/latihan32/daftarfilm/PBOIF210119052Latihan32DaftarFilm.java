package pboif2.pkg10119052.latihan32.daftarfilm;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * daftar film dari class yang berbeda
 * 
 */
public class PBOIF210119052Latihan32DaftarFilm {

    public static void main(String[] args) {
        Film flm = new Film();
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println("");
        flm.nama="Venom";
        flm.genre="Action , Horor ,Scifi";
        flm.rating=8.5;
        flm.duration=120;
        flm.nowPlaying(flm.nama,flm.genre,flm.rating,flm.duration) ;
        
        Film flm2 = new Film();
        flm2.nama="Small Foot";
        flm2.genre="Animation";
        flm2.rating=9.0;
        flm2.duration=96;
        flm2.nowPlaying(flm2.nama,flm2.genre,flm2.rating,flm2.duration) ;
        
        Film flm3 = new Film();
        flm3.nama="Crazy Rich Asian";
        flm3.genre="Comedy";
        flm3.rating=7.8;
        flm3.duration=119;
        flm3.nowPlaying(flm3.nama,flm3.genre,flm3.rating,flm3.duration) ;
        
        Film flm4 = new Film();
        flm4.nama="Asih";
        flm4.genre=" Horor ";
        flm4.rating=6.0;
        flm4.duration=100;
        flm4.nowPlaying(flm4.nama,flm4.genre,flm4.rating,flm4.duration) ;  
    }
    
}
