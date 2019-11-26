public class MultipleChoice extends Question {

    public MultipleChoice(String aPrompt, String aAnswer, String possibleAnswers) {
        super(aPrompt, aAnswer);

        prompt += " " + possibleAnswers;


    }
}
