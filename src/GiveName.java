public class GiveName {

    public GiveName(){
        System.out.println("Without parameter");
    }

    public GiveName(int year){
        System.out.println("Parameter " + year);
    }

    public String returnName(String name){
        return "Name is " + name;
    }
}
