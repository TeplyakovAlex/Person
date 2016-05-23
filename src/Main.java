
public class Main {
    public static void main (String[]args){
        Facultet facult_tks = new Facultet("TKS");
        Facultet facult_is = new Facultet("IS");
        Facultet[] facultets = new Facultet[2];
        facultets[0] = facult_tks;
        facultets[1] = facult_is;

        Student[] students = new Student[]{new Student(18,"Vasya", facult_is), new Student(19,"Vanya", facult_tks)};

        Institute institute = new Institute(facultets, students);

        System.out.print(institute.getInformation());
    }
}
