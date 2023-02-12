import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
/*
public class Ex {
    public static void main(String[] args){
        System.out.println(isPositive(1));
    }
    public static boolean isPositive(int x){
            return x>0;
        }
    }
/*Написать метод, принимающий на вход два целых числа и проверяющий,
 что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
*/
/*
public class Ex {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        System.out.print(isSumBetween10And20(num1, num2));
    }
    
public static boolean isSumBetween10And20(int num1, int num2) {
            int sum = num1 + num2;{
            if (sum >=10&& sum <=20)
                return true;
            }
                return false;
        }
}

*/
//напечатать строку source repeat раз
/*
public class Ex {
    public static void main(String[] args){
        String source = "Text";
        int repeat = 8;
        for(int i=0;i<repeat;i++)
        System.out.print(source);
        
    }
}
*/
//проверить, является ли год високосным
/*
public class Ex {
    public static void main(String[] args){
        int year = 2022;
         if (((year%4==0) && (year%100 !=0)) || (year%400==0)) {
             System.out.println(year+ " год високосный");
         } else {
             System.out.println(year+ " год не високосный");
         }
      }
}
*/
// должен вернуть массив длины len, каждое значение которого равно initialValue
/*
public class Ex {
    public static void main(String[] args){
        int[] array = {3, 3, 0, 1, 2, 3, 2, 1, 4, 3, 5, 3};
        int initialValue = 1;
        int[] newArray = getArray(array, initialValue);
        System.out.println(Arrays.toString(newArray));
    }
    
    private static int[] getArray(int[] array, int initialValue) {
        int count = 0;
        for (int value : array) {
            if (value == initialValue) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int value : array) {
            if (value == initialValue) {
                newArray[index] = initialValue;
                index++;
            }
        }
        return newArray;
    }

}
*/

 /** Найти общий префикс среди слов из одного массива.
     * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
     */

/*
public class Ex {
  
    public static void main(String[] args){
        String[] words = {"ssscbaaacb", "sssbcaacb", "ssszxcs","sssbaac"};
        String prefix = "";

        for (int i = 0; i < words[0].length(); i++) {
            char currentChar = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) !=currentChar) {
                    System.out.println(prefix);
                    return;
                }
            }
            prefix += currentChar;
        }
        System.out.println(prefix);
    }
    
}
*/

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
/*
public class Ex {
  
    public static void main(String[] args){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;                
            }
            else {
                array [i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
*/
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
/*
public class Ex {
  
    public static void main(String[] args){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i]*=2;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
*/

// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
/*
public class Ex {
  
    public static void main(String[] args){
        int n = 6;
        int[][]array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i == array.length - j - 1) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "");
            }
            System.out.println();
        }
    }
}
*/

//Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Ex {
  
    public static void main(String[] args){
        int[] array = {1, 4, 10, 12, 55, 32, 43, 88, 23, 7};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
