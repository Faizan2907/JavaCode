import java.io.*;
public class DecimaltoBinary{
	public static void main(String args[]) throws IOException{
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.println("Please enter an 32bit IP address in Decimal format with seperate dot(.) after each 8bit");
		String ip = reader.readLine();
		
		String[] string = ip.split("\\.");
		
		System.out.println("IP Address in Binary format : ");
		for(String str:string){
			int octet = Integer.parseInt(str);
			String octatBinary = Integer.toBinaryString(octet);
			
			System.out.print(octatBinary + ".");
		}
		System.out.println();		
	}
}
