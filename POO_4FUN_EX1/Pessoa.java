public class Pessoa{
    private String Name, Sex;
    private int Age;
    private boolean Vegetariana;

public Pessoa(String Name, String Sex, int Age, boolean Vegetariana){
    this.Name = Name;
    this.Age = Age;
this.Sex = Sex;
this.Vegetariana = Vegetariana;
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
public  boolean getVegetariana(){
    return Vegetariana;
}
}