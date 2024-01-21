import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("case 1" +shouldWakeUp(true,1));
        System.out.println("case 2" +shouldWakeUp(false,2));
        System.out.println("case 3" +shouldWakeUp(true,8));
        System.out.println("case 4" +shouldWakeUp(true,-1));

        System.out.println("---------------------------------");

        System.out.println("case hasTeen 1" +hasTeen2(9,99, 19));
        System.out.println("case hasTeen 2" +hasTeen2(23,15, 42));
        System.out.println("case hasTeen 3" +hasTeen2(22,23, 34));

        System.out.println("---------------------------------");

        System.out.println("isCat 1:" +isCatPlaying( true, 10));
        System.out.println("isCat 2:" +isCatPlaying( false, 35));
        System.out.println("isCat 3:" +isCatPlaying( false, 36));

        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter width of rectangle");
        double width = scanner.nextDouble();
        System.out.println("enter height of rectangle");
        double height = scanner.nextDouble();
        System.out.println("area of rectangle:"+ area(height,width));


        System.out.println("enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("are of circle: " + area(radius));




    }

        public static boolean shouldWakeUp( boolean isBarking, int clock) {
                if(clock < 0 || clock > 23 || !isBarking) return false;
                return  clock < 8 || clock >= 20;
        }

        public  static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return (firstAge >= 13 && firstAge <= 19)
                || (secondAge >= 13 && secondAge <= 19)
                || (thirdAge >= 13 && thirdAge <= 19);
        }


    public static boolean hasTeen2(int... ages){
        if (ages.length != 3) {
            return false;
        }
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }

        }
        return false;

    }

    public static boolean isCatPlaying( boolean isSummer, int temperature) {
        if (isSummer) {
            return temperature > 25 && temperature <= 45;
        }
        return temperature > 25 && temperature <= 35;
    }

    public static double area(double height, double width) {
        if(width<0 || height<0) {
            System.out.println("width or height ");
            return -1;
        }
        return width * height;

    }

    public static double area(double radius){
        if(radius<0){
            System.out.println("radius" + radius);
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

}