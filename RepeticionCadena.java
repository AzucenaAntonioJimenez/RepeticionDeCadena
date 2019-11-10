import java.io.*;
//Del numero de caracteres de la cadena  repertirla esas veces 
public class RepeticionCadena
{
    public static void main(String[] args)
   {
       BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in ) );
       String cadena="";
       System.out.println("Escribe un a cadena de texto");
       try{
           cadena = dataIn.readLine();
        }
        catch( IOException e ){
            System.out.println("Error!");
        }
        int a=1;
        System.out.println("\nRepeticion de cadena");
       while(a<=cadena.length())
       {
           System.out.println(cadena);
           a++;
        }
    }
}
