package org.example.model.tabelModel;

public class Teachers {
    private String FIOOfTeachers;
    private int codeOfPosition;
    private int codeOfTeachers;

    public Teachers(String FIOOfTeachers, int codeOfPosition, int codeOfTeachers) {
        this.FIOOfTeachers = FIOOfTeachers;
        this.codeOfPosition = codeOfPosition;
        this.codeOfTeachers = codeOfTeachers;
    }

    public String getFIOOfTeachers() {
        return FIOOfTeachers;
    }

    public void setFIOOfTeachers(String FIOOfTeachers) {
        this.FIOOfTeachers = FIOOfTeachers;
    }

    public int getCodeOfPosition() {
        return codeOfPosition;
    }

    public void setCodeOfPosition(int codeOfPosition) {
        this.codeOfPosition = codeOfPosition;
    }

    public int getCodeOfTeachers() {
        return codeOfTeachers;
    }

    public void setCodeOfTeachers(int codeOfTeachers) {
        this.codeOfTeachers = codeOfTeachers;
    }
}
