import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rooms 
{
	private static String TotalLocalRooms;
	private static String TotalVIPRooms;
	private static String TotalICU;
	public static void setTotalLocalRooms(String totalLocalRooms) {
		TotalLocalRooms = totalLocalRooms;
	}
	public static void setTotalVIPRooms(String totalVIPRooms) {
		TotalVIPRooms = totalVIPRooms;
	}
	public static void setTotalICU(String totalICU) {
		TotalICU = totalICU;
	}
	public void LoginReceptionists(int Password) throws InterruptedException
	{
		boolean f=false;
		int Recovery=0;
		int Question=0;
		int Forget=0;
		Scanner input=new Scanner(System.in); 
		while(f==false)
		{
			if(Password==1234 || Password==Forget)
			{
				System.out.println("Welcome Back Admin ");
				System.out.print("Loading < ");
				for(int i=0 ; i<=30 ; i++)
				{
					System.out.print("|");
					Thread.sleep(125);
				}
				System.out.print(" >100%");
				f=true;
			}
			else if(Recovery==1)
			{
				System.out.print("Enter Your Default Password Given By Admin\n");
				Question=input.nextInt();
				if(Question==27659199)
				{
				System.out.print("Loading < ");
				for(int i=0 ; i<=30 ; i++)
				{
					System.out.print("|");
					Thread.sleep(125);
				}
				System.out.print(" >100%");
				System.out.println("\nEnter Your New Password\n");
				Password=input.nextInt();
				Password=Forget;
				}
			}
			else
			{
				System.out.println("Wrong Password \nPress 1 For Recover your password");
				Recovery=input.nextInt();
			}
		}
	}
	public void insertNew() throws IOException 
	{
		FileWriter Fout;
		BufferedWriter Bout = null;
	    Fout=new FileWriter("Rooms.txt" ,false);
	    Bout=new BufferedWriter(Fout);
	    
	    int totalLocalRooms=Integer.parseInt(TotalLocalRooms);
	    int totalVIPRooms=Integer.parseInt(TotalVIPRooms);
	    int totalICU=Integer.parseInt(TotalICU);
	    Fout.write("\n"+totalLocalRooms+" "+totalVIPRooms+" "+totalICU);
	    Bout.close();
	    Fout.close();
	}
	public void view() throws IOException 
	{
		int totalLocalRooms;
		int totalVIPRooms;
		int totalICU;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("Rooms.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	totalLocalRooms=Obj.nextInt();
	    	totalVIPRooms=Obj.nextInt();
	    	totalICU=Obj.nextInt();
	    	System.out.println("Total Local Rooms in Hospital = "+totalLocalRooms 
	    			        +"\nTotal VIP   Rooms in Hospital = "+totalVIPRooms
	    			        +"\nTotal ICU   Rooms in Hospital = "+totalICU);
	    }
	    Fin.close();
	    Bin.close();
	    Obj.close();
   }
}
