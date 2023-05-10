package org.example.model.directory;

public class Speciality {
    private String nameOfSpeciality;
    private int codeOfSpeciality;

    public Speciality(String nameOfSpeciality, int codeOfSpeciality) {
        this.nameOfSpeciality = nameOfSpeciality;
        this.codeOfSpeciality = codeOfSpeciality;
    }

    public String getNameOfSpeciality() {
        return nameOfSpeciality;
    }

    public void setNameOfSpeciality(String nameOfSpeciality) {
        this.nameOfSpeciality = nameOfSpeciality;
    }

    public int getCodeOfSpeciality() {
        return codeOfSpeciality;
    }

    public void setCodeOfSpeciality(int codeOfSpeciality) {
        this.codeOfSpeciality = codeOfSpeciality;
    }
}
