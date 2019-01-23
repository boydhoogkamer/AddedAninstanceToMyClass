import java.util.ArrayList;
public class Docent{
private String naam;//member
private String vak;
private int leeftijd;

public Docent (String myName, String mySubject, int myAge){
    naam = myName;
    vak = mySubject;
    leeftijd = myAge;
}
public String getNaam(){//getter
    return naam;
}
public void setNaam(String newName){


    this.naam = newName;//this verwijst naar de member
}
    public String getVak(){//getter
        return vak;
    }
    public void setVak(String newVak){


        this.vak = newVak;//this verwijst naar de member
}

    public int getLeeftijd(){//getter
        return leeftijd;
    }




}
