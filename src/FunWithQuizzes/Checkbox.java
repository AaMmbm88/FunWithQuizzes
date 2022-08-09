package FunWithQuizzes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Checkbox extends Question {

    private ArrayList<String> answers = new ArrayList<>();
    private ArrayList<Integer> correctAnswers = new ArrayList<>();
    private ArrayList<Integer> chosenAnswers = new ArrayList<>();
    private boolean isCorrect = false;
    Scanner input;

    public Checkbox(String aQuestion, String rightAnswer1, String rightAnswer2, String answer3, String answer4, String answer5){
        super(aQuestion);
//        ArrayList<String> answers = new ArrayList<>();
        answers.add(rightAnswer1);
        answers.add(rightAnswer2);
        answers.add(answer3);
        answers.add(answer4);
        answers.add(answer5);
        Collections.shuffle(answers);
//        ArrayList<Integer> correctAnswers = new ArrayList<>();
        correctAnswers.add(answers.indexOf(rightAnswer1) + 1);
        correctAnswers.add(answers.indexOf(rightAnswer2) + 1);

    }
    @Override

    public void askQuestionAndAnswers(){
        super.askQuestion();
        for(String answer:answers){
            System.out.println(answers.indexOf(answer)+1 + ": " + answer);
        }

    }

    public boolean checkAnswer(){
        int totalCorrect = 0;
        input = new Scanner(System.in);
        System.out.println("Choose number corresponding to a correct answer (choose 0 when all correct answers have been chosen). Press enter after each number chosen: ");
        for (int i =0; i<answers.size(); i++) {
            int chosenAnswer = input.nextInt();
            if (chosenAnswer ==0){
                break;
            }else{
//        input.close();
//            String[] chosenAnswersStrings = chosenAnswer.split(" ");
//        System.out.println(chosenAnswersStrings);
//            int[] chosenAnswersArray = new int[chosenAnswersStrings.length];
//            for (int i = 0; i < chosenAnswersStrings.length; i++) {
//                chosenAnswersArray[i] = Integer.parseInt(chosenAnswersStrings[i]);
                chosenAnswers.add(chosenAnswer);
            }
        }
//        System.out.println(chosenAnswersArray);
//        System.out.println(chosenAnswers);
        for (Integer answer:correctAnswers){

            if(chosenAnswers.contains(answer)){
                totalCorrect++;
            }
            if (totalCorrect == correctAnswers.size()){
                isCorrect = true;
            }
        }
        return isCorrect;
    }

}
