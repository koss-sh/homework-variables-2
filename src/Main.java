public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 500;
        byte b = 10;
        short c = 10000;
        long d = 100000L;
        float e = 1.5f;
        double f = 12.258;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        short j = 569;
        int k = -159;
        long l = 27897L;
        int m = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int lpStudents = 23; // количество учеников в классе Людмилы Павловны
        int asStudents = 27; // количество учеников в классе Анны Сергеевны
        int eaStudents = 30; // количество учеников в классе Екатерины Андреевны
        int sheetsCount = 480; // всего листов бумаги закуплено
        int sheetsPerStudent = sheetsCount / (lpStudents + asStudents + eaStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottlesPerMinute = 16 / 2; // производительность в минуту
        int period1 = 20;
        int bottlesPerPeriod1 = bottlesPerMinute * period1;
        System.out.println("За 20 минут машина произвела " + bottlesPerPeriod1 + " штук бутылок");
        int bottlesPerHour = bottlesPerMinute * 60; // производительность в час
        int bottlesPerPeriod2 = bottlesPerHour * 24;
        System.out.println("За сутки машина произвела " + bottlesPerPeriod2 + " штук бутылок");
        int bottlesPerPeriod3 = bottlesPerPeriod2 * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerPeriod3 + " штук бутылок");
        int bottlesPerPeriod4 = bottlesPerPeriod2 * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesPerPeriod4 + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int totalPerSchool = 120; // всего банок краски нужно на школу
        byte whitePerClassroom = 2; // уходит банок белой краски на 1 класс
        byte brownPerClassroom = 4; // уходит банок коричневой краски на 1 класс
        int classrooms = totalPerSchool / (whitePerClassroom + brownPerClassroom); // кол-во классов в школе
        int white = whitePerClassroom * classrooms; // куплено банок белой краски
        int brown = brownPerClassroom * classrooms; // куплено банок коричневой краски
        System.out.println("В школе, где " + classrooms + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananasCount = 5;
        int bananaWeight = 80; // вес 1 банана в граммах
        int milkCount = 200; //кол-во молока в мл
        float milkWeightPerMl = 105f / 100f; // вес 1 мл молока в граммах
        byte icecreamCount = 2; // кол-во брикетов мороженого
        int icecreamWeight = 100; // вес 1 брикета мороженого в граммах
        byte eggsCount = 4;
        int eggWeight = 70; // вес 1 яйца в граммах
        float totalWeightGram = bananasCount * bananaWeight + milkCount * milkWeightPerMl + icecreamCount * icecreamWeight + eggsCount * eggWeight;
        float totalWeightKg = totalWeightGram / 1000;
        System.out.println("Вес спортзавтрака составляет " + totalWeightGram + " грамм, или " + totalWeightKg + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weghtLossGoal = 7; // сколько кг нужно сбросить
        int minDayLoss = 250; // минимальная дневная потеря веса при данной диете в граммах
        int maxDayLoss = 500; // максимальная дневная потеря веса при данной диете в граммах
        int averageDayLoss = (minDayLoss + maxDayLoss) / 2; // средняя дневная потеря веса при данной диете в граммах
        float daysCount1 = weghtLossGoal / (minDayLoss / 1000f);
        System.out.println("Если спортсмен будет терять по " + minDayLoss + " грамм, то на похудение уйдет " + daysCount1 + " дней");
        float daysCount2 = weghtLossGoal / (maxDayLoss / 1000f);
        System.out.println("Если спортсмен будет терять по " + maxDayLoss + " грамм, то на похудение уйдет " + daysCount2 + " дней");
        float daysCountAverage = weghtLossGoal / (averageDayLoss / 1000f);
        System.out.println("Чтобы добиться результата похудения, в среднем потребуется " + daysCountAverage + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760; // текущая зарплата Маши
        int denisSalary = 83690; // текущая зарплата Дениса
        int kristinaSalary = 76230; // текущая зарплата Кристины
        float salaryIndex = 1.1f;
        float mashaNewSalary = mashaSalary * salaryIndex;
        float denisNewSalary = denisSalary * salaryIndex;
        float kristinaNewSalary = kristinaSalary * salaryIndex;
        float mashaIncomeDifference = mashaNewSalary * 12 - mashaSalary * 12;
        float denisIncomeDifference = denisNewSalary * 12 - denisSalary * 12;
        float kristinaIncomeDifference = kristinaNewSalary * 12 - kristinaSalary * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaIncomeDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncomeDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaIncomeDifference + " рублей");
    }
}