public class Grade {
    //Global variabelen die alleen binnen deze class beschikbaar zijn (private)
    private String _courseCode;
    private String _assignmentCode;
    private float _result;
    public Grade(String courseCode, String assCode, float result){
        //dit is de constructor van de class Grade
        //Deze wordt 1x uitgevoerd als er van de class een object wordt aangemaakt. (Main.java regel 24)
        //In deze constructor worden de waarden van de argumenten (courseCode, assCode, result) opgeslagen in de global variabelen (r3 / 5)
        _courseCode = courseCode;
        _assignmentCode = assCode;
        _result = result;
    }
    public void changeResult(float newGrade){     //Method changeResult waarmee het cijfer kan worden aangepast. (aangeroepen in Main.java r 28)
        _result = newGrade;
    }
    public float getResult(){                     //Method getResult waarmee het cijfer kan worden gelezen. (aangeroepen in Main.java r 37)
        return _result;
    }
    public String getCourse(){                    //method getCourse waarmee het vak kan worden gelezen. (aangeroepen in Main.java r 33)
        return _courseCode;
    }
    public String getAssignment(){                //Method getAssignment waarmee de opdrachtcode kan worden gelezen. (aangeroepen in Main.java r 35)
        return _assignmentCode;
    }

}