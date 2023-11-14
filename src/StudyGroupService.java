import java.util.List;
import java.util.ArrayList;

class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}

// Пример использования в Контроллере
class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        // Получение объектов Teacher и List<Student> по teacherId и studentIds
        Teacher teacher = new Teacher(teacherId);
        List<Student> students = createStudents(studentIds);

        // Формирование Учебной Группы
        return studyGroupService.createStudyGroup(teacher, students);
    }

    private List<Student> createStudents(List<Integer> studentIds) {
        // Создание объектов студентов по их идентификаторам
        // Здесь может быть логика загрузки студентов из базы данных или других источников
        // В данном примере мы просто создаем новых студентов с указанными идентификаторами
        List<Student> students = new ArrayList<>();
        for (Integer studentId : studentIds) {
            students.add(new Student(studentId));
        }
        return students;
    }
}