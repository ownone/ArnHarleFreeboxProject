package bts.sio;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Option op1 = new Option(1,"Airbag",800); 
        Option op2 = new Option(2,"Toit ouvrant",1300);
        
        Neuve n1 = new Neuve("AG-456-VF", 15000);
        
        Occasion o1 = new Occasion("9562PO86", 7000, 50000, 2);
        
        System.out.println(op1.toString()); 
        System.out.println(op2.toString()); 
        System.out.println(o1.toString());    
        
        n1.addOptions(op1);
        n1.addOptions(op2);
        
        System.out.println(n1.toString());
	}

}
