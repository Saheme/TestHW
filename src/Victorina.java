import java.util.Scanner;

public class Victorina {


    public static void main(String[] args) {
        int rightAnswer = 0;
        int wrongAnswer = 0;
        String [] question = {"Выберите столицу Канады", "С каким океаном не граничит Канада", "Самая длинная река Канады", "Самая высокая гора в Канаде"};
        for(int i=0;question.length>i;i++){
            System.out.println(question[i]);
            System.out.println();

            String[] variant = {"Ванкувер", "Торонто", "Оттава","Монреаль","Атлантический океан ", "Тихий океан ", "Южный океан ", "Северный Ледовитый океан "};
            for (int j = 0; variant.length > j; j=j+1) {
                System.out.println(variant[j]);
            }
        }
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if (answer == 3) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }System.out.println("Правильных ответов " + rightAnswer);
        System.out.println("Неправильных ответов " + wrongAnswer);
        System.out.println();

       /* String ocean = "С каким океаном не граничит Канада";
        System.out.println(ocean);
        System.out.println();
        String[] variant2 = {"", "Атлантический океан ", "Тихий океан ", "Южный океан ", "Северный Ледовитый океан "};
        for (int j = 1; variant2.length > j; j++) {
            System.out.println(variant2[j] + j);
        }
        Scanner scan2 = new Scanner(System.in);
        int answer2 = scan2.nextInt();
        if (answer2 == 3) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();

        String river = "Самая длинная река Канады";
        System.out.println(river);
        System.out.println();
        String[] variant3 = {"", "Юкон ", "Колумбия ", "Маккензи ", "Пис "};
        for (int k = 1; variant3.length > k; k++) {
            System.out.println(variant3[k] + k);
        }
        Scanner scan3 = new Scanner(System.in);
        int answer3 = scan3.nextInt();
        if (answer3 == 1) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();

        String mountain = "Самая высокая гора в Канаде";
        System.out.println(mountain);
        System.out.println();
        String[] variant4 = {"", "Вуд ", "Ванкувер ", "Кинг Пик ", "Логан "};
        for (int m = 1; variant4.length > m; m++) {
            System.out.println(variant4[m] + m);
        }
        Scanner scan4 = new Scanner(System.in);
        int answer4 = scan4.nextInt();
        if (answer4 == 4) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();
         */
    }
}















