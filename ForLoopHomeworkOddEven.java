package HomeworkWeek3;

public class ForLoopHomeworkOddEven {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i %2 == 0){
            System.out.println("Even Number: "+i);
            }
        }
        for(int b=1;b<=20;b++){
            if(b %2 == 1) {
                System.out.println("Odd Number: " + b);
            }
        }
    }
}