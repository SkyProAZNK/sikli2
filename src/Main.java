public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("задача 1");

        int deposit = 15_000;
        int total = 0;
        int mounts = 0;
        while (total <= 2_459_000) {
            total += total / 100;
            total += deposit;
            mounts += +1;
            System.out.println("Месяц " + mounts + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("задача 2");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("задача 3");

        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 2024; year <= 2034; year++) {
            int births = population * birthRate / 1000;
            int deaths = population * deathRate / 1000;
            population += births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("задача 4 и 5"); //можно ли совместить эти две задачи в одну? добавил всего одну строчку
        //чтобы сделать для пятого задания вывод в консоль каждого 6 месяца
        int initialDeposit = 15000;
        double interestRate = 0.07;
        int currentAmount = initialDeposit;
        int months = 0;
        while (currentAmount < 12_000_000) {
            months++;
            double interest = currentAmount * interestRate;
            currentAmount += interest;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ": " + currentAmount + " рублей");
            }
        }

        System.out.println("задача 6");

        int initialAmount = 15000;
        interestRate = 0.07;
        int savings = initialAmount;
        for (int year = 1; year <= 9; year++) {
            for (int month = 1; month <= 12; month++) {
                savings += savings * interestRate;
                if (month % 6 == 0) {
                    System.out.println("За " + year + "- й год, в " + month + "-й месяц, сумма накоплений составит: " + savings + " рублей.");
                }
            }
        }
        System.out.println("задача 7");

        int firstFriday = 1;
        for (int day = 1; day < 32; day++) {
            if (day % 7 == firstFriday || day == firstFriday) {
                System.out.println("Сегодня пятница, " + (day) + " число. Необходимо подготовить отчет. ");
            }
        }
        System.out.println("задача 8");

        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for ( int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}