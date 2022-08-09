package FunWithQuizzes;

public abstract class Question {
    private String question;

public Question(String aQuestion){
    question = aQuestion;
}
    public void askQuestion(){
        System.out.println(question);
    }
    public void askQuestionAndAnswers(){};
    public abstract boolean checkAnswer();

    public String getQuestion() {
        return question;
    }
}
