import java.util.ArrayList;
public class Student{
    //Global private variabelen die binnen deze class beschikbaar zijn
    private int _id;
    private String _name;
    private String _lastName;
    private int _age;
    private ArrayList<Grade> _grades;       //Speciale soort array waarbij je extra ruimte voor elementen toe kunt voegen tijdens het uitvoeren van je programma
    public Student(int id, String name, String lastName, int age){
        //Constructor net als in de Grade class
        _id = id;
        _name = name;
        _lastName = lastName;
        _age = age;
        _grades = new ArrayList<Grade>();     //Het aanmaken van een nieuwe lege ArrayList
    }
    public String getName(){                //MEthod getName om de naam van de student uit te lezen. (aangeroepen in Main.java r 31)
        return _name;
    }

    public void addGrade(Grade g){          //MEthod addGrade om een nieuwe beoordeling aan een student te geven. (aangeroepen in Main.java r 24 / 26)
        _grades.add(g);
    }

    public Grade getGrade(int number){      //MEthod getGrade om een object van het type grade te kunnen lezen. (aangeroep in Main.java r 33 / 37)

        if(_grades.size() > number){
            return _grades.get(number);
        }else{
            System.out.println("grade not found @"+ number);
            return null;
        }

    }
}
