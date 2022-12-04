public class Main {
    public static void main(String[] args) {
        // Задание 1-1
        System.out.println("Задание 1");
        int age = 9;
        if (age >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        // Задание  1-2
        System.out.println("Задание 2");
        int ages = 20;
        if (ages >= 7)
            if (ages < 18) {
                System.out.println("ребенок ходит в школу");
            }
        if (ages >= 18)
            if (ages < 24) {
                System.out.println("человек уже закончил школу и может отправляться в университет");
            }
        if (ages >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        // Задание 1-3
        System.out.println("Задание 3");
        int OneVan = 61;
        if (OneVan < 60) {
            System.out.println("есть место в вагоне: сидячее");
        }
        if (OneVan > 60)
            if (OneVan < 102) {
                System.out.println("есть место в вагоне: стоячее");
            }
        if (OneVan > 102) {
            System.out.println("мест в вагоне нет");
        }
        // Задание 2-1
        System.out.println("Задание 2-1");
        int age1 = 23;
        if (age1 >= 18) {
            System.out.println("поздравляем с совершеннолетием!");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
// Задание 2-2
        System.out.println("Задание 2-2");
        int ages1 = 20;
        if (ages1 >= 7)
            if (ages1 < 18) {
                System.out.println("ребенок ходит в школу");
            } else {
                if (ages1 < 24) {
                    System.out.println("человек уже закончил школу и может отправляться в университет");
                } else {
                    if (ages1 >= 24) {
                        System.out.println("человек окончил университет и ему пора искать первую работу");
                    }
                }
            }
        // Задание 2-3
        System.out.println("Задание 2-3");
        int OneVan1 = 105;
        if (OneVan1 < 60) {
            System.out.println("есть место в вагоне: сидячее");
        } else {
                System.out.println("есть место в вагоне: стоячее");
            }
        if (OneVan1 > 102) {
            System.out.println("мест в вагоне нет");
        }
        // Задание 3-1
        System.out.println("Задание 3-1");
        int age2 = 6;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("человеку нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 < 18) {
                System.out.println("человеку нужно ходить в школу");
            } else if (age2 > 18 && age2 < 24) {
                System.out.println("человеку нужно ходить в университет");
            } else if (age2 > 24) {
            System.out.println("человеку пора на работу");
        }



    }
}