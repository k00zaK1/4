/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println(" 1- wylacz program, 2- wypisz wszystkich studentow, 3-dopisz studentow ");
    wybor=scan.nextInt();
    switch(wybor) {
      case 1:
        System.exit(0);
      case 2:
        try{
          Service s = new Service();
          var students = s.getStudents();
          for(Student current:students) {
            System.out.println(current.ToString());
          }
          }catch(IOException e){
          
        }
    
      
    }
    }
  }
