package HomeworkWeek3;

public class DoWhileLoopHomeworkMultiplication2x {
    public static void main(String[] args) {

        int a = 215;
        int i = 1;
        do {
            System.out.println(a + " X " + i + " = " + i++ * a);
        }
        while (i<=10);
    }
}