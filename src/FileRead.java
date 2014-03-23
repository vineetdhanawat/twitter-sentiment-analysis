/**
* This file is used to extract TEXT out of emails in the given format - IFTTT
*/

import java.io.*;

public class FileRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curLine = null;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("email.eml"));
			FileWriter fostream = new FileWriter("out.txt",true);
			BufferedWriter out = new BufferedWriter(fostream);
			while ((curLine = br.readLine()) != null) {
				
				if(curLine.contains("status")){
				
				curLine = curLine.replace(",", " ");
				//System.out.println(curLine);
				//System.out.println("\n");
				String str = curLine;
				String []temp = str.split("http://twitter.com/");
				String output1= temp[0];
				String [] output2 = temp[1].split(" ");
				
				//System.out.println(output1);
				//System.out.println("http://twitter.com/"+output2[0]);
				out.write(output1+",");
				out.write("http://twitter.com/"+output2[0]+"\n");
				//out.write(curLine+"\n");
				}
			}
		
		} catch(IOException e) {
			e.printStackTrace();
		} 	

	}

}
