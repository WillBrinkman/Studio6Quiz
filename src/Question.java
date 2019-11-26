import java.util.ArrayList;
import java.util.Scanner;

public class Question{

    protected String prompt;
    private String answers;
    private String result;
    Scanner in = new Scanner(System.in);


    public String getPrompt(){
        return this.prompt;
    }
    public String getAnswers(){
        return this.answers;
    }
    public String getResult(){
        return this.result;
    }



    public Question(String aPrompt,String aAnswer) {
        prompt = aPrompt;

        answers = aAnswer;

        //result = in.nextLine();

    }

}
