import java.util.Scanner;

public class Menu {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            System.out.println("1: Hiển thị danh sách sinh viên");
            System.out.println("2: Xem thông tin chi tiết 1 sinh viên");
            System.out.println("3: Thêm mới sinh viên");
            System.out.println("4: Sửa thông tin sinh viên đang có trong hệ thống");
            System.out.println("5: Xóa sinh viên");

            System.out.print("Nhap so: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Hiển thị danh sách sinh viên");
                    break;
                case 2:
                    System.out.println("Xem thông tin chi tiết 1 sinh viên");
                    break;
                case 3:
                    System.out.println("Thêm mới sinh viên");
                    break;
                case 4:    
                    System.out.println("Sửa thông tin sinh viên đang có trong hệ thống");
                    break;
                case 5:
                    System.out.println("5: Xóa sinh viên");
                    break;
                default:
                    System.exit(0);
            }
            
            System.out.println();
        }
    }
}

