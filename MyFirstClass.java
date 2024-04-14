public class MyFirstClass {
    public static void main(String[] args){

        //1.Если 5 в 15 степени больше миллиарда, вывести -«Степень это мощь. Power is a power.»
        double x = Math.pow(5, 15);
        if (x > 1000000000){
            System.out.println("Степень это мощь. Power is a power");
        }

        //2.Задайте переменную. Если она больше 0, вывести «позитив», если меньше 0, вывести «отрицательно»
        int y = -3;
        if (y > 0){
            System.out.println("позитив");
        }else{
            System.out.println("отрицательно");
        }

        //3. Если квадратный корень из 15 миллионов меньше 5 тысяч, вывести -«два измерения лучше, чем одно»
        double z = Math.sqrt(15000000);
        if (z < 5000){
            System.out.println("два измерения лучше, чем одно");
        }

        //4.Если 2 в 10 степени меньше 512 вывести -«Pentium 2», иначе вывести -«ARM»
        double m = Math.pow(2, 10);
        if (m < 512){
            System.out.println("Pentium 2");
        }else{
            System.out.println("ARM");
        }

        //5.Задать две дробных переменных. Вывести наибольшую из них.
        int c = 4;
        int v = 2;
        if (c > v ){
            System.out.println(c);
        }else{
            System.out.println(v);
        }

        //6.Задать две переменных -first и second. Вывести first в степени second, second в степени first.
        double first = 20;
        double second = 2;
        System.out.println(Math.pow(first, second));
        System.out.println(Math.pow(second, first));

        //7.Задать две переменных. Вывести, что больше первая в степени второй, или наоборот.
        int s = 2;
        int d = 5;
        double s1 = Math.pow(s, d);
        double d1 = Math.pow(d, s);
        if(s1 > d1){
            System.out.println("s больше");
        }else{
            System.out.println("d больше");
        }

        //8.Вывести числа от 1 до 100
        int q = 0;
        while(q < 100){
            q = q + 1;
            System.out.println(q);
        }

        //9. Вывести числа от 50 до 100
        int w = 49;
        while(w < 100){
            w = w + 1;
            System.out.println(w);
        }

        //10.Вывести числа от 100 до 1
        int e = 101;
        while(e > 1){
            e = e - 1;
            System.out.println(e);
        }

        //11.Вывести числа от 0 до -100
        int r = 1;
        while(r > -100){
            r = r - 1;
            System.out.println(r);
        }

        //12.Задать строковую переменную. Заменить в ней все буквы о на «обро»
        String str = "Добро";
        String newStr = str.replace("о", "обро");
        System.out.println(newStr);

        //13.Задать строковую переменную. Вывести ее в верхнем регистре
        String l = "привет";
        System.out.println(l.toUpperCase());

        //14.Задать строковую переменную. Заменить в ней буквы а на @, а буквы о на 0
        String u = "аорта";
        String newU = u.replace('а', '@').replace('о', '0');
        System.out.println(newU);

        //15.Задать две строковых переменных. Найти, какая из них длиннее. (Используйте .length() )
        String u1 = "Привет";
        int len1 = u1.length();
        String u2 = "Пока";
        int len2 = u2.length();
        if(len1 > len2){
            System.out.println(u1 + " длиннее");
        }else{
            System.out.println(u2 + " длиннее");
        }

        //16.Задать три переменных, найти наибольшую из них
        double q1 = 4.0;
        double q2 = 2.0;
        double q3 = 5.0;
        if(q1 > q2 && q1 > q3){
            System.out.println(q1);
        } else if(q2> q1 && q2 > q3){
            System.out.println(q2);
        } else if(q3 > q1 && q3 > q2){
            System.out.println(q3);
        }



    }
}
