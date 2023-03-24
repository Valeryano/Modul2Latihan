import java.util.LinkedList;


public class Modul2Latihan {
    public static void main(String[] args) {
        LinkedList<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama Hewan Yang DiTambahakan : ");
        System.out.println(hewan);

        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        LinkedList<String> deletedData = new LinkedList<>();

        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(deletedData);
        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
}