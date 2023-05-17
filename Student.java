public class Student {

  private String Name;
   private String Surname;
  private int Age;
  private String Urodziny;

  public Student(String name, String surname, String urodziny, int age) {
    Name = name;
    Age = age;
    Surname = surname;
    Urodziny = urodziny;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
  public String GetUrodziny() {return Urodziny;}
  public String ToString() {
    return Name + " " + Surname + " " + Urodziny + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error","Parse Error", -1);
    return new Student(data[0],data[1], data[2], Integer.parseInt(data[3]));
  }
}  