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
            if (!cityAnswer.success) {
                System.out.println("Continue");
                continue;
            }
            AnswerWedding weddingAnswer = checkWedding(so);
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegesterValidator crv1 = new CityRegesterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";
        CityRegesterValidator crv2 = new CityRegesterValidator();
        crv2.hostName = "Host2";
        crv2.login = "Login2";
        crv2.password = "Password2";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        AnswerCityRegister ans2 = crv2.checkCityRegister(so);
        return ans1;
    }

    private static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    private static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    private static AnswerStudent checkStudent(StudentOrder so) {
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }

    private static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);

    }
}
