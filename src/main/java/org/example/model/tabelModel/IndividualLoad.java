package org.example.model.tabelModel;

public class IndividualLoad {
    private int Volume;
    private int codeOfTeacher;
    private int codeOfSemester;
    private int numberOfStudent;
    private int codeOfClass;

    public IndividualLoad(int volume, int codeOfTeacher, int codeOfSemester, int numberOfStudent, int codeOfClass) {
        Volume = volume;
        this.codeOfTeacher = codeOfTeacher;
        this.codeOfSemester = codeOfSemester;
        this.numberOfStudent = numberOfStudent;
        this.codeOfClass = codeOfClass;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public int getCodeOfTeacher() {
        return codeOfTeacher;
    }

    public void setCodeOfTeacher(int codeOfTeacher) {
        this.codeOfTeacher = codeOfTeacher;
    }

    public int getCodeOfSemester() {
        return codeOfSemester;
    }

    public void setCodeOfSemester(int codeOfSemester) {
        this.codeOfSemester = codeOfSemester;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getCodeOfClass() {
        return codeOfClass;
    }

    public void setCodeOfClass(int codeOfClass) {
        this.codeOfClass = codeOfClass;
    }
}
