public class LessonsOne {
    public static void main(String[] args) {
        FinanceCalculator();
        System.out.println("");
        AndOrOr();
        System.out.println("");
        ShiftToTheLeft();
        System.out.println("");
        BinarNot(20);
        age(15);
        System.out.println("Hello World");
    }

    public static void FinanceCalculator() {
        System.out.println("Без отрицания");
        int NumberMoney = 6000;
        int DaysBeForePayday = 20;
        if (NumberMoney != 0 && DaysBeForePayday < 30) {
            System.out.println("Можно шиковать");
        } else {
            System.out.println("Нужно затянуть пояса");
        }

        System.out.println("");
        System.out.println("С отрицанием");
        System.out.println("Нужно затянуть пояса");
    }

    public static void AndOrOr() {
        String Tilda = "-";

        for(int x = 0; x <= 6; ++x) {
            int y;
            if (x == 1) {
                for(y = 1; y <= 1; ++y) {
                    System.out.print("Или " + y + "|1 = ");
                    System.out.println(y | 1);
                }

                System.out.println(Tilda.repeat(22));
            } else if (x == 2) {
                for(y = 1; y <= 1; ++y) {
                    System.out.print("и " + y + "&2 = ");
                    System.out.println(y & 2);
                }

                System.out.println(Tilda.repeat(22));
            } else if (x == 3) {
                for(y = 1; y <= 1; ++y) {
                    System.out.print("Сдвиг вправо " + y + ">>3 = ");
                    System.out.println(y >> 3);
                }

                System.out.println(Tilda.repeat(22));
            } else if (x == 4) {
                for(y = 1; y <= 1; ++y) {
                    System.out.print("Сдвиг влево " + y + "<<4 = ");
                    System.out.println(y << 4);
                }

                System.out.println(Tilda.repeat(22));
            } else if (x == 5) {
                for(y = 1; y <= 1; ++y) {
                    System.out.print("Сдвиг вправо c появлением нулей " + y + ">>>5 = ");
                    System.out.println(y >>> 5);
                }

                System.out.println(Tilda.repeat(22));
            } else if (x == 6) {
                for(y = 1; y <= 1; ++y) {
                    System.out.print("Сдвиг влево с присваивание " + y + "<<=6 = ");
                    System.out.println(y <<= 6);
                }

                System.out.println(Tilda.repeat(22));
            }
        }

    }

    public static void ShiftToTheLeft() {
        int s = 4;
        int ss = 8;
        System.out.println(ss + "\n" + s);

        for(int z = 0; z <= 4; ++z) {
            ss = ss <<= 1;
            System.out.println("число " + ss + " :в двоичной системе счисления " + Integer.toBinaryString(ss + 1));
        }

    }

    public static void BinarNot(int a) {
        System.out.println(" a = " + a + "; двоичная система: " + Integer.toBinaryString(a));
        System.out.println("~a = " + ~a + "; двоичная система: " + Integer.toBinaryString(~a));
    }

    public static void age(int age) {
        if (age <= 10) {
            System.out.println("молодой");
        } else if (age >= 10 && age <= 20) {
            System.out.println("чуть старше");
        } else if (age >= 20 && age <= 30) {
            System.out.println("чуть старше");
        }
    }
}
