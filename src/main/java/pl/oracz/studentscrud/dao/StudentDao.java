package pl.oracz.studentscrud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oracz.studentscrud.domain.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long> {

}
