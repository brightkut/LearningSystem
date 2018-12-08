package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Course {

    private final StringProperty subjectId;

    private final StringProperty subjectName;
    private final StringProperty unit;
    private final StringProperty status;
    private final StringProperty term;
    private final StringProperty year;
    private final StringProperty subjectPass;


    public Course(String a,String b,String c,String d,String e,String f,String g){
        this.subjectId = new SimpleStringProperty(a);
        this.subjectName = new SimpleStringProperty(b);
        this.unit = new SimpleStringProperty(c);
        this.status = new SimpleStringProperty(d);
        this.term = new SimpleStringProperty(e);
        this.year = new SimpleStringProperty(f);
        this.subjectPass = new SimpleStringProperty(g);
    }

    public String getSubjectId() {
        return subjectId.get();
    }

    public StringProperty subjectIdProperty() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId.set(subjectId);
    }

    public StringProperty subjectNameProperty() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName.set(subjectName);
    }

    public String getUnit() {
        return unit.get();
    }

    public StringProperty unitProperty() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit.set(unit);
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getTerm() {
        return term.get();
    }

    public StringProperty termProperty() {
        return term;
    }

    public void setTerm(String term) {
        this.term.set(term);
    }

    public String getYear() {
        return year.get();
    }

    public StringProperty yearProperty() {
        return year;
    }

    public void setYear(String year) {
        this.year.set(year);
    }

    public String getSubjectPass() {
        return subjectPass.get();
    }

    public StringProperty subjectPassProperty() {
        return subjectPass;
    }

    public void setSubjectPass(String subjectPass) {
        this.subjectPass.set(subjectPass);
    }

    public String getSubjectName() {
        return subjectName.get();
    }






}
