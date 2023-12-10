public class mathOperand {
    public static void main(String[] args) {
        int x = 100;
        int y = 101;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int sum1 = x + y;
        int sum2 = 4 + y;
        System.out.println("Операции сложения: sum1 = x + y = " + sum1 + "; sum2 = 4 + y = " + sum2);
        int subtr1 = x - y;
        int subtr2 = 4 - x;
        System.out.println("Операции вычитания: subtr1 = x - y = " + subtr1 + "; subtr2 = 4 - x = " + subtr2);
        int mult1 = x * y;
        int mult2 = y * 5;
        System.out.println("Операции умножения: mult1 = x * y = " + mult1 + "; mult2 = y * 5 = " + mult2);
        int div1 = y / x;
        int div2 = 5 / y;
        System.out.println("Операции деления: div1 = y / x = " + div1 + "; div2 = 5 / y = " + div2);
        double d = 3.0 - 1.1;
        System.out.println("Операция с плавающей точкой: d = 3.0 - 1.1 = " + d);
        boolean c = x > y;
        boolean c1 = x < y;
        System.out.println("Булевые операции : c = x > y результат = " + c + " c1 = x < y результат = " + c1);
        byte n = 40;
        byte m = 11;
        System.out.println("Переполнение: " + (byte) (n * m));
        int intNumber = 6;
        double doubleNumber = 1.11;
        System.out.println("Складываем intNumber и doubleNumber = " + x + y);
    }
}
