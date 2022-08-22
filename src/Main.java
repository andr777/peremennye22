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

        System.out.println("Задача 1: ");
        System.out.println( q);
        System.out.println( w);
        System.out.println( e);
        System.out.println( r);
        System.out.println( t);
        System.out.println( y);
        System.out.println( u);
        System.out.println( i);
        System.out.println(" ");


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
/* ### **Задача 4.**
Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
чтобы оставаться в своей весовой категории.
Тренер скорректировал рацион так, чтобы спортсмен мог
терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдёт на похудение,
если спортсмен будет терять каждый день по 250 грамм
и сколько, если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.  */
        float weight = 7f;
        float minusweight1 = 0.250f;
        float minusweight2 = 0.500f;
        float day1;
        float day2;
        day1 = weight / minusweight1;
        day2 = weight / minusweight2;
        System.out.println("Задача 4: ");
        System.out.print("дней 1: ");
        System.out.println(day1);
        System.out.print("дней 2: ");
        System.out.println(day2);
        System.out.print("дней средне: ");
        System.out.println((day1+day2)/2);
        System.out.println(" ");

/* ### **Задача 5.**
чем дольше сотрудник работает в компании,
тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании
дольше 3 лет, получают повышение зарплаты раз в год.
Каждый год повышение составляет 10% от текущей зарплаты.
К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
а также провести расчет для следующих сотрудников:
Маша получает 67 760 рублей в месяц
Денис получает 83 690 рублей в месяц
Кристина получает 76 230 рублей в месяц
Каждому нужно увеличить зарплату на 10% от текущей месячной.
Дополнительно руководитель попросил посчитать разницу между годовым доходом
с нынешней зарплатой и после повышения.
Посчитайте, сколько будет получать каждый из сотрудников,
а также разницу между годовым доходом до и после повышения.
Выведите в консоль информацию по каждому сотруднику.
Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
 */
      float masha = 67760f;
      float denis = 83690f;
      float kristyna = 76230f;

        System.out.println("Задача 5: ");
        System.out.print("Маша теперь получает: ");
        System.out.print(masha * 1.1f);
        System.out.print(" рублей в месяц. Годовой доход вырос на: ");
        System.out.print( (12f * (masha * 1.1f)) - (masha * 12f) );
        System.out.println(" рублей.");

        System.out.print("Денис теперь получает: ");
        System.out.print(denis * 1.1f);
        System.out.print(" рублей в месяц. Годовой доход вырос на: ");
        System.out.print( (12f * (denis * 1.1f)) - (denis * 12f) );
        System.out.println(" рублей.");

        System.out.print("Кристина теперь получает: ");
        System.out.print(kristyna * 1.1f);
        System.out.print(" рублей в месяц. Годовой доход вырос на: ");
        System.out.print( (12f * (kristyna * 1.1f)) - (kristyna * 12f) );
        System.out.println(" рублей.");

    }
}