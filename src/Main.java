import Array.Array;

public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array(10);

        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }

        System.out.println(arr);

        arr.addFirst(32);
        System.out.println(arr);
    }

}
