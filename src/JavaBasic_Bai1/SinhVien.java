package JavaBasic_Bai1;

public class SinhVien {

    String name = "Pham Thi Phuong Khanh";
    static String subject = "Selenium Java";

    public void getAge(){
        int age = 29;
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        SinhVien name = new SinhVien();
        SinhVien age = new SinhVien();

        System.out.println("Name: " + name.name);
        age.getAge();
        System.out.println("Subject: " + subject);
        System.out.println("Course: " + ThongTin.COURSE);
        System.out.println("Teacher: " + ThongTin.TEACHER_NAME);

    }
}
