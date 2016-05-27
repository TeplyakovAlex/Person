/**
 * Created by Alex on 22.05.2016.
 */
public class Student {
    private int age;
     private String name;
    private Facultet facultet;

    public Student(int age, String name, Facultet facultet) {
        this.age = age;
        this.name = name;
        this.facultet = facultet;
    }

    public String getName(){
      return name;
    }

    public int getAge()
    {
        return age;
    }
    public String getFacultet(){
        return facultet.getName();
    }

    public String getInformation()
    {
        return "Student name = " + name + ", age = " + age + ", facultet = " + getFacultet();
    }

}
