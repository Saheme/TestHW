import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String [][] arroy = {{"Валя","Алена","Юля","Зоя"},{"Саша","Женя","Юра","Вася"},{"Бобик","Шарик","Тузик","Балбес"},{"Мурзик","Муська","Тигра","Кися"}};
            int i,j,k = 1;
                for( i = 0; i<4; i++){
                    for( j = 0; j<4;j++){
                        k = i+1;
                        System.out.print( k+ " "+ arroy[i][j]);
                    }
                    System.out.println();
                }

    }


}



