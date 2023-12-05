public class Switch {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai){
            case "A":
                System.out.println("nilai anda baik terus pertahankan");
                break;
            case "B" :
                System.out.println("nilai anda baik terus tingkatkan");
                break;
            case "C":
                System.out.println("Nilai anda cukup terus semangat");
            default:
                System.out.println("nilai anda belum cukup");
        }
    }
}
