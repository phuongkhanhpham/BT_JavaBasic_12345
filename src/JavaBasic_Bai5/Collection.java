package JavaBasic_Bai5;

import java.lang.reflect.Array;
import java.util.*;

public class Collection {

    private static List<String> addInfo(String name, String role, String department) {
        List<String> info1 = new ArrayList<>();

        info1.add(name);
        info1.add(role);
        info1.add(department);

        return info1;
    }

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();

        //Kiểm tra số chẵn, add vào ArrayList
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arr1.add(i);
            }
        }

//        System.out.println(arr1);

        //Duyệt giá trị trong ArrayList
        for (int duyetMang : arr1) {
            System.out.print(duyetMang + "\t");
        }

//        Map<String, String> info = new HashMap<>();
//
//        info.put("Name", "Pham Thi Phuong Khanh");
//        info.put("Role", "QA");
//        info.put("Department", "UPD");

//        for (int i = 0; i < info.size(); i++) {
//            System.out.println(info);
//        }

        System.out.println("\n-------------------------");

        List<String> info2 = addInfo("Pham Thi Phuong Khanh", "QA", "UPD");

        for (int i = 0; i < info2.size(); i++) {
            System.out.println(info2.get(i));
        }

        System.out.println("-------------------------");

        List<String> info3 = addInfo(
                "Nguyen Dang Hoang Phung",
                "Sale Support",
                "Lotte");

        for (String value : info3) {
            System.out.println(value);
        }

        System.out.println("-------------------------");

        for (String value1 : addInfo("Pham Phuong Thao", "Student", "Phuoc Long")) {
            System.out.println(value1);
        }

        System.out.println("-------------------------");
        //Add value when init ArrayList
        List<String> s1 = new ArrayList<>(Arrays.asList("Selenium", "Java"));
        List<String> s2 = s1;
        System.out.println(s2);

    }
}
