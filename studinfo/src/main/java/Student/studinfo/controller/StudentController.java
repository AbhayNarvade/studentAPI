package Student.studinfo.controller;

import Student.studinfo.model.student;
import Student.studinfo.services.StudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    private StudServices studServices;

    @GetMapping("")
    public List<student> Showalldata()
    {
    return  studServices.getAll();
    }

    @PostMapping("/add")
    public student adddata(@RequestBody student s)
    {
        return studServices.adddata(s);
    }


    @PutMapping("/update")
    public student updatedata(@RequestBody student s)
    {
        return studServices.updatedata(s);
    }

    @DeleteMapping("/{id}")
    public void Deletedata(@PathVariable int id)
    {
        studServices.deletedata(id);
    }

}
