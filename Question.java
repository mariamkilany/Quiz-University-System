
public class Question {
    private String question;
    private String answer;
    public Question(String question,String answer){
        setQuestion(question);
        setAnswer(answer);
    }
    public void setQuestion(String question){
        this.question=question;
    }
    public String getQuestion(){
        return question;
    }
    public void setAnswer(String answer){
        if(!answer.isEmpty())
            this.answer=answer;
        else
            System.out.println("Answer can not be empty \n");
    }
    public String getAnswer(){
        return answer;
    }

}
