package Student.studinfo.services;

import Student.studinfo.model.student;
import Student.studinfo.repositary.studentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImplementation implements StudServices
{
    @Autowired
    private studentRepositary  studentRepositary;

    @Override
    public List<student> getAll() {
        return (List<student>) studentRepositary.findAll();
    }

    @Override
    public student adddata(student s) {
        return studentRepositary.save(s);
    }

    @Override
    public student updatedata(student s) {
        if(studentRepositary.existsById(s.getId()))
        {
            return studentRepositary.save(s);
        }
        else{
            return null;
        }
    }

    @Override
    public void deletedata(int id) {
        studentRepositary.deleteById(id);
    }
}
