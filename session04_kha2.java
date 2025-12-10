package session04_Kha2;

import java.util.Scanner;

public class session04_kha2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số cột: ");
        int cols = Integer.parseInt(sc.nextLine());

        int[][] numbers = new int[rows][cols];

        // Nhập từng phần tử cho mảng 2 chiều
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("numbers[%d][%d] = ", i, j);
                numbers[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        // Tính tổng chẵn và lẻ
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];
                } else {
                    sumOdd += numbers[i][j];
                }
            }
        }

        // In kết quả
        System.out.println("Tổng các số chẵn: " + sumEven);
        System.out.println("Tổng các số lẻ: " + sumOdd);
    }
}
