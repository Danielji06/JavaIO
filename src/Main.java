import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n ; i++){
            String soal = sc.nextLine();
            String[] pecah = soal.split("");
            if (Integer.parseInt(pecah[2])==Math.sqrt(Math.pow(Integer.parseInt(pecah[0]),2)+Math.pow(Integer.parseInt(pecah[1]),2))){
                System.out.println("ya");
            } else {
                System.out.println("tidak");
            }
        }
    }
}