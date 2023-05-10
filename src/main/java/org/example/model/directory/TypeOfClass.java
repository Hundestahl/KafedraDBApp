package org.example.model.directory;

public class TypeOfClass {
    private String typeOfClass;
    private int codeOfClass;

    public TypeOfClass(String typeOfClass, int codeOfClass) {
        this.typeOfClass = typeOfClass;
        this.codeOfClass = codeOfClass;
    }

    public String getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(String typeOfClass) {
        this.typeOfClass = typeOfClass;
    }

    public int getCodeOfClass() {
        return codeOfClass;
    }

    public void setCodeOfClass(int codeOfClass) {
        this.codeOfClass = codeOfClass;
    }
}
