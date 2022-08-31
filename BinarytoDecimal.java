import java.io.*;
public class BinarytoDecimal{
	public static void main(String args[])throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		 

		System.out.println("Please enter an 32bit IP address in Binary format with seperate dot(.) after each 8bit");
		String ip = reader.readLine();
		
		String[] string = ip.split("\\.");
		
		System.out.println("IP Address in Decimal format : ");
		for(String str:string){
			int binary = Integer.parseInt(str, 2);
			System.out.print(binary + ".");
		}
		System.out.println();
	}
}
