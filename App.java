public class App {
    public static void main(String[] args) throws Exception {

        String today = "monday";

        switch (today) {
            case "monday":
                System.out.println("I go to school!");
                break;
            case "tuesday":
                System.out.println("I do my homeworks!");
                break;
            case "wednesday":
                System.out.println("I do all my laundry!");
                break;
            case "thursday":
                System.out.println("I hang out with my friends!");
                break;
            case "friday":
                System.out.println("I go on a date with my sister!");
                break;
            case "Saturday":
                System.out.println("I redo all my notes in my subjects!");
                break;
            case "Sunday":
                System.out.println("I go visit a friend!");
                break;
            default:
                break;
        }

    }
}
