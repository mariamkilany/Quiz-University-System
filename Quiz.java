import java.util.ArrayList;

public class Quiz {
    private  ArrayList<ArrayList<Question>> Questions=new ArrayList<>();
    public String DisplayDataStructureQue(int num)
    {
        String q1="1-What is the time complexity of pop() operation when the stack is implemented using an array?\n" +
                "a) O(1)\n" +
                "b) O(n)\n" +
                "c) O(logn)\n" +
                "d) O(nlogn)",
                q2="2-What is the time complexity of enqueue operation?\n" +
                 "a) O(logn)\n" +
                 "b) O(nlogn)\n" +
                 "c) O(n)\n" +
                 "d) O(1)",
                q3="3- Which of these best describes an array?\n" +
                "a) A data structure that shows a hierarchical behavior\n" +
                "b) Container of objects of similar types\n" +
                "c) Arrays are immutable once initialised\n" +
                "d) Array is not a data structure",
                q4="4- In general, the index of the first element in an array is __________\n" +
                 "a) 0\n" +
                 "b) -1\n" +
                 "c) 2\n" +
                 "d) 1",
                q5="5- Elements in an array are accessed _____________\n" +
                "a) randomly\n" +
                "b) sequentially\n" +
                "c) exponentially\n" +
                "d) logarithmically";
        Question Q1=new Question(q1,"a");
        Question Q2=new Question(q2,"d");
        Question Q3=new Question(q3,"a");
        Question Q4=new Question(q4,"a");
        Question Q5=new Question(q5,"a");
        ArrayList<Question> DataStructure=new ArrayList<>();
        DataStructure.add(Q1);
        DataStructure.add(Q2);
        DataStructure.add(Q3);
        DataStructure.add(Q4);
        DataStructure.add(Q5);
        Questions.add(DataStructure);
            return DataStructure.get(num).getQuestion();
        }

    public String DisplayOperatingSystemQue(int num)
    {
        String q1="1. What is an operating system?\n" +
                "a) collection of programs that manages hardware resources\n" +
                "b) system service provider to the application programs\n" +
                "c) interface between the hardware and application programs\n" +
                "d) all of the mentioned",
                q2="2. To access the services of operating system, the interface is provided by the ___________\n" +
                        "a) System calls\n" +
                        "b) API\n" +
                        "c) Library\n" +
                        "d) Assembly instructions",
                q3="3.Which scheduling algorithm allocates the CPU first to the process that requests the CPU first?\n" +
                        "a) first-come, first-served scheduling\n" +
                        "b) shortest job scheduling\n" +
                        "c) priority scheduling\n" +
                        "d) none of the mentioned",
                q4=" 4.. In Unix, Which system call creates the new process?\n" +
                        "a) fork\n" +
                        "b) create\n" +
                        "c) new\n" +
                        "d) none of the mentioned",
                q5=" 5.A process can be terminated due to __________\n" +
                        "a) normal exit\n" +
                        "b) fatal error\n" +
                        "c) killed by another process\n" +
                        "d) all of the mentioned";
        Question Q1=new Question(q1,"d");
        Question Q2=new Question(q2,"b");
        Question Q3=new Question(q3,"a");
        Question Q4=new Question(q4,"a");
        Question Q5=new Question(q5,"d");
        ArrayList<Question> OperatingSystem=new ArrayList<>();
        OperatingSystem.add(Q1);
        OperatingSystem.add(Q2);
        OperatingSystem.add(Q3);
        OperatingSystem.add(Q4);
        OperatingSystem.add(Q5);
        Questions.add(OperatingSystem);
        return OperatingSystem.get(num).getQuestion();

    }
    public String DisplayOopQue(int num) {
        String q1 = "1-Which among the following is called first, automatically, whenever an object is created?\n" +
                "a) Class\n" +
                "b) Constructor\n" +
                "c) New\n" +
                "d) Trigger",
                q2 = "2-In which access should a constructor be defined, so that object of the class can be created in any function?\n" +
                        "a) Public\n" +
                        "b) Protected\n" +
                        "c) Private\n" +
                        "d) Any access specifier will work",
                q3 = "3- Which definition best describes an object?\n" +
                        "a) Instance of a class\n" +
                        "b) Instance of itself\n" +
                        "c) Child of a class\n" +
                        "d) Overview of a class",
                q4 = "4- Functions can’t return objects.\n" +
                        "a) True\n" +
                        "b) False\n",
                q5 = "5- How many objects can be declared of a specific class in a single program?\n" +
                        "a) 32768\n" +
                        "b) 127\n" +
                        "c) 1\n" +
                        "d) As many as you want";
        Question Q1 = new Question(q1, "b");
        Question Q2 = new Question(q2, "d");
        Question Q3 = new Question(q3, "b");
        Question Q4 = new Question(q4, "a");
        Question Q5 = new Question(q5, "d");
        ArrayList<Question> Oop = new ArrayList<>();
        Oop.add(Q1);
        Oop.add(Q2);
        Oop.add(Q3);
        Oop.add(Q4);
        Oop.add(Q5);
        Questions.add(Oop);
        return Oop.get(num).getQuestion();
    }
    public boolean CheckAnswer(String code,int num,String answer)
    {
        switch (code) {
            case "Cs214":
                if (answer.equals(Questions.get(0).get(num).getAnswer())) {
                    return true;
                }
                break;
            case "Cs341":
                if (answer.equals(Questions.get(1).get(num).getAnswer())) {
                    return true;
                }
                break;
            case "Cs213":
                if (answer.equals(Questions.get(2).get(num).getAnswer())) {
                    return true;
                }
                break;
        }
        return false;
    }


}
