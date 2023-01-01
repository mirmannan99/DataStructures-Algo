public class Main {
    public static void main(String[] args) {
//        String str = "abcd";
//        StringReverser reverser = new StringReverser();
//        var result = reverser.reverse(str);
//        System.out.println(result);
//
//        Expression exp = new Expression();
//        var isbal = exp.isBalanced("(<1+2>)");
//        System.out.println(isbal);

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack);

    }
}