import java.util.Scanner;

public class CaculateLoanInterest {
    public static void main(String[] args) {
        // Khai báo biến money vs kiểu số thực(double)
        double money =1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        //nhập số tiền muốn gửi
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        // Nhập số tháng muốn gửi
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        //Nhập lãi suất
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        // Tính lãi suất nhận được
        double totalInterest = 0;
        for (int i = 0; i< month; i++){
            totalInterest+= money *(interestRate/100)/12 * month;
        }
        // In ra lãi suất
        System.out.println("Total of interest: "+totalInterest);

    }
}
