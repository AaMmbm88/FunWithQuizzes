package FunWithQuizzes;

import java.util.Scanner;

public class TrueFalse extends Question {
    private boolean correctAnswer;
    private boolean isCorrect = false;
    private Scanner input;

    public TrueFalse(String aQuestion, boolean correctAnswer){
        super(aQuestion);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String getQuestion() {
        return super.getQuestion();
    }

    public void askQuestionAndAnswers(){
        super.askQuestion();
    }

    public boolean checkAnswer(){
        input = new Scanner(System.in);
        boolean chosenAnswer = input.nextBoolean();
//    input.close();
        if(chosenAnswer == correctAnswer){
            isCorrect = true;
        }

        return isCorrect;
    }

}
