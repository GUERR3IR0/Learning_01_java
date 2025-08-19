import hashmap_4fun;

public class person{
private  String name;
private  int age;

public pessoa(String name, int age){
   this.name = name;
   this.age= age;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAge(int newAge) {
        this.age = newAge;
    }

}