public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!111");

// задача 1
        //Целые числа - byte, short, int, long.
        // Числа с плавающей точкой (иначе вещественные) - float, double.
        // Логический - boolean

        byte q = 1;
        short w = 2;
        int e = 3;
        long r = 4;

        float t = 5;
        double y = 6;

        boolean u = false;

        char i = 'a';

//задача 2
        /*
        Вес одного боксера – 78,2 кг
        Вес второго боксера – 82,7 кг
        Подсчитайте и выведите в консоль общий вес двух бойцов.
                Подсчитайте и выведите в консоль разницу между весами бойцов.
        */
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        System.out.print("Общий вес: ");
        System.out.println(boxer1 + boxer2);
        System.out.print("разница между весами: ");
        System.out.println(Math.abs( boxer1 - boxer2) );



    }
}