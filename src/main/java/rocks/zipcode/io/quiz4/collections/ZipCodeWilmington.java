package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    ArrayList<Student> studentList = new ArrayList<>();
    Map<Student,Double> studyMap = new HashMap<>();


    public void enroll(Student student) {
        studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).equals(student)) {
                return true;
            }
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        for(Student student:studentList){
            studyMap.put(student,student.getTotalStudyTime());
        }

        return studyMap;
    }

}
