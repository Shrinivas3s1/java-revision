import java.util.Scanner;

public class QuestionService {
   Question[] questions = new Question[5];
    String[] choices = new String[questions.length];
    public QuestionService() {
        questions[0] = new Question(1,"What is my name","Shr","elon","jude","shriniwas","shriniwas");
        questions[1] = new Question(1,"What is age","12","30","24","34","24");
        questions[2] = new Question(1,"What is 2+3","5","30","24","34","5");
        questions[3] = new Question(1,"What is 2+3+1","5","6","24","34","6");
        questions[4] = new Question(1,"What is 2+3-1","5","30","4","34","4");
    }

    public void displayQuestion(){
         int i = 0;

         for (Question q: questions){
             System.out.println("Option : " + q.getQuestion());
             System.out.println("A : " + q.getOpt1() );
             System.out.println("B : " + q.getOpt2() );
             System.out.println("C : " + q.getOpt3() );
             System.out.println("D : " + q.getOpt4() );
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter your choice : ");
             choices[i] = sc.nextLine();
             i++;

         }

        }
    int score = 0;

    public void calculateScore(){
        for(int i = 0; i < questions.length; i++){
            Question q = questions[i];
            String useranswer = choices[i];
            if(q.getAnswer().equals(useranswer)){
                score++;
            }
        }
   }

   public int returnScore(){
       return score;
   }
}
