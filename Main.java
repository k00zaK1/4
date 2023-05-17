
/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println(" 1- zakonczenie programu, 2-wprowadz nowego studenta, 3-wyipsac wszystkich studentów");
    wybor = scan.nextInt();
    switch (wybor) {
      case 1:
        System.exit(0);
      case 2:
  
        System.out.println("Podaj imię: ");
        String name = scan.next();
         System.out.println("Podaj nazwisko: ");
        String secondname = scan.next();
        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();
        System.out.println("Podaj date urodzin xx-yy-zzzz");
        String urodziny =scan.next();
        
        try {
          Service s = new Service();
          s.addStudent(new Student(name, secondname, urodziny, age ));
        
        } catch (IOException e) {

        }
      case 3:
        try {
          Service s = new Service();
          var students = s.getStudents();
          for (Student current : students) {
            System.out.println(current.ToString());
          }
        } catch (IOException e) {

        }
        
    }
  }
}