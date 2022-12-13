public class Main {
    public static void main(String[] args) {
        task1();
        task1_1();
        task1_2();
        task2();
        task2_2();
        task3();
        task3_1();
        task3_2();
        task4();
        task4_1();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
    }

    //2-ая часть
    public static void task1_1() {
        System.out.println("Задание 1_1");
        double[] arr = {1.57, 7.654, 9.986};
    }

    public static void task1_2() {
        System.out.println("Задание 1_2");
        int[] januaryFriday = {6, 13, 20, 27};

    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n]);
            if (n != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task2_2() {
        System.out.println("Задание 2_2");
        int[] januaryFriday = {6, 13, 20, 27};
        for (int i = 0; i < januaryFriday.length; i++) {
            System.out.print(januaryFriday[i]);
            if (i != januaryFriday.length-1)
                System.out.print(", ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3_1() {
        System.out.println("Задание 3_1");
        double[] arr = {1.57, 7.654, 9.986};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3_2() {
        System.out.println("Задание 3_2");
        int[] januaryFriday = {6, 13, 20, 27};
        for (int i = januaryFriday.length-1; i>=0 ; i--) {
            System.out.print(januaryFriday[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i <= numbers.length-1; i++) {
            if (numbers[i]%2==0){
                System.out.print(numbers[i]);
            } else {
                numbers[i]++;
                System.out.print(numbers[i]);
            }
            if (i != numbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4_1() {
        System.out.println("Задание 4_1");
        int[] januaryFriday = {6, 13, 20, 27};
        for (int i = 0; i <= januaryFriday.length-1; i++) {
            if (januaryFriday[i]%2==0){
                System.out.print(januaryFriday[i]);
            } else {
                januaryFriday[i]++;
                System.out.print(januaryFriday[i]);
            }
            if (i != januaryFriday.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

