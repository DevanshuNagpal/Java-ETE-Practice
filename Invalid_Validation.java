import java.util.*;

class InvalidIDException extends Exception{
    public InvalidIDException(String message){
        super(message);
    }
}
class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}
class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String message){
        super(message);
    }
}
public class Invalid_Validation {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String name = in.nextLine().trim();
            if(!name.matches("^[a-zA-Z]+$")){
               throw new InvalidNameException("Invalid Name");
            }

            int id = Integer.parseInt(in.nextLine().trim());
            if(id <=0){
                throw new InvalidIDException("Invalid ID");

            }
            double salary = Double.parseDouble(in.nextLine().trim());
            if(salary < 0)
            {
                throw new InvalidSalaryException("Invalid Salary");
            }

        }
        catch (InvalidNameException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidIDException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }

    }
}
