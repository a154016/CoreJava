import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeFromFile {

    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee= (Employee) objectInputStream.readObject();
            System.out.println(employee.getEmployeeName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
