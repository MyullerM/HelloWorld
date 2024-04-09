public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println( dog);
        System.out.println( cat);
        System.out.println( paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println( dog);
        System.out.println( cat);
        System.out.println( paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println( dog);
        System.out.println( cat);
        System.out.println( paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println( friend);
        friend = friend + 2;
        System.out.println( friend);
        friend = friend / 7;
        System.out.println( friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println( frog);
        frog = frog * 10;
        System.out.println( frog);
        frog = frog / 3.5;
        System.out.println( frog);
        frog = frog + 4;
        System.out.println( frog);
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        System.out.println( "масса первого боксера " + boxer1);
        var boxer2 = 82.7;
        System.out.println( "масса второго боксера "  + boxer2);
        var totalWeight = boxer1 + boxer2;
        System.out.println( "Общая масса двух бойцов " + totalWeight + " кг ");
        var difference = boxer2 - boxer1;
        System.out.println( "Разница между массами бойцов" + difference + " кг ");
        System.out.println("Задача 7");
        var b1 = 78.2;
        System.out.println( b1);
        var b2 = 82.7;
        System.out.println( b2);
        var remainder = b2 / b1;
        System.out.println( "Остаток от деления между двумя весами" + remainder);
        System.out.println("Задача 8");
        var totalWorkHour = 640;
        System.out.println( "Всего часов работы " + totalWorkHour);
        var totalEmployee = totalWorkHour / 8;
        System.out.println( "Всего работников в компании - " + totalEmployee + "человек ");
        totalEmployee = totalEmployee + 94;
        System.out.println( " Всего сотрудников в компании " + totalEmployee);
        totalWorkHour = totalWorkHour / 174;
        System.out.println( " Если в компании работает - " + totalEmployee + "человека, то всего " + totalWorkHour + "часа работы может быть поделено между сотрудниками.");


    }
}