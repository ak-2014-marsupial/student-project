public class MailSender {
    public AnswerStudent sendMail(StudentOrder so) {
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }
}
