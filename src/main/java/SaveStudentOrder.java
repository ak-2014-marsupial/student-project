public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Alex";
        so.hLastName = "Petrov";
        so.wFirstName = "Galina";
        so.wLastName = "Petrova";

        StudentOrder so1;
        so1 = new StudentOrder();
        so1.hFirstName = "Andrew";
        so1.hLastName = "Sidorov";
        so1.wFirstName = "Svetlana";
        so1.wLastName = "Sidorova";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);


    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);
        return answer;
    }
}
