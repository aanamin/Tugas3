import java.util.LinkedList;

public class LinkedListTambahan {
    public static void main(String[] args) throws Exception {
        LinkedList <String> Nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> NIM_mahasiswa = new LinkedList<String>();
        LinkedList <String> Alamat_mahasiswa = new LinkedList<String>();
    
        Nama_mahasiswa.add("Al - Amin");
        NIM_mahasiswa.add("2111521017");
        Alamat_mahasiswa.add("Air Tawar Barat");

        System.out.println("Nama Mahasiswa   : " + Nama_mahasiswa);
        System.out.println("NIM Mahasiswa    : " + NIM_mahasiswa);
        System.out.println("Alamat Mahasiswa : " + Alamat_mahasiswa);
        System.out.println(" ");

        //menambahkan data baru dengan menyertakan index yang diinginkan
        System.out.println("menambahkan data baru dengan menggunakan add(index, element)");
        Nama_mahasiswa.add(1, "M Dzaki Dinnul Haq");
        NIM_mahasiswa.add(1, "2111522015");
        Alamat_mahasiswa.add(1, "Balai Baru");
        Nama_mahasiswa.add(0, "Nadini Annisa Byant");
        NIM_mahasiswa.add(0, "2111522021");
        Alamat_mahasiswa.add(0, "jl. alai timur B/11");
        
        System.out.println("Nama Mahasiswa   : " + Nama_mahasiswa);
        System.out.println("NIM Mahasiswa    : " + NIM_mahasiswa);
        System.out.println("Alamat Mahasiswa : " + Alamat_mahasiswa);
        System.out.println("");        
        
        //Menambahkan data baru pada index pertama dan terakhir
        System.out.println("Menambahkan data baru pada index pertama dan terakhir menggunakan addFirst, AddLast, push dan offer");
        Nama_mahasiswa.addFirst("Nadia Nur Saida");
        Nama_mahasiswa.addLast("Rafiqatul Ulya");
        NIM_mahasiswa.push("2111521007");
        NIM_mahasiswa.offer("2111522003");
        Alamat_mahasiswa.push("Jln Aru Indah");
        Alamat_mahasiswa.offer("Nagari Kamang Hilia");

        System.out.println("Nama Mahasiswa   : " + Nama_mahasiswa);
        System.out.println("NIM Mahasiswa    : " + NIM_mahasiswa);
        System.out.println("Alamat Mahasiswa : " + Alamat_mahasiswa);
        System.out.println("");

        //Menyisipkan data baru mengunakan set()
        System.out.println("Menyisipkan data baru mengunakan set()");
        Nama_mahasiswa.set(2, "Nurul Insan");
        NIM_mahasiswa.set(2, "2111522013");
        Alamat_mahasiswa.set(2, "Jln Koto Panjang");
        Nama_mahasiswa.set(3, "Azzahra Athifah Dzaki");
        NIM_mahasiswa.set(3, "2111521009");
        Alamat_mahasiswa.set(3, "Koto Nan Gadang");

        System.out.println("Nama Mahasiswa   : " + Nama_mahasiswa);
        System.out.println("NIM Mahasiswa    : " + NIM_mahasiswa);
        System.out.println("Alamat Mahasiswa : " + Alamat_mahasiswa);
        System.out.println("");

        //Mengecek ukuran LinkedList
        System.out.println("Mengecek banyaknya data LinkedList");
        System.out.println("Banyaknya nama   : " + Nama_mahasiswa.size() );
        System.out.println("Banyaknya nim    : " +  NIM_mahasiswa.size());
        System.out.println("Banyaknya alamat : " + Alamat_mahasiswa.size());

        //menghapus elemen pada linkedlist
        System.out.println("");
        System.out.println("Menghapus data pada linkedlist");
        Nama_mahasiswa.removeLast();
        NIM_mahasiswa.removeLast();
        Alamat_mahasiswa.removeLast();

        System.out.println("Nama Mahasiswa   : " + Nama_mahasiswa);
        System.out.println("NIM Mahasiswa    : " + NIM_mahasiswa);
        System.out.println("Alamat Mahasiswa : " + Alamat_mahasiswa);
        System.out.println("");

        //mengecek elemen paling depan pada linkedlist
        System.out.println("mengecek elemen paling depan pada linkedlist : " + Nama_mahasiswa.peek());
        System.out.println("mengecek elemen paling depan pada linkedlist : " + NIM_mahasiswa.peek());
        System.out.println("mengecek elemen paling depan pada linkedlist : " + Alamat_mahasiswa.peek());
        
        //mengecek apakah linkedlist kosong
        System.out.println("");
        System.out.println("mengecek apakah data Nama kosong   : " + Nama_mahasiswa.isEmpty());
        System.out.println("mengecek apakah data NIM kosong    : " + NIM_mahasiswa.isEmpty());
        System.out.println("mengecek apakah data alamat kosong : " + Alamat_mahasiswa.isEmpty());
        System.out.println("");

        //mengecek elemen yang ada dalam linkedlist dengan get
        System.out.println("mengecek data pertama pada nama   : " + Nama_mahasiswa.getFirst());
        System.out.println("mengecek data pertama pada NIM    : " + NIM_mahasiswa.getFirst());
        System.out.println("mengecek data pertama pada alamat : " + Alamat_mahasiswa.getFirst());
        System.out.println("mengecek data terakhir pada nama  : " + Nama_mahasiswa.getLast());
        System.out.println("mengecek data terakhir pada NIM   : " + NIM_mahasiswa.getLast());
        System.out.println("mengecek data terakhir pada alamat: " + Alamat_mahasiswa.getLast());
        System.out.println("");
        
        //mengeluarkan top elemen pada linkedlist
        System.out.println("mengeluarkan top elemen pada nama   : " + Nama_mahasiswa.pop());
        System.out.println("mengeluarkan top elemen pada NIM    : " + NIM_mahasiswa.pop());
        System.out.println("mengeluarkan top elemen pada alamat : " + Alamat_mahasiswa.pop());
        System.out.println("");
        System.out.println("Sisa data nama  : " + Nama_mahasiswa);
        System.out.println("Sisa data nim   : " + NIM_mahasiswa);
        System.out.println("Sisa data alamat: " + Alamat_mahasiswa);
        
    }
}
