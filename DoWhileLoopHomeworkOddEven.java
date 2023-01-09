package HomeworkWeek3;

public class DoWhileLoopHomeworkOddEven {
    public static void main(String[] args) {

            int a=2;
            int b=1;
            do{
                System.out.println("Even Number: " + a);
                a+=2;
            }while(a<=20);
            {
                do {
                    System.out.println("Odd Number: " + b);
                    b += 2;
                } while (b <= 20);
            }
    }
}