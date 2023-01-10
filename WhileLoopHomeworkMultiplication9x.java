package HomeworkWeek3;

public class WhileLoopHomeworkMultiplication9x {
    public static void main(String[] args) {

        int multiplicationTable = 9;
        int i = 1;
        while (i<=10)
        {
            System.out.println(multiplicationTable + " X " + i + " = " + i++ * multiplicationTable);
        }
    }
}