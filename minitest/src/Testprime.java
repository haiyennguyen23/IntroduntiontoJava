import java.util.Scanner;
    public class Testprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Khởi tạo một đối tượng mới
        System.out.print("Enter a number: ");// Khai báo nhập cho number từ bàn phím
        int number = scanner.nextInt();// Khai báo số nguyên number bằng int
        // Nếu trường hợp number nhỏ hơn 2 thì sẽ hiển thị number không phải là số nguyên tố
        if (number <2){
            System.out.println(number+ "is not a prime");
        }
        // Nếu number >=2 thì sẽ hiển thị num là snt
        else{
            int i=2;
            boolean check = true;
            while (i< number){
                // chia lấy số dư
                if (number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number+"is a prime");
            else
                System.out.println(number+"is a prime");
        }
    }
}

