import java.util.ArrayList;

public class UniversityBrain {
    private  ArrayList<Student> students=new ArrayList<>();
    private Quiz Q;
    public void addStudent(Student student)
    {
        students.add(student);
        Q=new Quiz();
    }
    public String displayStudents()
    {
        String studentsList="";
        for(int i=0;i<students.size();i++)
        {

           studentsList+= "\nstudent number "+(i+1)+": "
                    + "\n"+"name: "+students.get(i).getName()
                    +"\n"+"id: "+students.get(i).getId()
                    +"\n"+"score: "+students.get(i).getScore()
                    +"\n"+"level: "+students.get(i).getLevel()
                    +"\n"+"/////////////////////////////////////////";
        }
        return studentsList;
    }
    public void UpdateStudentLevel(String name)
    {
        int i;
        for( i=0;i<students.size();i++)
        {
            if(students.get(i).getName().equals(name))
            break;
        }
        students.get(i).UpdateLevel();
    }
    public void deleteStudent(String name)
    {
        int i;
        for( i=0;i<students.size();i++)
        {
            if(students.get(i).getName().equals(name))
                break;
        }
        students.remove(i);
        System.out.println("Student "+name+" deleted");
    }

    public String QuizQue(String subject,int i)
    {
        switch (subject) {
            case "Cs214":
                return Q.DisplayDataStructureQue(i);
            case "Cs341":
                return Q.DisplayOperatingSystemQue(i);
        }
        return Q.DisplayOopQue(i);
    }
    public double UpdateScore(String name,String answer,String code,int num)
    {
        int i;
        for( i=0;i<students.size();i++)
        {
            if(students.get(i).getName().equals(name))
                break;
        }
        if (Q.CheckAnswer(code,num,answer))
        students.get(i).updateScore();
       return students.get(i).getScore();
    }
}
