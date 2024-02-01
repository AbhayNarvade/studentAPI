package Student.studinfo.services;

import Student.studinfo.model.student;

import java.util.List;

public interface StudServices
{
    List<student> getAll ();
    student adddata(student s);
    student updatedata(student s);
    void deletedata(int id);

}
