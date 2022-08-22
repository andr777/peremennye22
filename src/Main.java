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
        System.out.println("Задача 2: ");
        System.out.print("Общий вес: ");
        System.out.println(boxer1 + boxer2);
        System.out.print("разница между весами: ");
        System.out.println(Math.abs( boxer1 - boxer2) );
        System.out.println(" ");
/*
### **Задача 3.**
За весом спортсмена следит не только сам спортсмен, но и его тренер.
Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
– Бананы – 5 штук (1 банан - 80 грамм);
– Молоко – 200 мл (100 мл = 105 грамм);
– Мороженое пломбир – 2 брикета по 100 грамм;
– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
Смешать всё в блендере и готово.
Подсчитайте вес (количество грамм) такого спорт-завтрака,
а затем переведите его в килограммы.
 */
        int banana = 5;
        int milk = 2; // 2*100ml
        int iceCream = 2;
        int egg = 4;

        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        float total = banana*bananaWeight +milk*milkWeight +iceCream*iceCreamWeight +egg*eggWeight;
        System.out.println("Задача 3: ");
        System.out.print("Общий вес в гр: ");
        System.out.println(total);
        System.out.print("Общий вес в кг: ");
        System.out.println( total / 1000 );
        System.out.println(" ");


    }
}