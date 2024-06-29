/**
 * @author - Super-Gabriel
 */
package src;

public class EC{
    private int x;//cantidad de extractores
    private double b;//B(x)
    private double p;//P(x)
    private int dep;//cantidad de depósitos

    private double mcx;//Mc(x)
    private double cx;//C(x)
    private double cPlusx;//C+(x)
    private double fix;//Fi(x)
    private double ox;//O(x)
    private double pfx;//Pf(x)

    private double plac;
    private double pfxalt;
    
    /**
     * metodo constructor
     * @param e - cantidad de extractores
     * @param d - cantidad de depositos
     */
    public EC(int e, int d){
	x = e;
	dep = d;
	
	//b = x * 0.9444;//calculando B(x)
	//p = (b * 1.0714) + x;//calculando P(x)
	b = x * 0.8666;
	p = (b * 0.9677) + (x * 1.0967);

	mcx = 50 * ( p + (2 * x) ); //calculando Mc(x)
	cx = 10 * ( x + dep); //calculando C(x)
	cPlusx = 100 * b; //calculando Mc(x)
	fix = 60 * b; //calculando Fi(x)
	ox = 30 * p; //calculando O(x)
	pfx = 50 * ( p + (5.5 * x) + (10.5 * dep) ); //calculando Pf(x)

	////////
	plac = p + (10 * dep) + (5 * x);
	pfxalt = ((x + dep) - 1) * 25;
    }

    @Override
    public String toString(){
	String form="";
	form += "\nExtractores: "+x+"\n";
	form += "Depositos: "+dep+"\n";
	form += "n Baterias: "+b+"\n";
	form += "n Paneles: "+p+"\n\n";
	form += "RECURSOS NECESARIOS:\n\n";
	form += "c MetalC: "+mcx+"\n";
	form += "c Carbono: "+cx+"\n";
	form += "c Carbono+: " +cPlusx+"\n";
	form += "c Ferrita i: "+fix+"\n";
	form += "c Oro: "+ox+"\n";
	form += "c Ferrita: "+pfx+"\n\n";
	form += "O:\n\n";
	form += "n Placas: "+plac+"\n";
	form += "c Ferrita: "+pfxalt+"\n";

	return form;
    }
}
