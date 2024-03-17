public class AgeLessThanZeroExeption extends Exception{

    public AgeLessThanZeroExeption(){
    }//default constructor

    public AgeLessThanZeroExeption(String message){
        super(message);
    }//constructor with message
}
