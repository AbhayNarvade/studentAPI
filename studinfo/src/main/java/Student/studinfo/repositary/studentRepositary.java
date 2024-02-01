package Student.studinfo.repositary;

import Student.studinfo.model.student;
import org.springframework.data.repository.CrudRepository;

public interface studentRepositary extends CrudRepository<student, Integer>
{
}
