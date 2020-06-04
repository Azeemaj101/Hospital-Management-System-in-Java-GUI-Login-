import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class EyeDepartment implements ReceptionistR ,PatientPayment
{
	private String DeptBlockNumber;
	private String HeadName;
	
	public void setHeadName(String headName) 
	{
		HeadName = headName;
	}
	public void setDeptBlockNumber(String deptBlockNumber) 
	{
		DeptBlockNumber = deptBlockNumber;
	}
	public void Login(int Password) throws InterruptedException
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
				System.out.println("Welcome Back Head");
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
	public abstract void DoctorTimeTable();
	public void insertNew ()throws IOException
	{
		FileWriter Fout;
		BufferedWriter Bout = null;
	    Fout=new FileWriter("EyeDepartment.txt" ,false);
	    Bout=new BufferedWriter(Fout);
	    
	    int blocknumber=Integer.parseInt(DeptBlockNumber);
	    Fout.write("\n"+blocknumber+" "+HeadName);
	    Bout.close();
	    Fout.close();
	}
	public void Hview () throws IOException
	{
		int BlockNumber =0;
		String HeadName;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("EyeDepartment.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	BlockNumber=Obj.nextInt();
	    	HeadName=Obj.nextLine();
	    	System.out.println("Head    Of      Eye Department is = "+HeadName 
	    			        +"\nBlock Number Of Eye Department is = "+BlockNumber+"\n\n");
	    }
	    Fin.close();
	    Bin.close();
	    Obj.close();
	    
}
}
class Eyereceptionist extends EyeDepartment
{
	private String [] Name=new String[13];
	private String [] IDNumber=new String[13];
	String [] DoctorTime=new String[13];
	Scanner input=new Scanner(System.in);
	public void DoctorTimeTable()
	{
		for(int i=0 ; i<=ReceptionistR.TotalDoctors ; i++)
		{
		System.out.println(i+1+". Doctor Name");
		Name[i]=input.next();
		System.out.println(i+1+". Doctor ID Number");
		IDNumber[i]=input.next();
		System.out.println(i+1+". Doctor Time");
		DoctorTime[i]=input.next();
		}
    }
	public void RinsertNew ()throws IOException
	{
		int []doctorID=new int[13];
		int []doctorTime=new int[13];
		FileWriter Fout;
		BufferedWriter Bout = null;
	    Fout=new FileWriter("EyeReceptionist.txt" ,true);
	    Bout=new BufferedWriter(Fout);
	    for(int i=0 ; i<=ReceptionistR.TotalDoctors ; i++)
		{
	    doctorID[i]=Integer.parseInt(this.IDNumber[i]);
	    doctorTime[i]=Integer.parseInt(this.DoctorTime[i]);
	    Fout.write("\n"+doctorID[i]+" "+doctorTime[i] +" "+Name[i]);
		}
	    Bout.close();
	    Fout.close();
	}
	public void view () throws IOException
	{
		int [] DoctorID =new int[13];
		int [] DoctorTime=new int[13];
		String [] DoctorName=new String[13];
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("EyeReceptionist.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	DoctorID[i]=Obj.nextInt();
	    	DoctorTime[i]=Obj.nextInt();
	    	DoctorName[i]=Obj.nextLine();
	    	System.out.println("Doctor ID   is = "+DoctorID[i]
	    			     +"\n"+"Doctor Name is = "+ DoctorName[i]
	    			        +"\nDoctor Time is = "+DoctorTime[i]+":00 PM"+"\n\n");
	        i++;
	    }
	    Fin.close();
	    Bin.close();
	    Obj.close();	    
     }
	void Search(int FindID)throws IOException
	{
		int [] DoctorID =new int[13];
		int [] DoctorTime=new int[13];
		String [] DoctorName=new String[13];
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("EyeReceptionist.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	DoctorID[i]=Obj.nextInt();
	    	DoctorTime[i]=Obj.nextInt();
	    	DoctorName[i]=Obj.nextLine();
	    if(DoctorID[i]==FindID)
	    {
	    	System.out.println("Doctor ID   is = "+DoctorID[i]
	    			     +"\n"+"Doctor Name is = "+DoctorName[i] 
	    			     +"\n"+"Doctor Time is = "+DoctorTime[i]+":00 PM"+"\n\n");
	    }
	    }
	    Fin.close();
	    Bin.close();
	    Obj.close();
	}
	void Delete(int Delete)throws IOException
	{
		int [] DoctorID =new int[13];
		int [] DoctorTime=new int[13];
		String [] DoctorName=new String[13];
		int i=0;
	    File fileA=new File("EyeReceptionist.txt");
	    FileReader Fin=new FileReader(fileA);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File fileB=new File("AddTz.txt");
	    FileWriter Fout =new FileWriter(fileB); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	DoctorID[i]=Obj.nextInt();
	    	DoctorTime[i]=Obj.nextInt();
	    	DoctorName[i]=Obj.nextLine();
	    if(DoctorID[i]!=Delete)
	    {
		Bout.write("\n"+DoctorID[i]+" "+DoctorTime[i] +" "+DoctorName[i]);
	    System.out.println("DONE");	
	    }
	    i++;
	    }
	    Bin.close();
	    Bout.close();
	    fileA.delete();
	    Obj.close();
	    fileB.renameTo(fileA);
	      
	}
	void update(int Find)throws IOException
	{
		int [] DoctorID =new int[13];
		int [] DoctorTime=new int[13];
		String [] DoctorName=new String[13];
		int i=0;
	    File file=new File("EyeReceptionist.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File file1=new File("AddTo.txt");
	    FileWriter Fout =new FileWriter(file1); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    Scanner INPUT=new Scanner(System.in);
	    while(Obj.hasNext())
	    {
	    	DoctorID[i]=Obj.nextInt();
	    	DoctorTime[i]=Obj.nextInt();
	    	DoctorName[i]=Obj.nextLine();
	    if(DoctorID[i]==Find)
	    {
	    	System.out.println(i+1+". Doctor Name");
	    	DoctorName[i]=input.next();
			System.out.println(i+1+". Doctor ID Number");
			DoctorID[i]=input.nextInt();
			System.out.println(i+1+". Doctor Time");
			DoctorTime[i]=input.nextInt();
	    	Bout.write("\n"+DoctorID[i]+" "+ DoctorTime[i] + " " + DoctorName[i]); 
	    }
	    else
	    {
	    	Bout.write("\n"+DoctorID[i]+" "+ DoctorTime[i] + " " + DoctorName[i]);
	    }
	    i++;
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
	public void EDFindDoctor() throws IOException, InterruptedException
	{
		Patients Payment=new Patients();
		LocalDateTime RuffTime=LocalDateTime.now();
		DateTimeFormatter NowTime=DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter DisplayTime=DateTimeFormatter.ofPattern("hh:mm");
		String displayTime=RuffTime.format(DisplayTime);
		String TrueTime=RuffTime.format(NowTime);
		System.out.println("\t\tTime:"+displayTime);
		int [] DoctorID =new int[13];
		int [] DoctorTime=new int[13];
		String [] DoctorName=new String[13];
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("EyeReceptionist.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	DoctorID[i]=Obj.nextInt();
	    	DoctorTime[i]=Obj.nextInt();
	    	DoctorName[i]=Obj.nextLine();
	    	int Time=Integer.parseInt(TrueTime);
	    if(DoctorTime[i]==Time)
	    {
	    	System.out.println("Doctor ID   is = "+DoctorID[i]
	    			        +"\nDoctor Name is = "+DoctorName[i] 
	    			        +"\nTime        is = "+displayTime+" (PM) Available"+"\n\n");
	    	System.out.println("Doctor     Fee = 1000");
			Payment.PatientPament(PatientPayment.EyeDoctorPayment);
	    }
	    }
	    
	    Fin.close();
	    Bin.close();
	    Obj.close();	
	}
}