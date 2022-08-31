public class Main {
    public static void main(String[] args) {
        printIsLeap(2021);
        printMessage(1, 2014);
        printCalculateDeliveryDays(120);
    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0) {
            System.out.println("Високосный год");
        }else{
            System.out.println("Не високосный год");
        }
    }private static void  printMessage (int clientOS, int clientDeviceYear ){


        System.out.println( "");
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылке");

            }

        }

    }private static void printCalculateDeliveryDays (int deliveryDistance) {

        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;

        if (deliveryDistance <= startInterval ){
            deliveryDays = 1;
        }else {
            deliveryDays=deliveryDays + (int) Math.ceil((deliveryDistance-startInterval) /(double) interval) ;

        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}