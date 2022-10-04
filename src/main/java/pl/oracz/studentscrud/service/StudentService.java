package pl.oracz.studentscrud.service;

import pl.oracz.studentscrud.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> finAllStudents();

    Optional<Student> findStudentById(Long studentId);

    void saveStudent (Student student);

    void deleteStudent (Long id);

}
