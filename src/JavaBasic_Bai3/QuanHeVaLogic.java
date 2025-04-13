package JavaBasic_Bai3;

public class QuanHeVaLogic {

    int a = 10;
    int b = 5;
    int c = 15;
    static int number = 100;

    public void baiTap3(int n) {
        if (n == number) {
            System.out.println("Giá trị của n = " + number);
        } else if (n < number) {
            System.out.println("Giá trị của n < " + number);
        } else {
            System.out.println("Giá trị của n > " + number);
        }

    }

    public static void main(String[] args) {

        QuanHeVaLogic tinhToan = new QuanHeVaLogic();
        System.out.println("Check if a = b: " + (tinhToan.a == tinhToan.b));
        System.out.println("Test 1: " + ((tinhToan.a == tinhToan.c) || (tinhToan.b != tinhToan.c)));
        System.out.println("Test 2: " + ((tinhToan.a > 5) && (tinhToan.b <= 5)));

        tinhToan.baiTap3(15);
        tinhToan.baiTap3(115);
        tinhToan.baiTap3(100);

    }
}
