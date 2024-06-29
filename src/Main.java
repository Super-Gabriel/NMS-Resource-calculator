import src.EC;
import java.util.Scanner;

public class Main{
    public static void main(String[] UwU){
	Scanner scan = new Scanner(System.in);
	int e = 0; //extractores
	int d = 0; //contenedores
	
	do{
	    
	    System.out.println("n Extractores: ");
	    e = intReader();
	    System.out.println("n Depositos: ");
	    d = intReader();
	    
	    EC ec = new EC(e,d);
	    System.out.println(ec);

	    System.out.println("(Enter para continuar)");
	    scan.nextLine();
	}while(e != -1 && d != -1);
	
	System.out.println("adiós :c");
    }

    static int intReader(){
	Scanner intRd = new Scanner(System.in);
	int err = 0;
	int result = 0;
	do{
	    try{
		result = intRd.nextInt();
		err = 0;
	    }catch(Exception e){
		System.out.println("parametro invalido");
		err = 1;
		intRd.nextLine();
	    }
	}while(err == 1);
	return result;
    }
}
