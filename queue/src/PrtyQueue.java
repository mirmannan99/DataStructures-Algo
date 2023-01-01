import java.util.Arrays;

public class PrtyQueue {
    private int[] items = new int[5];

    private int count;

    public void add(int item) {
        //[1,3,5,7] 2
        //[1,3,5,7,7] 2
        //[1,3,5,5,7] 2
        //[1,3,3,5,7] 2
        //[1,2,3,5,7] 2
        // 0 1 2 3 4

        if (isFull())
            throw new IllegalStateException();

//        //? shifting the items
//        int i; //! to retain the value of iteration
//        for (i = count - 1; i >= 0; i--) {
//            if (items[i] > item)
//                items[i + 1] = items[i];
//            else
//                break;
//        }
//        items[i + 1] = item; //! insert the new element

        //! refractored code
       var i=shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public boolean isFull(){
        return  count==items.length;
    }

    public int shiftItemsToInsert(int item){
        //? shifting the items
        int i; //! to retain the value of iteration
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i+1;
    }

    public int remove(){
      if (isEmpty())
          throw new IllegalStateException();
      return items[--count];
    }
    public boolean isEmpty(){
        return count==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
