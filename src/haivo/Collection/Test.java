package haivo.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by haivo on 2016/3/31.
 */
public class Test {
    private CourseList mCourseList = new CourseList();
    private GenericCourseList mGenericCourseList = new GenericCourseList();
    private CourseSet mCourseSet = new CourseSet();
    private StringList mStringList = new StringList();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Test test = new Test();
//        test.addToList();
//        test.getAllFromList();
//        test.testListContainsByName();
//        test.testModifyList();
//        test.getFromList();
//        test.testRemoveFromList();
//        test.getAllFromList();
//        test.addToGenericCourseList();
//        test.getAllCourseFromGenericList();
        test.addToGenericCourseSet();
        test.getAllFromGenericCourseSet();
        for (int i = 0; i < 10; i++) {
            test.mStringList.stringList.add(test.addRandomString());
            System.out.println(test.mStringList.stringList.get(i));
        }
        Collections.sort(test.mStringList.stringList);
        System.out.println("afterSort: ");
        for (int i = 0; i < test.mStringList.stringList.size(); i++) {
            System.out.println(test.mStringList.stringList.get(i));
        }
    }

    public void addToList() {
        Course cr1 = new Course("1", "大学英语");
        mCourseList.courseList.add(cr1);
        System.out.println("添加了一门课程：" + cr1.courseId + ": " + cr1.courseName);
        Course cr2[] = {new Course("2", "Java"), new Course("3", "高等数学")};
        Collections.addAll(mCourseList.courseList, cr2);
    }

    public void getAllFromList() {
//        Course gotCourse0 = (Course) courseList.courseList.get(0);
//        System.out.println("找到了一门课程："+gotCourse0.courseId+": "+gotCourse0.courseName);
//        Course gotCourse1 = (Course) courseList.courseList.get(1);
//        Course gotCourse2 = (Course) courseList.courseList.get(2);
//        System.out.println("找到了课程："+gotCourse1.courseId+": "+gotCourse1.courseName+
//                            "; "+gotCourse2.courseId+": "+gotCourse2.courseName);
        int listSize = mCourseList.courseList.size();
        for (int i = 0; i < listSize; i++) {
            Course crTemp = (Course) mCourseList.courseList.get(i);
            System.out.println("找到了课程：" + crTemp.courseId + ": " + crTemp.courseName);
        }
    }

    public void testListContainsByName() {
        System.out.println("input course name: ");
        String inputName = scanner.next();
        Course inputCourse = new Course("", inputName);
        if (mCourseList.courseList.contains(inputCourse)) {
            System.out.println("Contain true");
        } else {
            System.out.println("Contain false");
        }
    }

    public void testModifyList() {
        mCourseList.courseList.set(2, new Course("3", "大学物理"));
    }

    public void testRemoveFromList() {
        System.out.println("input course name you want remove: ");
        String inputName = scanner.next();
        Course inputCourse = new Course("", inputName);
        if (mCourseList.courseList.contains(inputCourse)) {
            mCourseList.courseList.remove(inputCourse);
        } else {
            System.out.println("The name you input not found in course list");
        }
    }

    public void getAllCourseFromGenericList() {
        for (Course crTemp : mGenericCourseList.coursesListGeneric) {
            System.out.println("找到了课程：" + crTemp.courseId + ": " + crTemp.courseName);
        }
    }

    public void addToGenericCourseList() {
        mGenericCourseList.coursesListGeneric.add(new Course("4", "概率论"));
    }

    public void addToGenericCourseSet() {
        mCourseSet.courseSet.add(new Course("5", "Java基础"));
    }

    public void getAllFromGenericCourseSet() {
        for (Course x :
                mCourseSet.courseSet) {
            System.out.println("找到了课程：" + x.courseId + ": " + x.courseName);
        }
    }

    public String addRandomString() {
        Random random = new Random();
        int length = random.nextInt(10);
        String diction = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuffer stringBuffer = new StringBuffer(10);
        do {
            char randomChar = diction.charAt(random.nextInt(62));
            stringBuffer.append(randomChar);
            length--;
        } while (length >= 0);
        return stringBuffer.toString();
    }
}


