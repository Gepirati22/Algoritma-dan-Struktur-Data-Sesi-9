import java.util.ArrayDeque;

public class Todolist1 {
    public static void main(String[] args) throws Exception{
        ArrayDeque<String> rutinitas = new ArrayDeque<>();


        //Menambahkan rutinitas dengan fungsi add
        rutinitas.add("Bangun Tidur");
        rutinitas.add("Mandi");
        rutinitas.add("Shalat subuh");
        rutinitas.add("Sarapan)");
        rutinitas.add("Bantu pekerjaan rumah");
        rutinitas.add("Belajar");
        rutinitas.add("Solat Dzuhur");
        rutinitas.add("Rebahan");
        rutinitas.add("Makan siang");
        rutinitas.add("Solat Ashar");
        rutinitas.add("Main/Kuliah");
        rutinitas.add("Solat magrib - Isya");
        rutinitas.add("Mengerjakan tugas");
        rutinitas.add("Tidur");
        
        //Output
        System.out.println("==========================");
        System.out.println("rutinitas sehari hari");
        System.out.println("==========================");
        while(!rutinitas.isEmpty()){
            System.out.println(rutinitas.poll());
        }
    }
}
