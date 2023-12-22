package salt.testautouni.javacourse.exercises.map;

import java.util.Map;

import static salt.testautouni.javacourse.exercises.map.TestResults.getMakeUpGrades;
import static salt.testautouni.javacourse.exercises.map.TestResults.getOriginalGrades;

public class Upgrades {
    public static void main(String[] args) {
        Map<String, Integer> grades = getOriginalGrades();
        Map<String, Integer> test = getMakeUpGrades();

        for (var student: test.entrySet()) {
            Integer firstGrade = grades.get(student.getKey());
            Integer secondGrade = test.get(student.getKey());
            if(secondGrade > firstGrade){
                grades.put(student.getKey(), secondGrade);
            }
//            System.out.println("Student: " + student.getKey() + ", Grade:" + grades.get(student.getKey()));
        }

        System.out.println("Final Grades:");
        grades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
    }
}
