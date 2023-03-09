package Less_5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Task_1 {
    
    public static void main(String[] args) {

        String parentheses = "(txt)[132]{rt2rt}<(txt)>";
        System.out.println(isCorrectParentheses(parentheses));

    }

    private static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('<', '>');

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char currentChar = parentheses.charAt(i);

            if (parenthesesMap.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (parenthesesMap.containsValue(currentChar)) {
                if (!stack.isEmpty() && parenthesesMap.get(stack.peek()) == currentChar) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}