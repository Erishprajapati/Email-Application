package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        //in the parameter we have passed the first and last name
        Email em1 = new Email("Erish", "Prajapati");
        Email em2 = new Email("sandip", "thapa");

        em2.showInfo();

        em1.showInfo();


    }

}
