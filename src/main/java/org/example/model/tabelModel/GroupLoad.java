package org.example.model.tabelModel;

public class GroupLoad {
    private int volume;
    private int numberOfGroup;
    private String _FIOOfTeacher;
    private String nameOfDiscipline;
    private int codeOfSemester;
    private String typeOfClass;

    public GroupLoad(int volume, int numberOfGroup, String _FIOOfTeacher, String nameOfDiscipline, int codeOfSemester, String typeOfClass) {
        this.volume = volume;
        this.numberOfGroup = numberOfGroup;
        this._FIOOfTeacher = _FIOOfTeacher;
        this.nameOfDiscipline = nameOfDiscipline;
        this.codeOfSemester = codeOfSemester;
        this.typeOfClass = typeOfClass;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public String getFIOOfTeacher() {
        return _FIOOfTeacher;
    }

    public void setFIOOfTeacher(String _FIOOfTeacher) {
        this._FIOOfTeacher = _FIOOfTeacher;
    }

    public String getNameOfDiscipline() {
        return nameOfDiscipline;
    }

    public void setNameOfDiscipline(String nameOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
    }

    public int getCodeOfSemester() {
        return codeOfSemester;
    }

    public void setCodeOfSemester(int codeOfSemester) {
        this.codeOfSemester = codeOfSemester;
    }

    public String getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(String typeOfClass) {
        this.typeOfClass = typeOfClass;
    }
}
