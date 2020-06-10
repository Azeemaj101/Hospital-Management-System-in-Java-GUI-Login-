import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class TotalPay extends HospitalManagementSystem
{
	private final static String Accountant="Moazam";
	private final static String ContactNo="03244064060";
	
	public void DisplayManager()
	{
		System.out.println("Manager Name           (Accountant) = "+Accountant);
		System.out.println("Manager Contact Number (Accountant) = "+ContactNo);
	}
	public abstract void DoctorPay  ()  throws IOException;
	public abstract void NursePay   ()  throws IOException;
	public abstract void WorkerPay  ()  throws IOException;
	public abstract void GrandTotal ()  throws IOException;
}
class DNWPay extends TotalPay
{
	private long GrandTotal=0;
	private long DTotal = 0;
	private long NTotal = 0;
	private long WTotal = 0;
	Scanner input=new Scanner(System.in);
	public void LoginReceptionists(int Password) throws InterruptedException
	{
		boolean f=false;
		int Recovery=0;
		int Question=0;
		int Forget=0;
		while(f==false)
		{
			if(Password==1234 || Password==Forget)
			{
				System.out.println("Welcome Back Moazam (Accountent)");
				System.out.print("Loading < ");
				for(int i=0 ; i<=30 ; i++)
				{
					System.out.print("|");
					Thread.sleep(125);
				}
				System.out.print(" >100%\n");
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
	public void DoctorPay() throws IOException
	{
		int [] DoctorID =new int[1000];
		int []pay=new int[1000];
		String [] DoctorName=new String[1000];
		long Total = 0;
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("HospitalDoctors.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	DoctorID[i]=Obj.nextInt();
	    	pay[i]=Obj.nextInt();
	    	DoctorName[i]=Obj.nextLine();
	        Total+=pay[i];
	    	i++;
	    }
	    System.out.println("Total Doctors PAY = "+Total);
	    Obj.close();
	    Fin.close();
	    Bin.close();
		
	}
	public void NursePay () throws IOException
	{
		int [] NursesID =new int[1000];
		int []pay=new int[1000];
		String [] NursesName=new String[1000];
		long Total = 0;
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("HospitalNurses.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	NursesID[i]=Obj.nextInt();
	    	pay[i]=Obj.nextInt();
	    	NursesName[i]=Obj.nextLine();
	        Total+=pay[i];
	    	i++;
	    }
	    System.out.println("Total Nurses PAY = "+Total);
	    Obj.close();
	    Fin.close();
	    Bin.close();
	}
	public void WorkerPay () throws IOException
	{
		int [] WorkersID =new int[1000];
		int []pay=new int[1000];
		String [] WorkersName=new String[1000];
		long Total = 0;
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("HospitalWorkers.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	WorkersID[i]=Obj.nextInt();
	    	pay[i]=Obj.nextInt();
	    	WorkersName[i]=Obj.nextLine();
	        Total=+pay[i];
	    	i++;
	    }
	    System.out.println("Total Workers PAY = "+Total);
	    Obj.close();
	    Fin.close();
	    Bin.close();
	}
	public void GrandTotal ()   throws IOException
	{
		int [] DoctorID =new int[1000];
		int []Dpay=new int[1000];
		String [] DoctorName=new String[1000];
		int [] WorkersID =new int[1000];
		int []Wpay=new int[1000];
		String [] WorkersName=new String[1000];
		int [] NursesID =new int[1000];
		int []Npay=new int[1000];
		String [] NursesName=new String[1000];
		
		int i=0;
		int di=0;
		int wi=0;
		FileReader DFin;
		BufferedReader DBin = null;
		DFin=new FileReader("HospitalDoctors.txt");
	    DBin=new BufferedReader(DFin);
		Scanner DObj=new Scanner(DBin);
	    while(DObj.hasNext())
	    {
	    	DoctorID[i]=DObj.nextInt();
	    	Dpay[i]=DObj.nextInt();
	    	DoctorName[i]=DObj.nextLine();
	        DTotal+=Dpay[i];
	    	i++;
	    }
		FileReader NFin;
		BufferedReader NBin = null;
		NFin=new FileReader("HospitalNurses.txt");
	    NBin=new BufferedReader(NFin);
	    Scanner NObj=new Scanner(NBin);
	    while(NObj.hasNext())
	    {
	    	NursesID[di]=NObj.nextInt();
	    	Npay[di]=NObj.nextInt();
	    	NursesName[di]=NObj.nextLine();
	        NTotal+=Npay[di];
	    	i++;
	    }
		FileReader WFin;
		BufferedReader WBin = null;
		WFin=new FileReader("HospitalWorkers.txt");
	    WBin=new BufferedReader(WFin);
	    Scanner WObj=new Scanner(WBin);
	    while(WObj.hasNext())
	    {
	    	WorkersID[wi]=WObj.nextInt();
	    	Wpay[wi]=WObj.nextInt();
	    	WorkersName[wi]=WObj.nextLine();
	        WTotal+=Wpay[wi];
	    	i++;
	    }
	    GrandTotal=WTotal+NTotal+DTotal;
	    System.out.println("Grand Total ="+GrandTotal);
	    System.out.println("Worker Pay = "+WTotal +" Nurses Pay= "+NTotal+" Doctor Pay = "+DTotal);
	    DObj.close();
	    NObj.close();
	    WObj.close();
	    DFin.close();
	    DBin.close();
	    WFin.close();
	    WBin.close();
	    NFin.close();
	    NBin.close();
	}
	public void Bank() throws IOException, InterruptedException
	{
		GrandTotal=0;
	 	DTotal = 0;
	 	NTotal = 0;
	 	WTotal = 0;
		int [] DoctorID =new int[1000];
		int []Dpay=new int[1000];
		String [] DoctorName=new String[1000];
		int [] WorkersID =new int[1000];
		int []Wpay=new int[1000];
		String [] WorkersName=new String[1000];
		int [] NursesID =new int[1000];
		int []Npay=new int[1000];
		String [] NursesName=new String[1000];
		
		int i=0;
		int di=0;
		int wi=0;
		FileReader DFin;
		BufferedReader DBin = null;
		DFin=new FileReader("HospitalDoctors.txt");
	    DBin=new BufferedReader(DFin);
		Scanner DObj=new Scanner(DBin);
	    while(DObj.hasNext())
	    {
	    	DoctorID[i]=DObj.nextInt();
	    	Dpay[i]=DObj.nextInt();
	    	DoctorName[i]=DObj.nextLine();
	        DTotal+=Dpay[i];
	    	i++;
	    }
		FileReader NFin;
		BufferedReader NBin = null;
		NFin=new FileReader("HospitalNurses.txt");
	    NBin=new BufferedReader(NFin);
	    Scanner NObj=new Scanner(NBin);
	    while(NObj.hasNext())
	    {
	    	NursesID[di]=NObj.nextInt();
	    	Npay[di]=NObj.nextInt();
	    	NursesName[di]=NObj.nextLine();
	        NTotal+=Npay[di];
	    	i++;
	    }
		FileReader WFin;
		BufferedReader WBin = null;
		WFin=new FileReader("HospitalWorkers.txt");
	    WBin=new BufferedReader(WFin);
	    Scanner WObj=new Scanner(WBin);
	    while(WObj.hasNext())
	    {
	    	WorkersID[wi]=WObj.nextInt();
	    	Wpay[wi]=WObj.nextInt();
	    	WorkersName[wi]=WObj.nextLine();
	        WTotal+=Wpay[wi];
	    	i++;
	    }
	    GrandTotal=WTotal+NTotal+DTotal;
	    DObj.close();
	    NObj.close();
	    WObj.close();
	    DFin.close();
	    DBin.close();
	    WFin.close();
	    WBin.close();
	    NFin.close();
	    NBin.close();
	    boolean Bak=false;
	    while(Bak==false)
	    {
	    System.out.println("Welcome HBL Bank Account           ");
		System.out.println("Press 1 For Send Salary  To All    ");
		System.out.println("Press 2 For Send Salary  To Doctors");
		System.out.println("Press 3 For Send Salary  To Workers");
		System.out.println("Press 4 For Send Salary  To Nurses ");
		System.out.println("Press 5 For ADD  Money   in Bank   ");
		System.out.println("Press 6 For Bank Menu              ");
	    int bak=input.nextInt(); 
	    if(bak==1)
	    {
	    	long Money=0;
	 	    FileReader MFin;
	 		BufferedReader MBin = null;
	 		MFin=new FileReader("HospitalBANK.txt");
	 	    MBin=new BufferedReader(MFin);
	 	    Scanner MObj=new Scanner(MBin);
	 	    while(MObj.hasNext())
	 	    {
	 	    	Money=MObj.nextLong();
	 	    	i++;
	 	    }
	    	System.out.println("Your Current Amount is = "+Money);
	    	System.out.println("Your All Salaries Amount is = "+GrandTotal);
	    	System.out.println("Confirm Password");
	    	int Password=input.nextInt();
	    	LoginReceptionists(Password);
	    	if(Money>GrandTotal && GrandTotal>0)
	    	{
	    	System.out.println("Billing Done For All Hospital");
	    	long Rem=Money-GrandTotal;
	    	System.out.println("Remaining Amount = " + Rem);
	    	FileWriter Fout;
			BufferedWriter Bout = null;
		    Fout=new FileWriter("HospitalBANK.txt" ,false);
		    Bout=new BufferedWriter(Fout);
		    Bout.write("\n"+Rem);
	 	    Bout.close();
	 	   GrandTotal=0;
	 	   DTotal = 0;
	 	   NTotal = 0;
	 	   WTotal = 0;
	 	    Bak=true;
	 	   MObj.close();
	    	}
	    	else 
	    	{
	    	System.out.println("Low Amount & Please Try Again");	
	    	}
	 	 }
	    else if(bak==2)
	    {
	    	long Money=0;
		    FileReader MFin;
			BufferedReader MBin = null;
			MFin=new FileReader("HospitalBANK.txt");
		    MBin=new BufferedReader(MFin);
		    Scanner MObj=new Scanner(MBin);
		    while(MObj.hasNext())
		    {
		    	Money=MObj.nextLong();
		    	i++;
		    }
		    if(Money>GrandTotal && GrandTotal>0)
	    	{
	    	System.out.println("Your Current Amount is = "+Money);
	    	System.out.println("Your Doctors Salaries Amount is = "+DTotal);
	    	System.out.println("Confirm Password");
	    	int Password=input.nextInt();
	    	LoginReceptionists(Password);
	    	System.out.println("Billing Done For Hospital Doctors");
	    	long Rem=Money-DTotal;
	    	System.out.println("Remaining Amount = " + Rem);
	    	FileWriter Fout;
			BufferedWriter Bout = null;
		    Fout=new FileWriter("HospitalBANK.txt" ,false);
		    Bout=new BufferedWriter(Fout);
		    Bout.write("\n"+Rem);
	 	    Bout.close();
	 	   GrandTotal=0;
	 	   DTotal = 0;
	 	   NTotal = 0;
	 	   WTotal = 0;
	 	    Bak=true;
	    	}
		    else 
	    	{
	    	System.out.println("Low Amount & Please Try Again");	
	    	}
		    MObj.close();
	    }
	    else if(bak==3)
	    {
	    	long Money=0;
		    FileReader MFin;
			BufferedReader MBin = null;
			MFin=new FileReader("HospitalBANK.txt");
		    MBin=new BufferedReader(MFin);
		    Scanner MObj=new Scanner(MBin);
		    while(MObj.hasNext())
		    {
		    	Money=MObj.nextLong();
		    	i++;
		    }
		    if(Money>GrandTotal && GrandTotal>0)
	    	{
	    	System.out.println("Your Current Amount is = "+Money);
	    	System.out.println("Your Workers Salaries Amount is = "+WTotal);
	    	System.out.println("Confirm Password");
	    	int Password=input.nextInt();
	    	LoginReceptionists(Password);
	    	System.out.println("Billing Done For Hospital Workers");
	    	long Rem=Money-WTotal;
	    	System.out.println("Remaining Amount = " + Rem);
	    	FileWriter Fout;
			BufferedWriter Bout = null;
		    Fout=new FileWriter("HospitalBANK.txt" ,false);
		    Bout=new BufferedWriter(Fout);
		    Bout.write("\n"+Rem);
	 	    Bout.close();
	 	   GrandTotal=0;
	 	   DTotal = 0;
	 	   NTotal = 0;
	 	   WTotal = 0;
	 	    Bak=true;
	 	   MObj.close();
	    	}
		    else 
	    	{
	    	System.out.println("Low Amount & Please Try Again");	
	    	}
	    }
	    else if(bak==4)
	    {
	    	long Money=0;
		    FileReader MFin;
			BufferedReader MBin = null;
			MFin=new FileReader("HospitalBANK.txt");
		    MBin=new BufferedReader(MFin);
		    Scanner MObj=new Scanner(MBin);
		    while(MObj.hasNext())
		    {
		    	Money=MObj.nextLong();
		    	i++;
		    }
		    if(Money>GrandTotal && GrandTotal>0)
	    	{
	    	System.out.println("Your Current Amount is = "+Money);
	    	System.out.println("Your Nurses Salaries Amount is = "+NTotal);
	    	System.out.println("Confirm Password");
	    	int Password=input.nextInt();
	    	LoginReceptionists(Password);
	    	System.out.println("Billing Done For Hospital Nurses");
	    	long Rem=Money-NTotal;
	    	System.out.println("Remaining Amount = " + Rem);
	    	FileWriter Fout;
			BufferedWriter Bout = null;
		    Fout=new FileWriter("HospitalBANK.txt" ,false);
		    Bout=new BufferedWriter(Fout);
		    Bout.write("\n"+Rem);
	 	    Bout.close();
	 	   GrandTotal=0;
	 	   DTotal = 0;
	 	   NTotal = 0;
	 	   WTotal = 0;
	 	    Bak=true;
	 	    MObj.close();
	    	}
		    else 
	    	{
	    	System.out.println("Low Amount & Please Try Again");	
	    	}
	    }
	    else if(bak==5)
	    {
	    	System.out.println("Confirm Password");
	    	int Password=input.nextInt();
	    	LoginReceptionists(Password);
	    	System.out.println("Enter Your New Amount");
	    	long NewAmount=input.nextLong();
	    	FileWriter Fout;
			BufferedWriter Bout = null;
		    Fout=new FileWriter("HospitalBANK.txt" ,false);
		    Bout=new BufferedWriter(Fout);
		    Bout.write("\n"+NewAmount);
	 	    Bout.close();
	 	   GrandTotal=0;
	 	   DTotal = 0;
	 	   NTotal = 0;
	 	   WTotal = 0;
	 	    Bak=true;
	    }
	    else if(bak==6)
	    {
	    	Bak=true;
	    	for(int a=0 ; a<=40 ; a++)
	    	{
	    		System.out.println();	
	    	}
	    	
	    }
	    else
	    {
	    	System.out.println("Wrong Key");
	    	Bak=false;
	    }
	    }
	}
}