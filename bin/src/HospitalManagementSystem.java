import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class HospitalManagementSystem 
{
	private String HospitalName;
	private String Location;
	private String HospitalNumber;
	private int Forget;
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public void setHospitalNumber(String hospitalNumber) {
		HospitalNumber = hospitalNumber;
	}
	public void Login(int Password) throws InterruptedException
	{
		boolean f=false;
		int Recovery=0;
		int Question=0;
		Scanner input=new Scanner(System.in); 
		while(f==false)
		{
			if(Password==1234 || Password==Forget)
			{
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
	public void insert() throws IOException
	{
	FileWriter Fout;
	BufferedWriter Bout = null;
    Fout=new FileWriter("Hospital.txt" ,false);
    Bout=new BufferedWriter(Fout);
    
    long number=Long.parseLong(HospitalNumber);
    Fout.write("\n"+number+"\t"+ HospitalName + "\t" + Location);
    Bout.close();
	}
	void View()throws IOException
	{
		long Number = 0;
		String HName;
		String HLocation;
		FileReader Fout;
		BufferedReader Bout = null;
	    Fout=new FileReader("Hospital.txt");
	    Bout=new BufferedReader(Fout);
		Scanner Obj=new Scanner(Bout);
	    while(Obj.hasNext())
	    {
	    	Number=Obj.nextLong();
	    	HName=Obj.next();
	    	HLocation=Obj.next();
	    	
	    	System.out.println("Hospital Name is = "+HName +"\nHospital Contact Number is = "+Number+"\nHospital Location = "+HLocation);
	    }
	    }
}
