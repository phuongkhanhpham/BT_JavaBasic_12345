package JavaBasic_Bai2;

public class Calculator {

    public int tong2SoNguyen(int soNguyen1, int soNguyen2) {
//        System.out.println("Tổng 2 số nguyên: " + (soNguyen1 + soNguyen2));
        return (soNguyen1 + soNguyen2);
    }

    public double tich2SoThuc(double soThuc1, double soThuc2) {
//        System.out.println("Tich 2 số thực: " + (soThuc1 * soThuc2));
        return (soThuc1 * soThuc2);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.tong2SoNguyen(1, 2));
        System.out.println(calculator.tich2SoThuc(1.1, 2.4));

    }
}
