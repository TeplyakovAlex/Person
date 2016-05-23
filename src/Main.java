
public class Main {
    public static void main (String[]args){
    Person person1 = new Person("John",23);
    Person person2 = new Person();

        House house = new House("1street");
        //house.setAddress("1 street");

        //person1.setName("John");
        //person1.setAge(31);

        person2.setName("Mike");
        person2.setAge(51);


        house.settlePerson(person1);
        house.settlePerson(person2);

        person1.descritionOfPerson();
        person2.descritionOfPerson();
        house.descriprionOfHouse();
    }
}
