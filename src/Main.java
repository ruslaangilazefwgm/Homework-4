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

        // Задание 2. Задача 1
        System.out.println("Задание 2. Задача 1");

        int age3 = 16;
        if (age3 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задача 2.
        System.out.println("Задача 2");

        int age4 = 50;
        if (age4 >= 7 & age4 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age4 >= 18 & age4 < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        else  {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        // Задача 3
        System.out.println("Задача 3");

        int sitPlace1 = 150;
        if (sitPlace1 <= 60) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (sitPlace1 > 60 & sitPlace1 <= 102) {
            System.out.println("В вагоне есть стоячее место");
        }
        else  {
            System.out.println("В вагоне нет мест");
        }

        // Задание 3. Задача 1
        System.out.println("Задание 3. Задача 1");

        int newAge = 24;
        if (newAge >= 2 && newAge <= 6) {
            System.out.println("Если возраст человека равен " + newAge + " ,то ему нужно ходить в детский сад");
        }
        if (newAge >= 7 && newAge < 18) {
            System.out.println("Если возраст человека равен " + newAge + " ,то ему нужно ходить в школу");
        }
        if (newAge >= 18 && newAge < 24) {
            System.out.println("Если возраст человека равен " + newAge + " ,то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + newAge + " ,то ему нужно ходить на работу");
        }

        //Задача 2
        System.out.println("Задача 2");


    }
}