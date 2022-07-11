import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;


//copiar datos de un fichero a otro
public class InputOutput_2 {
    public static void main(String[] args) {
        try{
            InputStream in = new FileInputStream("/etc/passwd");
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);

        }catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }

    }
}
