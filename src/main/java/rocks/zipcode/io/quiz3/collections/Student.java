package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {

        return labs.get(0);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {


    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "labs=" + labs +
                '}';
    }
}
