import java.util.Scanner;

public class HienThi20SoNguyenDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();

        if (number >= 2) {
            for (int i = 2; i < 22 ; i++) {
                System.out.println("Số hiển thị là: " + i);
            }
        } else {
            System.out.println("Error");
        }
    }
}
