package org.example.model.tabelModel;

public class Students {
    private int numberOfStudent;
    private String FIOOfStudent;
    private int numberOfGroup;

    public Students(int numberOfStudent, String FIOOfStudent, int numberOfGroup) {
        this.numberOfStudent = numberOfStudent;
        this.FIOOfStudent = FIOOfStudent;
        this.numberOfGroup = numberOfGroup;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public String getFIOOfStudent() {
        return FIOOfStudent;
    }

    public void setFIO(String FIOOfStudent) {
        this.FIOOfStudent = FIOOfStudent;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }
}
