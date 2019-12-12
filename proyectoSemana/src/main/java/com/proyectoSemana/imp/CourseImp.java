package com.proyectoSemana.imp;

import com.proyectoSemana.model.Course;
import com.proyectoSemana.repository.CourseRepository;
import com.proyectoSemana.service.ICourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseImp implements ICourseServices {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveLogin(Course course) {
        Course courseLocal = null;
        try {
            courseLocal = courseRepository.save(course);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return courseLocal;
    }


}
