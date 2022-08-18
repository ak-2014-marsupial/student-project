public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer= checkCityRegister(so);
        AnswerWedding weddingAnswer = checkWedding(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    private static void sendMail(StudentOrder so) {

    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = null;
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        return new AnswerCityRegister();
    }

    private static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");

        return new AnswerWedding();
    }

    private static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check is running");
        return new AnswerChildren();
    }

    private static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Students is checking");
        return new AnswerStudent();
    }
}
