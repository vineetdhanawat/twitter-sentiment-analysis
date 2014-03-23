/**
* This file is used to extract Twitter URLs out of emails
* One still needs twitter API to extract all the tweets
*/
import java.io.*;
import java.util.regex.*;
class FileRead 
{
	public static void main(String args[])
	{
		try{
		// Open the file that is the first 
		// command line parameter
		FileInputStream fstream = new FileInputStream("email.eml");
		DataInputStream in = new DataInputStream(fstream);
		FileWriter fostream = new FileWriter("out.txt",true);
		BufferedWriter out = new BufferedWriter(fostream);
		// Get the object of DataInputStream
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		//Read File Line By Line
		while ((strLine = br.readLine()) != null) 
		{
			// Print the content on the console
			Pattern pattern = Pattern.compile(
            "\\b(((ht|f)tp(s?)\\:\\/\\/|~\\/|\\/)|www.)" + 
            "(\\w+:\\w+@)?(([-\\w]+\\.)+(com|org|net|gov" + 
            "|mil|biz|info|mobi|name|aero|jobs|museum" + 
            "|travel|[a-z]{2}))(:[\\d]{1,5})?" + 
            "(((\\/([-\\w~!$+|.,=]|%[a-f\\d]{2})+)+|\\/)+|\\?|#)?" + 
            "((\\?([-\\w~!$+|.,*:]|%[a-f\\d{2}])+=?" + 
            "([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)" + 
            "(&(?:[-\\w~!$+|.,*:]|%[a-f\\d{2}])+=?" + 
            "([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)*)*" + 
            "(#([-\\w~!$+|.,*:=]|%[a-f\\d]{2})*)?\\b");
			Matcher matcher = pattern.matcher(strLine);
			while (matcher.find())
			{				
				try
				{
					String searchMe = matcher.group();
					String findMe = "/status/";
					int searchMeLength = searchMe.length();
					int findMeLength = findMe.length();
					boolean foundIt = false;
					for (int i = 0; i <= (searchMeLength - findMeLength); i++)
					{
						if (searchMe.regionMatches(i, findMe, 0, findMeLength))
						{
							out.write(matcher.group()+"\n");
						}
					}
				}
				catch (Exception e)
				{
					//Catch exception if any
					System.err.println("Error: " + e.getMessage());
				}
			}
			//System.out.println (strLine);
		}
		//Close the input stream
		in.close();
		//Close the output stream
		out.close();
		}catch (Exception e)
		{
			//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}