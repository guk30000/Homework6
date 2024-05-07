public class Main {
    public static void main(String[] args) {

        //Задача 1
        int totalSavings = 0;
        int savingsPerMonth = 15_000;
        int i = 0;
        double rate = 1.01;

        System.out.println("Задача 1");
        while (totalSavings < 2_459_000) {
            totalSavings = (int) (totalSavings * rate);
            totalSavings += savingsPerMonth;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");

        //Задача 2
        i = 1;

        System.out.println("Задача 2");
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 3
        int birthRate = 17;
        int deathRate = 8;
        int population = 12_000_000;
        int year = 1;

        System.out.println("Задача 3");
        for (; year <= 10; year++) {
            population = population + ((population / 1000) * birthRate) - ((population / 1000) * deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //Задача 4
        totalSavings = 15_000;
        rate = 1.07;
        i = 0;

        System.out.println("Задача 4");
        while (totalSavings < 12_000_000) {
            totalSavings = (int) (totalSavings * rate);
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        //Задача 5
        totalSavings = 15_000;
        i = 0;

        System.out.println("Задача 5");
        while (totalSavings < 12_000_000) {
            totalSavings = (int) (totalSavings * rate);
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
            }
        }
        System.out.println("Всего месяцев " + i + ", сумма накоплений равна " + totalSavings + " рублей");

        //Задача 6
        totalSavings = 15_000;
        i = 1;
        int totalMonth = 9 * 12;

        System.out.println("Задача 6");
        for (; i <= totalMonth; i++) {
            totalSavings = (int) (totalSavings * rate);
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений за " + i / 6 + " полугодие равна " + totalSavings + " рублей");
            }
        }

        //Задача 7
        int friday = 2;
        int days = 31;

        System.out.println("Задача 7");
        for (i = 1; i <= days; i++) {
            if ((i + 7 - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число");
            }
        }

        //Задача 8
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        i = startYear;

        System.out.println("Задача 8");
        for (;i <= endYear; i++) {
            if (i % 79 == 0 && i < currentYear) {
                System.out.println("Комета пролетала в " + i + " году");
            } else if (i % 79 == 0 && i >= currentYear) {
                System.out.println("Комета прилетит в следующий раз в " + i + " году");
            }
        }
    }
}