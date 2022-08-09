package FunWithQuizzes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> answers = new ArrayList<>();
    private int correctAnswer;
    private boolean isCorrect = false;


    Scanner input;


    public MultipleChoice(String aQuestion, String rightAnswer, String answer1, String answer2, String answer3){
        super(aQuestion);
//        ArrayList<String> answers = new ArrayList<>();
        answers.add(rightAnswer);
        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        Collections.shuffle(answers);
//        System.out.println(answers);
//        System.out.println(answers.indexOf(rightAnswer));
        correctAnswer = answers.indexOf(rightAnswer) +1 ;
//        System.out.println(correctAnswer);


    }
@Override
public void askQuestionAndAnswers(){
        super.askQuestion();
        for(String answer:answers){
            System.out.println(answers.indexOf(answer)+1 + ": " + answer);
        }

}


public boolean checkAnswer(){
        input = new Scanner(System.in);
    System.out.println("Enter number corresponding to the correct answer: ");
    int chosenAnswer = input.nextInt();
//    input.close();
    if(chosenAnswer == correctAnswer){
        isCorrect = true;
    }

        return isCorrect;
}



}


