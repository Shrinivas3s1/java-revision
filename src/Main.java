import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.displayQuestion();
    Scanner sc = new  Scanner(System.in);
        System.out.println("Do you want to see the score ? : Y/N");
        String choice = sc.nextLine();
        if(choice.equals("Y")){
            qs.calculateScore();
            System.out.println("Your score is : " + qs.returnScore());
        }

    }
}