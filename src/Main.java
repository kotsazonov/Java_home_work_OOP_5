import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объекта StudyGroupService
        StudyGroupService studyGroupService = new StudyGroupService();

        // Создание объекта Controller
        Controller controller = new Controller(studyGroupService);

        // Пример создания учебной группы
        int teacherId = 1;
        List<Integer> studentIds = Arrays.asList(101, 102, 103);

        StudyGroup studyGroup = controller.createStudyGroup(teacherId, studentIds);

        // Вывод информации о созданной учебной группе
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель ID: " + studyGroup.getTeacher().getId());
        System.out.println("Студенты ID:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getId());
        }
    }
}