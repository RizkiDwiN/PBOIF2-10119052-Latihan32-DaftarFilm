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
public class Film {
    String nama;
    String genre;
    Double rating;
    int duration;
    
    public void nowPlaying(String nama,String genre , Double rating ,int duration){
     System.out.println("Judul Film : " +nama );
     System.out.println("Genre Film : "+genre);
     System.out.println("Rating Film : "+rating);
     System.out.println("Duration Film : "+duration+ " Menit");
     System.out.println("");
    }
}
