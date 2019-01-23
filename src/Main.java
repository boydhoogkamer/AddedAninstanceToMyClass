public class Main{

    public static void main(String[] args){

        Main program = new Main();  //Maakt een object van de class Main. Het object is program
        program.run();              //voert de functie run uit

    }


    private void run(){
    /*
    In de onderstaande code worden er eerst 3 studenten aangemaakt. (r 20 / 22)
    Vervolgens worden er voor een aantal van deze studenten cijfers aangemaakt. (grades) (r 24 / 26)
    Vervolgens wordt een cijfer van 1 van de studenten aangepast. (r 28)
    Dan wordt het aangepaste cijfer geprint met daarbij de naam van het vak en de opdracht. (r 33 / 39)
    */

    Docent[] docenten = new Docent [3];
    docenten[0] = new Docent ("Erwin", "PRO2", 30);
    docenten[1] = new Docent ("Ed", "PRO1", 50);
    docenten[2] = new Docent ("Gretha", "SLB", 34);



        docenten[0].setNaam("henk");
        docenten[0].setVak("PRO1");

        System.out.println(docenten[0].getNaam());
        System.out.println(docenten[0].getVak());
        System.out.println(docenten[0].getLeeftijd());
/*
        for (Docent d: docenten){
            System.out.println(d.getDing1());
            System.out.println(d.getDing1());
            System.out.println(d.getDing1());
        }

*/
        Student[] students = new Student[5];                    //Maakt een array waarin 5 objecten passen van het type Student
        students[0] = new Student(001,"Henk", "Vries de", 65);  //Maakt een object/Instance aan van de class Student. Het object is students[0]
        students[1] = new Student(002,"Pietje", "Puk", 45);     //Maakt een object/Instance aan van de class Student. Het object is students[1]
        students[2] = new Student(003,"Gekke", "Gerrit", 33);   //etc...

        students[1].addGrade(new Grade("tpr" ,"P1L4", 7));      //Maakt een object/Instance aan van de class Grade. Geeft dit object mee als argument voor de method addGrade
        students[1].addGrade(new Grade("tpr" ,"P2L6", 9));      //Deze method is gedefinieerd in de Class Student.
        students[2].addGrade(new Grade("tpr" ,"P1L4", 4));

        students[1].getGrade(0).changeResult(10);               //Roept de method changeResult aan. Deze is gedefinieerd in de class Grade
        //De method getGrade is gedefinieerd in de class Student. Deze geeft een grade object/Instance terug

        System.out.println(students[1].getName() +              //Roept de method getName aan. Deze is gedefinieerd in de class Student
                "s grade for " +
                students[1].getGrade(0).getCourse() +                   //Roept de method getCourse aan. Deze is gedefinieerd in de class Grade
                " , " +
                students[1].getGrade(0).getAssignment() +               //Roept de method getAssignment aan. Deze is gedefinieerd in de class Grade
                " changed to: " +
                students[1].getGrade(0).getResult());                   //Roept de method getResult aan. Deze is gedefinieerd in de class Grade
    }

}