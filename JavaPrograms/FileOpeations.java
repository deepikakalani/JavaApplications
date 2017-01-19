import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

class FileOperations{

	public List<String> ReadWrite(String filename)
	{

		List<String> wordList = new ArrayList<String>();
		try
		{
			FileInputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			String ln = null;
			while((ln = br.readLine())!=null)
			{	
				StringTokenizer st = new StringTokenizer(ln, " ,.:{}[]!");
				while(st.hasMoreTokens()){
					String temp = st.nextToken().toLowerCase();
					if(!wordList.contains(temp)){
						wordList.add(temp);
					}
				}
			}
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		return wordList;
	}
	
	public static void main(String[] args)
	{
		FileOperations rw = new FileOperations();
		List<String> WordList = rw.ReadWrite("/home/deepika/JavaApplications/JavaPrograms/sample.txt");
		for(String str:WordList)
			System.out.println(str);
	}	
}
