public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 19;
        if (age >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        // Задание  2
        int ages = 26;
        if (ages >= 7)
            if (ages < 18)   {
                System.out.println("ребенок ходит в школу");
        }
        if (ages >= 18)
            if (ages < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (ages >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
    }
}