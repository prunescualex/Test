package domain;


public class Student {
    private String firstName;
    private String lastName;
    private int nrMatricol;

    public Student(String f, String l, int nr) {
        this.firstName = f;
        this.lastName = l;
        this.nrMatricol = nr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }

    public void setNrMatricol(int nrMatricol) {
        this.nrMatricol = nrMatricol;
    }
}
