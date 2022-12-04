public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 9;
        if (age >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        // Задание  2
        System.out.println("Задание 2");
        int ages = 20;
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
        // Задание 3
        System.out.println("Задание 3");
        int OneVan = 100;
            if (OneVan >= 1)
            if (OneVan < 60)   {
                System.out.println("есть место в вагоне: сидячее");
            }
        if (OneVan >= 60)
            if (OneVan < 102)   {
                System.out.println("есть место в вагоне: стоячее");
            }
        if (OneVan >102)    {
                System.out.println("мест в вагоне нет");
            }
    }
}