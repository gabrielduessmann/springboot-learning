package springbootstarter.Course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseService
{
	@Autowired
	private CourseRepository courseRepository;

//	public List<Course> getAllCourses(){
//
//	}

	public Course getOneCourse(String id){
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course){
		courseRepository.save(course);
	}

	public void updateCourse(Course course){
		courseRepository.save(course);
	}

	public void deleteCourse(String id){
		courseRepository.deleteById(id);
	}

}
