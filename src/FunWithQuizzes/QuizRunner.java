package FunWithQuizzes;

import java.util.ArrayList;

public class QuizRunner {
    public static void main (String args[]){
        ArrayList<Boolean> answers = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();
        double score = 0;
        double grade;

        MultipleChoice paCapital = new MultipleChoice("What is the capital of Pennsylvania?", "Harrisburg", "Philadelphia", "Pittsburgh", "Erie");
        questions.add(paCapital);
        MultipleChoice ringForger = new MultipleChoice("Who helped Sauron forge the Rings of Power?", "Celebrimbor", "Elrond", "Feanor", "Durin");
        questions.add(ringForger);
        Checkbox fellowship = new Checkbox("Which of these were members of the Fellowship of the Ring?", "Frodo", "Aragorn", "Galadriel", "Gil-Galad", "Faramir");
        questions.add(fellowship);
        TrueFalse darthMaulDied = new TrueFalse("Darth Maul died at the end of Phantom Menace: true or false?", false);
        questions.add(darthMaulDied);
        TrueFalse feanorWasADick = new TrueFalse("Feanor was a total dick: true or false?", true);
        questions.add(feanorWasADick);
        Checkbox sith = new Checkbox("Which of these were actual Sith that appeared in the Star Wars movies?", "Darth Sidious", "Darth Tyranus", "Darth Murder McMurderface", "Darth Hatred", "Darth Spite");
        questions.add(sith);
        MultipleChoice quiGonsMaster = new MultipleChoice("Who trained Qui-Gon Jinn?", "Count Dooku", "Yoda", "Mace Windu", "Plo Koon");
        questions.add(quiGonsMaster);
        TrueFalse hairyDwarvenWomean = new TrueFalse("Dwarven women have beards as long and full as the men: true or false?", true);
        questions.add(hairyDwarvenWomean);
        Checkbox starWarsPlanets = new Checkbox("Which of these are actual planets in the Star Wars galaxy?", "Drexel", "Mustafar", "MufasaScar", "Genesis", "Vulcan");
        questions.add(starWarsPlanets);

        for (Question question:questions){
            question.askQuestionAndAnswers();
            answers.add(question.checkAnswer());
        }

//        paCapital.askQuestionAndAnswers();
//        answers.add(paCapital.checkAnswer());
//        ringForger.askQuestionAndAnswers();
//        answers.add(ringForger.checkAnswer());
//        fellowship.askQuestionAndAnswers();
//        answers.add(fellowship.checkAnswer());
//        darthMaulDied.askQuestion();
//        answers.add(darthMaulDied.checkAnswer());
//        feanorWasADick.askQuestion();
//        answers.add(feanorWasADick.checkAnswer());
//        sith.askQuestion();
//        answers.add(sith.checkAnswer());
//        quiGonsMaster.askQuestion();
//        answers.add(quiGonsMaster.checkAnswer());

        System.out.println(answers);


        for (Boolean answer:answers){
            if (answer == true){
                score++;
            }

        }
        System.out.println(score);
        System.out.println(answers.size());

        grade = Math.round((score / (answers.size())) * 100);
        System.out.println(grade);


        System.out.println("Your scored " + grade + "% on this quiz.");

    }
}
