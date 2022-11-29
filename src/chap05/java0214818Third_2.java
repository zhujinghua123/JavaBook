package chap05;

import java.util.*;

/**
 * @Description 第五章
 * @Author 住京华
 * @Date 2022/11/15-10:47
 */
public class java0214818Third_2 {
    //5.43
    static void problem5_43() {

        int n = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                if (i != j) {
                    System.out.println(i + " " + j);
                    n++;
                }
            }
        }
        System.out.println("total" + n);
    }

    //5.48
    static void problem5_48() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }

        }
        System.out.println();
    }

    //5.9
    static void problem5_9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n = sc.nextInt();
        Student[] stu = new Student[n];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " student's name and score:");
            stu[i].name = sc.next();
            stu[i].score = sc.nextDouble();
        }
        Comparator<Student> tmp = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score > o2.score) {
                    return -1;
                } else if (o1.score < o2.score) {
                    return 1;
                }
                return 0;
            }
        };
        Arrays.sort(stu, tmp);
        for (int i = 0; i < 2; i++) {
            System.out.println(stu[i]);
        }
    }

    //5.37
    static void problem5_37() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (num != 0) {
            arr.add(num % 2);
            num /= 2;
        }
        Collections.reverse(arr);
        for (Integer i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    //5.14
    static void problem5_14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("The GCD is:" + i);
                break;
            }
        }
    }

    //5.3
    static void problem5_3() {
        System.out.printf("%-10s %8s\n", "千克", "磅");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%-10d %10.1f\n", i, i * 2.2);
        }
    }

    //5.4
    static void problem5_4() {
        System.out.printf("%-10s %-6s\n", "英里", "千米");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%-10d %-10.3f\n", i, i * 1.609);
        }
    }

    //5.1
    static void problem5_1() {
        Scanner sc = new Scanner(System.in);
        int zhen = 0, fu = 0, total = 0;
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("Enter an int,the input ends if it is 0:");
        for (; ; ) {
            int tmp = sc.nextInt();
            if (tmp == 0) {
                break;
            } else {
                num.add(tmp);
            }

        }
        for (Integer integer : num) {
            if (integer > 0) {
                zhen++;
            } else {
                fu++;
            }
            total += integer;
        }
        double average = (double) total / num.size();
        System.out.println("The number of positives is:" + zhen);
        System.out.println("The number of negatives is:" + fu);
        System.out.println("The total is:" + total);
        System.out.print("The average is:" + average);

    }

    public static void main(String[] args) {
        problem5_43();
        problem5_48();
        problem5_9();
        problem5_37();
        problem5_14();
        problem5_3();
        problem5_4();
        problem5_1();
    }

    public static class Student {
        String name;
        double score;

        @Override
        public String toString() {
            return "Name:" + name + "   " + "Score:" + score;
        }
    }
}
