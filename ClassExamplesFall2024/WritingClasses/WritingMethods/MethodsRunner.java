package WritingMethods;

public class MethodsRunner {
    public static void main(String[] args) {
        int num = 13;
        WritingMethodsExamples obj1 = new WritingMethodsExamples();

        double numCast = obj1.castDouble(num);
        System.out.println(numCast);

        WritingMethodsExamples obj2 = new WritingMethodsExamples();
        obj2.setWidth(45);
        System.out.println("Width is " + obj2.getWidth());
        obj2.resetRect(obj2);
        System.out.println(obj2);

    }
}
