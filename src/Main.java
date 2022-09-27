public class Main {

    public static void main(String[] args) {
        //create objects of Number
        Number n = new Number();
        Number n2 = new Number();

        //setup name and number for both objects
        n.setNameAndNumber("Anna", "3343457454");
        n2.setNameAndNumber("Mike", "3675765765");

        //access name as well as number using getter and print
        System.out.println("Name - " + n.getName() + ", number - " + n.getNumber());
        System.out.println("Name - " + n2.getName() + ", number - " + n2.getNumber());
    }
}
