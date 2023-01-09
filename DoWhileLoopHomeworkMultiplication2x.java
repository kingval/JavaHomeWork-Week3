package HomeworkWeek3;

public class DoWhileLoopHomeworkMultiplication2x {
    public static void main(String[] args) {

        int multiplicationTable = 2;
        int i = 1;
        do {
            System.out.println(multiplicationTable + " X " + i++ + " = " + i * multiplicationTable);
        }
        while (i<=10);
    }
}