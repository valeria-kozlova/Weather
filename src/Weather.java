//▸ Создайте программу, определяющую, подходят ли текущие погодные условия для прогулки
//▸ В начале работы программы пользователь вводит температуру окружающей среды, информацию о ветре и дожде
//▸ Программа ее обрабатывает и дает совет
import java.util.Scanner;
public class Weather {

    public static void main(String[] args)
    {
        int ambientTemperature;
        while(true) {
           Scanner temperature = new Scanner(System.in);
            System.out.println("Введите температуру окружающей среды [°C]: ");
            if (temperature.hasNextInt()) {
                ambientTemperature = temperature.nextInt();
                if(-89 <= ambientTemperature && ambientTemperature <= 56) {
                    System.out.println("Температура окружающей среды: " + ambientTemperature + " °C");
                    break;}
                else {
                    System.out.println("Некорректный ввод. Попробуйте еще раз.");
                }
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
            } }
        int speed;
        while (true) {
            Scanner windSpeed = new Scanner(System.in);
            System.out.println("Введите скорость ветра [м/с]: ");
            if (windSpeed.hasNextInt()) {
                speed = windSpeed.nextInt();
                if (speed >= 0) {
                    System.out.println("Скорость ветра : " + speed + " м/с");
                    break;
                } else {
                    System.out.println("Некорректный ввод. Попробуйте еще раз.");
                }
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }
        } int rain;
        while (true) {
            Scanner Rain = new Scanner(System.in);
            System.out.println("На улице идет дождь? \n 1 - да \n 2 - нет ");
            if (Rain.hasNextInt()) {
                rain = Rain.nextInt();
               if ((rain == 1) || (rain == 2)) {
                   if (rain == 1) {
                       System.out.println("Дождь идет");
                       break;
                   } else {
                       System.out.println("Дождь не идет");
                       break;
                   }
               } else {
                   System.out.println("Некорректный ввод. Попробуйте еще раз");
               }
            } else {
                System.out.println("Некорректный ввод. Попробуйте еще раз");
            }
         } System.out.println(">>Совет: ");
        if (ambientTemperature >= 25)
            System.out.print("Очень жарко, тепло не одевайся; ");
        else if(ambientTemperature <= -25)
            System.out.print("Очень холодно, оденься теплее; ");
        else System.out.print("Температура в пределах нормы, ");
         if (speed >= 10)
            System.out.println("довольно ветренно.");
        else System.out.println("ветер не сильный.");
        if (rain == 1)
            System.out.println("А еще дождь идет, без зонта никуда!");
        else if (rain == 2)
            System.out.println("Ну, хоть дождя нет, зонт можешь оставить дома");
        System.out.println("В целом, решай самостоятельно: гулять тебе или нет. Не маленький уже.");
    }
    }
