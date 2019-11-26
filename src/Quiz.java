import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList<Question> questions= new ArrayList<>();
    double Score = 0;

    Scanner in = new Scanner(System.in);



    public  Quiz(){

        //   ArrayList<Question> questions


    }

    public void askQuestions(){

        for (Question question : questions) {
            System.out.println(question.getPrompt());
            if (question.getAnswers().equals(in.nextLine())){
                this.Score += 1;
            }
            System.out.println(this.Score);
        }


    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Question aQuestion){
        questions.add(aQuestion);
    }
}
