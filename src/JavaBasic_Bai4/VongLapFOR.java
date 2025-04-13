package JavaBasic_Bai4;

public class VongLapFOR {
    public static void main(String[] args) {

        int arr[] = new int[26];
        int index = 0;


        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                arr[index] = i; //Gán giá trị số chẵn vào vị trí mảng tuần tự
                index++; //Tăng biến chỉ mục lên 1 đơn vị
            }

        }

        System.out.println("");

//        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50};
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
