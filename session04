package session04_Kha1;

import java.util.Scanner;

public class session04_kha1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[n];

        // Nhập giá trị từng phần tử
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] = ", i);
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        // Thuật toán sắp xếp nổi bọt giảm dần
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                // Đổi chỗ nếu phần tử trước nhỏ hơn phần tử sau
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
