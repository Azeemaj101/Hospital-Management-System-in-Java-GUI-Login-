import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class LAB extends HospitalManagementSystem
{
	private final static String Accountant="Muhammad Azeem";
	private final static String ContactNo="03244064060";
	protected String TestName;
	protected String PatientName;
	public abstract void setTestName(String testName);
	public abstract void setPatientName(String patientName);
	public void DisplayManager()
	{
		System.out.println("Manager Name           (LAB Manager) = "+Accountant);
		System.out.println("Manager Contant Number (LAB Manager) = "+ContactNo);
	}
}
class PathologyLab extends LAB
{
	private String TokenID;
	Scanner input=new Scanner(System.in);
   
	public void setTestName(String testName)
   {
	super.TestName = testName;
    }
   public void setPatientName(String patientName) 
   {
	super.PatientName = patientName;
   }
   public void setTokenID(String tokenID) 
   {
		TokenID = tokenID;
   }

   public void Uinsert() throws IOException
   {
FileWriter Fout;
BufferedWriter Bout = null;
Fout=new FileWriter("PathologyLAB.txt" ,true);
Bout=new BufferedWriter(Fout);

int tokenID=Integer.parseInt(TokenID);
Fout.write("\n"+tokenID+" "+ TestName + " " + PatientName);
Bout.close();
Fout.close();
}
    void UView()throws IOException
    {
	int tokenID=0;
	String patientName;
	String testName;
	FileReader Fin;
	BufferedReader Bin = null;
	Fin=new FileReader("PathologyLAB.txt");
    Bin=new BufferedReader(Fin);
	Scanner Obj=new Scanner(Bin);
    while(Obj.hasNext())
    {
    	tokenID=Obj.nextInt();
    	testName=Obj.next();
    	patientName=Obj.next();
    	System.out.println("Token   Number is = "+tokenID
    			        +"\nPatient Name   is = "+patientName
    			        +"\nTest    Name   is = "+testName+"\n\n");
    }
    Fin.close();
    Bin.close();
    Obj.close();
    }
  void USearch(int FindToken)throws IOException
  {
	int tokenID=0;
	String patientName;
	String testName;
	FileReader Fin;
	BufferedReader Bin = null;
	Fin=new FileReader("PathologyLAB.txt");
    Bin=new BufferedReader(Fin);
	Scanner Obj=new Scanner(Bin);
    while(Obj.hasNext())
    {
    	tokenID=Obj.nextInt();
    	testName=Obj.next();
    	patientName=Obj.next();
    if(tokenID==FindToken)
    {
    	System.out.println("Token   Number is = "+tokenID 
    			        +"\nPatient Name   is = "+patientName
    			        +"\nTest    Name   is = "+testName+"\n\n");
    }
    }
    Obj.close();
    Fin.close();
    Bin.close();
}
void UDelete(int Find)throws IOException
{
	int tokenID=0;
	String patientName;
	String testName;
    File fileA=new File("PathologyLAB.txt");
    FileReader Fin=new FileReader(fileA);
    BufferedReader Bin=new BufferedReader(Fin);
    File fileB=new File("AddT.txt");
    FileWriter Fout =new FileWriter(fileB); 
    BufferedWriter Bout=new BufferedWriter(Fout);
    Scanner Obj=new Scanner(Bin);
    while(Obj.hasNext())
    {
    	tokenID=Obj.nextInt();
    	testName=Obj.next();
    	patientName=Obj.next();
    if(tokenID!=Find)
    {
	Bout.write("\n"+tokenID+" "+ testName + " " + patientName);
    }
    }
    Bin.close();
    Bout.close();
    
    fileA.delete();
    Obj.close();
    fileB.renameTo(fileA);
}
void Uupdate(int Find)throws IOException
{
	int tokenID=0;
	String patientName;
	String testName;
    File file=new File("PathologyLAB.txt");
    FileReader Fin=new FileReader(file);
    BufferedReader Bin=new BufferedReader(Fin);
    File file1=new File("AddTo.txt");
    FileWriter Fout =new FileWriter(file1); 
    BufferedWriter Bout=new BufferedWriter(Fout);
    Scanner Obj=new Scanner(Bin);
    while(Obj.hasNext())
    {
    	tokenID=Obj.nextInt();
    	testName=Obj.next();
    	patientName=Obj.next();
    if(tokenID==Find)
    {
    	System.out.println("Enter Token Number");
    	tokenID=input.nextInt();
    	System.out.println("Enter Patient Name");
    	patientName=input.next();
    	System.out.println("Enter Test Name");
    	testName=input.next();
    	Bout.write("\n"+tokenID+" "+ testName + " " + patientName); 
    }
    else
    {
    	Bout.write("\n"+tokenID+" "+ testName + " " + patientName);
    }
    }
    Bout.close();
    Bin.close();
    file.delete();
    file1.renameTo(file);
    Obj.close();
}
public void LabPament() throws IOException, InterruptedException
{
	int LBill=1000;
    	long Money=0;
 	    FileReader MFin;
 		BufferedReader MBin = null;
 		MFin=new FileReader("HospitalBANK.txt");
 	    MBin=new BufferedReader(MFin);
 	    Scanner MObj=new Scanner(MBin);
 	    System.out.println("Each Test Payment = 1000");
 	    while(MObj.hasNext())
 	    {
 	    	Money=MObj.nextLong();
 	    }
    	if(LBill>0)
    	{
    	long Renew=Money+LBill;
    	FileWriter Fout;
		BufferedWriter Bout = null;
	    Fout=new FileWriter("HospitalBANK.txt" ,false);
	    Bout=new BufferedWriter(Fout);
	    Bout.write("\n"+Renew);
 	    Bout.close();
 	    MObj.close();
 	    System.out.println("Payment Done");
    	}
    	else 
    	{
    	System.out.println("Payment Done");	
    	}
 	 }
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
			System.out.println("Welcome Back Muhammad Azeem (Accountent)");
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
}
