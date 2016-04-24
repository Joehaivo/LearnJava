package haivo.Collection;

import java.awt.*;

/**
 * Created by haivo on 2016/3/31.
 */
public class Course {
    public String courseId;
    public String courseName;
//    public List courseList;
    public Course(String courseId,String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;
        if(this.courseName == null){
            return true;
        }else{
            if(this.courseName.equals(course.courseName)){
                return true;
            }else{
                return false;
            }
        }
//        if (courseId != null ? !courseId.equals(course.courseId) : course.courseId != null) return false;
//        return courseName != null ? courseName.equals(course.courseName) : course.courseName == null;

    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        return result;
    }

}
