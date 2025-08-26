public class Person{
    private String Name, Sex;
    private int Age;
    private boolean Vegetariana;

public Person(String Name, String Sex, int Age, boolean Vegetariana){
    this.Name = Name;
    this.Age = Age;
this.Sex = Sex;
}
public int  getAge(){
    return Age;
}
public String getSex(){
    return Sex;
}
public String getName(){
    return Name;
}
}