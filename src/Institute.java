/**
 * Created by Alex on 22.05.2016.
 */
public class Institute {
    private Facultet[] facultets;
    private Student[] students;

    public Institute(Facultet[] facultets,Student[] students){
        this.facultets=facultets;
        this.students=students;
    }

    public Facultet[] getFacultets() {
        return facultets;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getInformation()
    {
        String studentInfo = "Students:\n";
        String facultetsInfo = "Facultets:\n";
//        for(int i=0; i<facultets.length; i++)
//        {
//            facultetsInfo = facultetsInfo + facultets[i].getName() + "\n";
//        }
        for(Facultet facultet : facultets)
        {
            facultetsInfo = facultetsInfo + facultet.getName() + "\n";
        }

        for(Student student : students)
        {
            studentInfo = studentInfo + student.getInformation() + "\n";
        }

        return facultetsInfo + "\n" + studentInfo;
    }
}
