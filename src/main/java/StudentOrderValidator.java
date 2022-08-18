public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        while (true) {

            StudentOrder so = readStudentOrder();
            System.out.println("Start");
            if (so == null) {
                break;//выбрасывает из цикла
            }
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if(!cityAnswer.success){
                continue;// на следующую итерацию
            }
            AnswerWedding weddingAnswer = checkWedding(so);
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    private static void sendMail(StudentOrder so) {
        System.out.println("Mail is sending");

    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success=false;

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
