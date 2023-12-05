public class userPass {
    public static void main(String[] args) {
        var username ="A";
        var pass = "d";

        if (username.equals("A") && pass.equals("B")){
            System.out.println("Berhasil Login");
        }
        else {
            System.out.println("username atau password salah");
        }
        System.out.println("Dengan Switch");

        switch(username){
            case "haviedd":
                System.out.println("user name betul");
                break;
            case " ":
                System.out.println("username belum diisi");
                break;
        }
    }

}
