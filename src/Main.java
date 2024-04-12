public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int payments [] = {13500, 12800, 15000, 14555, 18900};
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task2
        System.out.println("Task 2");
        int max = payments[0];
        int min = payments[0];
        for (int i = 0; i < 5; i++) {
            if (payments[i] <= min){
                min = payments[i];
            }
            if (payments[i] >= max){
                max = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        //task3
        System.out.println("Task 3");
        double averageValue = (double) sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рубль");

        //task4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}