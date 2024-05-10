public class App {
  public static void main(String[] args) {
    Person[] persons = new Person[5];
    String[] name = {"Zata", "Murad", "Lauriel", "Zuka", "Paine"};
    for(int i = 0; i < persons.length; i++){
      persons[i] = new Person(i + 1, name[i], name[i] + "@gmail.com", "Arena of Valor", Integer.parseInt((String.format("%.0f", Math.random() + 1))));
      System.out.println(persons[i].toString());
    }
    System.out.println("The list of people whose role is equal to 2 is: ");
    for(int i = 0; i < persons.length; i++){
      if(persons[i].getRole() == 2){
        System.out.println(persons[i].toString());
      }
    }
  }
}