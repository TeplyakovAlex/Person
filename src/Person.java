
public class Person {
    protected String name = "n/a";
    protected int age = 0;
    protected String address = "n/a";

    //konstruktor
    public Person(){    }
    public Person(String name,int age ){
        this.name=name;
        this.age = age;

    }


//method
    public void setName(String n)
    {
        this.name = n;
    }
        public String name()
        {
    return this.name;
        }
    public void setAge(int a)
    {
        this.age = a;
    }
    public int age()
    {
        return this.age;
    }


    public void setAddress(String a)
    {
        this.address = a;
    }
    public String address()
    {
        return this.address;
    }






    public void descritionOfPerson(){
        System.out.println("______________________________");
        System.out.println("| My name is "+name);
        System.out.println("| I`m "+age+" yers old");
        System.out.println("My address is  "+ address);

    }



}
