public class Student {
    private String name;
    private double id;
    private double score;
    private int level;

    public Student(String name,double id,int level){
        setId(id);
        setName(name);
        setLevel(level);
    }
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("name can't be Empty");
        }
        else
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setId(double id){
        this.id=id;
    }
    public double getId(){
        return id;
    }
    public void updateScore(){
        score++;
    }
    public double getScore(){
        return score;
    }
    public void setLevel(int level)
    {
        this.level=level;
    }
    public int getLevel()
    {
        return level;
    }
    public void UpdateLevel()
    {
        if(score>=2)
        {
            System.out.println(name+" Up to level "+(++level));
        }

    }
}
