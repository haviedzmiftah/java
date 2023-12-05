public class ifelse {
    public static void main(String[] args) {
        int a=7;
        int b=2;

        if (a<b){ //kondisi
            System.out.println(a+" lebih kecil dari "+b); //jika kondisi true akan dieksekusi
        }
        else {
            System.out.println(a+" tidak lebih kecil dari pada "+b); //jika kondisi false
        }

        //short if else
        // variable = (kondisi) ? benar : salah;
        int nilai = 74;
        String ucapan = (nilai >= 75) ? "Selamat anda lulus":"anda tidak lulus";
        System.out.println(ucapan);
    }
}
