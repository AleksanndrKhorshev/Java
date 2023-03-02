package Less_4;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Введите текст и число от 0 через '~' или print~число для удаления из позиции или exit для выхода: ");
            String input = scanner.next();

            if (input.startsWith("print~")) {
                try {
                    int index = Integer.parseInt(input.split("~")[1]);
                    String word = list.get(index);
                    
                    if (word == null) {
                        System.out.println(" ");
                    } else {
                        System.out.println(word);
                        list.set(index, null);
                        System.out.println(list);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Нет элемента с таким индексом");
                } catch (NumberFormatException e) {
                    System.out.println("Некорректные данные. Введите текст и число через '~'");
                }
            } else if (input.equals("exit")) {
                System.out.println("Программа завершена");
                scanner.close();
                break;
            } else {
                try {
                    String[] split = input.split("~");
                    String word = split[0];
                    String numberString = split[1];
                    int number = Integer.parseInt(numberString);
                    if (word != null && !word.isEmpty()) {
                        if (number < list.size()) {
                            list.set(number, word);
                        } else {
                            while (number > list.size()) {
                                list.add(null);
                            }
                            list.add(word);
                        }
                        System.out.println(list);
                    } else {
                        System.out.println("Некорректное значение. Введите текст и число через '~'");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некорректные данные. Введите текст и число через '~'");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Некорректный ввод данных.");
                }
            }
        }
    }
}

