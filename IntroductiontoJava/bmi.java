import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Moi nhap vao can nang");
        weight = scanner.nextDouble();
        System.out.println("Moi nhap vao chieu cao");
        height = scanner.nextDouble();
        bmi= weight/(height*height);
        if (bmi<18.5){
            System.out.println("Thieu can");
        }
        else {
            if (bmi<25){
                System.out.println("Binh thuong");
            }
            else {
                if (bmi<30){
                    System.out.println("Qua can");
                }
                else {
                    System.out.println("Beo phi");
                }
            }
        }
    }
}