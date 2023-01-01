import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    //! store it in an array as list because cannot declare arrayList Directly without object
    //! and the reason to declare it outside is so that it wont be initialized again
    //! again inside memory
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
//! to check whether the expression is balanced or not (1+2) means pair brackets
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (bracketsMatch(top, ch)) return false;
            }
        }
        return stack.empty();
    }


    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
        //! .contains returns bool we can use this instead of below expression of ||
//        return ch == '(' || ch == '{' || ch == '[' || ch == '<';
    }

    private boolean isRightBracket(char ch) {
        return leftBrackets.contains(ch);
//        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }

    private boolean bracketsMatch(char left, char right) {
        /*! here we are checking the index of left and right stack in the
       ! given arrays if they have same index that means they are equal
       ! suppose [(1+2)+3] here left and right bracket should have same index
       ! according to the push pop and order in the array*/
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
//        return (right == ')' && left != '(') ||
//                (right == '}' && left != '{') ||
//                (right == '>' && left != '<') ||
//                (right == ']' && left != '[');
    }
}
