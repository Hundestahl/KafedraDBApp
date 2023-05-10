package org.example.model.directory;

public class Discipline {
    private String nameOfDiscipline;
    private int codeOfDiscipline;
    public Discipline(String nameOfDiscipline, int codeOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
        this.codeOfDiscipline = codeOfDiscipline;
    }

    public String getNameOfDiscipline() {
        return nameOfDiscipline;
    }

    public void setNameOfDiscipline(String nameOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
    }

    public int getCodeOfDiscipline() {
        return codeOfDiscipline;
    }

    public void setCodeOfDiscipline(int codeOfDiscipline) {
        this.codeOfDiscipline = codeOfDiscipline;
    }

}
