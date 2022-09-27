public class Number {
    //declare private instance variables
    private String name;
    private String number;

    //getter methods
    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    //setter method
    public void setNameAndNumber(String name, String number){
        this.name = name;
        this.number = number;
    }
}
