package domain;


public class Problem {
    private int number;
    private String assignment;

    public Problem(int n, String a) {
        this.assignment = a;
        this.number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
}
