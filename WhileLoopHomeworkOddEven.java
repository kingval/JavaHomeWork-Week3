package HomeworkWeek3;

public class WhileLoopHomeworkOddEven {
    public static void main(String[] args) {

        int i = 1;
        int b = 2;

        while (i <= 20) {
            System.out.println(i +  ": is a Odd number");
            i+= 2;
        }
        while (b <= 20) {
            System.out.println(b +  ": is a Even number");
            b += 2;
        }
    }
}