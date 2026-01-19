public class January1926 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        String[] copy = arr;
        copy[1] = "e";
        System.out.println(arr[1]);
    }
}
