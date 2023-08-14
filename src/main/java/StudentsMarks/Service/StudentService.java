package StudentsMarks.Service;

import StudentsMarks.Entity.Student;
import StudentsMarks.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudentsSortedByMarks() {
        return studentRepository.findAllByOrderByMarksDesc();
    }
}
