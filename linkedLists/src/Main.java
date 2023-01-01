public class Main {
    public static void main(String[] args) {
        var list = new LinkedLists();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(list.getKthFromTheEnd(2));

    }
}