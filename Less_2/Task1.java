package Less_2;

public class Task1 {
    public static void main(String[] args){
        String str = "шалаш";
        if (str.length() == 0){
            System.out.println("Строка пустая");
            return;
        }
        for (int i = 0; i<str.length()/2; i++) {
            if (str.charAt(i) !=str.charAt(str.length()-1 -i)) {
                System.out.println("Строка не палиндром");
                return;
            }
        }
        System.out.println("Строка палиндром");
        
    }

}