public class QuizRunner {
    public static void main(String[] args){

        TrueFalse falcon = new TrueFalse("The peregrine falcon is the fastest animal in the world?", "True");
        MultipleChoice snail = new MultipleChoice("A snail can sleep for how many years?", "3", "2, 4, 3, 1");
        Checkbox barn = new Checkbox("Which of the following animals are found on a farm?", "chicken, horse", "horse, gorilla, flamingo, chicken");
        //System.out.println(falcon.getPrompt());
        Quiz TriviaQuestions = new Quiz();
        TriviaQuestions.setQuestions(falcon);
        TriviaQuestions.setQuestions(snail);
        TriviaQuestions.setQuestions(barn);
        TriviaQuestions.askQuestions();

    }
}
