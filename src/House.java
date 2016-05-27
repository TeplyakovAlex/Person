/**
 * Created by diz on 23.05.2016.
 */
import java.util.ArrayList;

public class House {
    protected String address= "n/a";
    protected ArrayList<Person> listOfrezidents = new ArrayList<Person>();

    public House(){}
    public House(String address){
        this.address=address;
    }

    public String address(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public void settlePerson(Person p){
        if(listOfrezidents.contains(p)){
            System.out.println("He live here olrady");
        } else {
            listOfrezidents.add(p);
            p.setAddress(this.address);
        }
    }

    public void evictPerson(Person p){
        listOfrezidents.remove(p);
        p.setAddress("n/a");
    }

    public void descriprionOfHouse(){
        System.out.println("_____________________________________________");
        System.out.println("# Address of this house is:"+this.address);
        System.out.println("#List of residents:");
        if (listOfrezidents!=null){
            for (int i=0;i<listOfrezidents.size();i++){
                Person p = listOfrezidents.get(i);
                System.out.println("# - "+ p.name());
            }
        }
    }

}
