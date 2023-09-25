public class pemanggil {
public static void main(String[] args) {

System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");

Karyawan aurel = new Karyawan();

aurel.ID = "K001"; 
aurel.divisi = "Marketing"; 
aurel.nama = "Aurel Dian"; 
aurel.gaji = 2500000;

System.out.println("Data Karyawan :"); 
System.out.println("ID\t: "+aurel.ID); 
System.out.println("Nama\t: "+aurel.nama); 
System.out.println("Divisi\t: "+aurel.divisi); 
System.out.println("Gaji\t: "+aurel.gaji);
}   
}
