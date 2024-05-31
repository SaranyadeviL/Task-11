class IncorrectPasswordException extends Exception {
    public String getMessage;

    public IncorrectPasswordException(String message){
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}