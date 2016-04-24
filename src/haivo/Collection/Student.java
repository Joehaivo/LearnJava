package haivo.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by haivo on 2016/3/31.
 */
public class Student {
    public String id;
    public String name;
    public Set courses;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
