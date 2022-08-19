public class CityRegesterValidator {
    String hostName;//имя компьютера на который посылаем запрос на проверку
    String login;
    String password;
    AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running:"+hostName+" ,"
                + login + " ,"+ password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success=false;

        return answerCityRegister;
    }

}
