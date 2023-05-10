package org.example.model.tabelModel;

public class Groups {
    private String typeOfEducation;
    private int numberOfGroup;
    private int quantityOfStudents;
    private int codeOfSpeciality;

    public Groups(String typeOfEducation, int numberOfGroup, int quantityOfStudents, int codeOfSpeciality) {
        this.typeOfEducation = typeOfEducation;
        this.numberOfGroup = numberOfGroup;
        this.quantityOfStudents = quantityOfStudents;
        this.codeOfSpeciality = codeOfSpeciality;
    }

    public String getTypeOfEducation() {
        return typeOfEducation;
    }

    public void setTypeOfEducation(String typeOfEducation) {
        this.typeOfEducation = typeOfEducation;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public int getCodeOfSpeciality() {
        return codeOfSpeciality;
    }

    public void setCodeOfSpeciality(int codeOfSpeciality) {
        this.codeOfSpeciality = codeOfSpeciality;
    }
}
