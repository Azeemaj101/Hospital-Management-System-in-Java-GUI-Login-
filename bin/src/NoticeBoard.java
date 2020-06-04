import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoticeBoard 
{
	private String Message;
	public void SetNoticeBoard(String Message)
	{
		this.Message=Message;
	}
	public void InsertNew () throws IOException
	{
		FileWriter Fout;
		BufferedWriter Bout = null;
		Fout=new FileWriter("NoticeBoard.txt");
	    Bout=new BufferedWriter(Fout);
	    Bout.write(Message);
	    Bout.close();
	    Fout.close();
	}
	public void View () throws IOException
	{
		FileReader Fout;
		BufferedReader Bout = null;
		Fout=new FileReader("NoticeBoard.txt");
	    Bout=new BufferedReader(Fout);
		Scanner Obj=new Scanner(Bout);
	    int ch;
		while((ch=Bout.read())!=-1)
	    {
	    	System.out.print((char)ch);
	    }
		Bout.close();
	    Fout.close();
	    Obj.close();
	}

}
