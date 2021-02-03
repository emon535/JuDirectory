package com.emon535.ju_direcroty;

import java.util.ArrayList;
import java.util.List;

public class TeachersDirectory {
    List<String> getTeachersbyUniversityName (String universityName){

        List temporaryList = new ArrayList<String>();
        if(universityName.equals("JU")){
            temporaryList.add("Mozammel Sir");
            temporaryList.add("Ezahrul Sir");
            temporaryList.add("Rafsan Jani Sir");
            temporaryList.add("Liton Sir");
        } else if(universityName.equals("SUST")){
            temporaryList.add("Mamun Sir");
            temporaryList.add("Shaheed Sir");
            temporaryList.add("Zafor Iqbal Sir");
            temporaryList.add("Ronju Sir");
        }else {
            temporaryList.add("No Record");
        }

        return temporaryList;
    }
}
