public class Checkbox extends Question {

    public Checkbox(String aPrompt, String aAnswer, String possibleAnswers){
        super(aPrompt, aAnswer);
        prompt = "Multiple choice: Enter each answer seperated by a comma and a space " + prompt + " " + possibleAnswers;
// have user enter single answers line by line, they control when to break by submitting an empty line for while loop?

    }
}
