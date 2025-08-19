import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    private static HashMap<String, Person> people = new HashMap<>();
    private static Scanner input = new Scanner(System.in);
    private static final String FILE_NAME = "people.txt";
    
    public static void savePeopleToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for(Map.Entry<String, Person> entry : people.entrySet()){
                Person person = entry.getValue(); 
                writer.write(person.getName() + "," + person.getAge()); 
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
    
    public static void loadFromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String metric;
            while ((metric = reader.readLine()) != null) {
                String[] splits = metric.split(",");
                if (splits.length == 2) {
                    String name = splits[0].toLowerCase();
                    int age = Integer.parseInt(splits[1]);
                    Person person = new Person(name, age);
                    people.put(name, person);
                }
            }
        }catch(FileNotFoundException e) {
            System.out.println("Arquivo de dados não encontrado. Um novo será criado ao salvar.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    
    public static void searchPerson(){
        System.out.println("enter a name for search: ");
        String userSearch = input.nextLine().toLowerCase();
        Person personFound = people.get(userSearch);
        if (personFound != null){
            System.out.println(userSearch + " : " + personFound.getAge() + " years");
        } else {
            System.out.println("Theres no one with that name \n \n ");
        }
    }
    
    public static void register(){
        System.out.println("enter the name of the person: ");
        String personName = input.nextLine().toLowerCase();
        System.out.println("enter the age of the person: ");
        if (input.hasNextInt()) {
            int personAge = input.nextInt();
            input.nextLine();
            Person person = new Person(personName, personAge);
            people.put(personName, person);
            System.out.println("person is now registered! \n ");
        } else {
            System.out.println("the age is invalid");
            input.nextLine();
        }
    }
    
    public static void main(String[] args) {
        loadFromFile();
        while (true){
            System.out.println(" Welcome to the register of people! \n please select a option \n 1- enter a new name and age \n 2-search a person \n 3-list \n 4-remove a person \n 5- exit ");
            if (input.hasNextInt()){
                int menuOption = input.nextInt();
                input.nextLine();
                
                switch(menuOption){
                    case 1:
                        register();
                        break;
                    case 2:
                        searchPerson();
                        break;
                    case 3:
                        System.out.println("--List of people-- \n \n");
                        for (Map.Entry<String, Person> entry : people.entrySet()) {
                            Person person = entry.getValue();
                            System.out.println("name: " + person.getName() + ", age: " + person.getAge());
                        }
                        break;
                    case 4:
                        System.out.println("enter a name for remove: ");
                        String userToRemove = input.nextLine().toLowerCase();
                        if(people.remove(userToRemove) != null){
                            System.out.println("The user is removed");
                        } else {
                            System.out.println("user was not found ");
                        }
                        break;
                    case 5:
                        savePeopleToFile();
                        input.close();
                        return;
                    default:
                        System.out.println("error in the option please try again \n \n ");
                        break;
                }
            } else {
                System.out.println("error in the option please try again \n \n ");
                input.nextLine();
            }
        }
    }
}
