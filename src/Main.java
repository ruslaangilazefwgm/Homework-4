public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age <= 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задача 2
        System.out.println("Задача 2");

        int age2 = 50;
        if (age2 >= 7 & age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 & age2 < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        // Задача 3
        System.out.println("Задача 3");

        int sitPlace = 150;
        if (sitPlace <= 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (sitPlace > 60 & sitPlace <= 102) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (sitPlace > 102) {
            System.out.println("В вагоне нет мест");
        }
    }
}