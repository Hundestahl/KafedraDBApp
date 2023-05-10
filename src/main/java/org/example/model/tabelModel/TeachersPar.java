package org.example.model.tabelModel;


public class TeachersPar {
    private String _FIOOfTeachers;
    private String nameOfPosition;
    private String typeOfClass;
    private int codeOfSemester;
    private int volume;

    public TeachersPar(String _FIOOfTeachers, String nameOfPosition, String typeOfClass, int codeOfSemester, int volume) {
        this._FIOOfTeachers = _FIOOfTeachers;
        this.nameOfPosition = nameOfPosition;
        this.typeOfClass = typeOfClass;
        this.codeOfSemester = codeOfSemester;
        this.volume = volume;
    }

    public String getFIOOfTeachers() {
        return _FIOOfTeachers;
    }

    public void setFIOOfTeachers(String _FIOOfTeachers) {
        this._FIOOfTeachers = _FIOOfTeachers;
    }

    public String getNameOfPosition() {
        return nameOfPosition;
    }

    public void setNameOfPosition(String nameOfPosition) {
        this.nameOfPosition = nameOfPosition;
    }

    public String getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(String typeOfClass) {
        this.typeOfClass = typeOfClass;
    }
    
    public int getCodeOfSemester() {
        return codeOfSemester;
    }

    public void setCodeOfSemester(int codeOfSemester) {
        this.codeOfSemester = codeOfSemester;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        String value = this._FIOOfTeachers +
        this.nameOfPosition +
        this.typeOfClass +
        this.codeOfSemester +
        this.volume;
        System.out.println(value);
        return value;
    }
}

