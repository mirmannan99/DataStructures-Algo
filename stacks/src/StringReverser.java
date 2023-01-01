import java.util.Stack;

public class StringReverser {
    public String reverse (String input){
        if (input==null)
            throw  new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        //! adding the items to the stack
        for(char ch : input.toCharArray()) //? for each loop
            stack.push(ch);

        // creating string for reverse
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty())
            //! popping and  appending them to new string
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
