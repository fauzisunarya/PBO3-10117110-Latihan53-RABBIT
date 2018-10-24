/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Mendeskripsikan
 * Kelinci Dengan Menggunakan Konsep OOP inheritance,olymorphism dan constructor
 */
package pbo3.pkg10117110.latihan53.rabbit;


public class PBO310117110Latihan53RABBIT {

 
    public static void main(String[] args) {
        
        Rabbit obj = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, His name is "+obj.getName());
        System.out.println(obj.getName()+" is Vegetarian? "+obj.vegetarian);
        System.out.println(obj.getName()+" eats "+obj.getEats());
        System.out.println(obj.getName()+" has "+obj.getNoOflegs()+" legs");
        System.out.println(obj.getName()+" color is "+obj.getColor());

    }
    
}
