package chap06;

public class Xier {

    public static void main(String[] args) {
        int arr[] = {15, 5, 2, 7, 12, 6, 1, 4, 3, 9, 8, 10};

        print_arr(arr, 12);
        shell_arr(arr, 12);
    }

    //������������ӡ����
    public static void print_arr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\r\n");
    }


    public static void shell_arr(int arr[], int n) {
        int i, j, inc, key;
        // ��ʼ������len/2��ÿһ��֮����Զ�
        for (inc = n / 2; inc > 0; inc /= 2) {
            // ÿһ�˲��ò�������
            for (i = inc; i < n; i++) {
                key = arr[i];
                for (j = i; j >= inc && key < arr[j - inc]; j -= inc)
                    arr[j] = arr[j - inc];
                arr[j] = key;
            }
            print_arr(arr, n);
        }

    }

}
