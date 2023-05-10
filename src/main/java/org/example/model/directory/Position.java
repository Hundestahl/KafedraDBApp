package org.example.model.directory;

public class Position {
    private String nameOfPosition;
    private int codeOfPosition;

    public Position(String nameOfPosition, int codeOfPosition) {
        this.nameOfPosition = nameOfPosition;
        this.codeOfPosition = codeOfPosition;
    }

    public String getNameOfPosition() {
        return nameOfPosition;
    }

    public void setNameOfPosition(String nameOfPosition) {
        this.nameOfPosition = nameOfPosition;
    }

    public int getCodeOfPosition() {
        return codeOfPosition;
    }

    public void setCodeOfPosition(int codeOfPosition) {
        this.codeOfPosition = codeOfPosition;
    }
}
