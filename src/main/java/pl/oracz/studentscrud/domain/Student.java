package pl.oracz.studentscrud.domain;


public class Student {

    private Long id;

    private String name;

    private String surname;

    private String grade;

    private String faculty;

    public Student() {
        //empty
    }

    public Student(String name, String surname, String grade, String faculty) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade='" + grade + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
