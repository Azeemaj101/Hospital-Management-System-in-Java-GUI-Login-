import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Patients extends HospitalManagementSystem implements PatientPayment
{
	private String PatientID;
	private String PatientName;
	private String PatientCNIC;
	Scanner input=new Scanner(System.in);
	
	public void PatientADD() throws IOException, InterruptedException
	{
		Coronareceptionist    One  =new Coronareceptionist   ();
		Cardiacreceptionist   Two  =new Cardiacreceptionist  ();
		Eyereceptionist       Three=new Eyereceptionist      ();
		Gernalreceptionist    Four =new Gernalreceptionist   ();
		Cancerreceptionist    Five =new Cancerreceptionist   ();
		Operationreceptionist Six  =new Operationreceptionist();
		FileWriter            Fout=new FileWriter("Patients.txt" ,true);
		BufferedWriter        Bout=new BufferedWriter(Fout);
		System.out.println("Please Enter PatientID Number");
		PatientID=input.next();
		System.out.println("Please Enter Patient   Name");
		PatientName=input.next();
		System.out.println("Please Enter Patient   CNIC");
		PatientCNIC=input.next();
		System.out.println("\n          AsslamAlikum           \n");
		System.out.println("Press 1 For Corona     Department");
		System.out.println("Press 2 For Cardiac     Department");
		System.out.println("Press 3 For Eye        Department");
		System.out.println("Press 4 For General    Department");
		System.out.println("Press 5 For Cancer     Department");
		System.out.println("Press 6 For Operation  Department");
		int patientID=Integer.parseInt(PatientID);
	    long patientCNIC=Long.parseLong(PatientCNIC);
		boolean Buy=false;
	    while(Buy==false)
		{
	    int DF=input.nextInt();
	    int a=0;
	    switch(DF)
		{
		case 1:
		{
			One.COFindDoctor();
			Fout.write("\n"+patientID+" "+ patientCNIC + " " +DF+ " " + PatientName);
			Bout.close();
		    Fout.close();
			Buy=true;
		    break;
		}
		case 2:
		{
			Two.RCNFindDoctor();
			a++;
			Buy=true;
			break;
		}
		case 3:
		{
			Three.EDFindDoctor();
			a++;
			Buy=true;
			break;
		}
		case 4:
		{
			Four.GDFindDoctor();
			a++;
			Buy=true;
			break;
		}
		case 5:
		{
			Five.CDFindDoctor();
			a++;
			Buy=true;
			break;
		}
		case 6:
		{
			Six.ODFindDoctor();
			a++;
			Buy=true;
			break;
		}
		case 7:
		{
			System.out.println("Dr.Azeem    in ICU Doctor ID 79");
			System.out.println("Dr.Izzab    in ICU Doctor ID 80");
			System.out.println("Dr.Moazam   in ICU Doctor ID 81");
		    a++;
		    Buy=true;
		    break;
		}
		default:
		{
			System.out.println("Wrong Key");
		}
		if(a!=0)
		{
		Fout.write("\n"+patientID+" "+ patientCNIC + " " +DF+ " " + PatientName);
		Bout.close();
	    Fout.close();
		}
		}
	}
	}
	public void PatientPament(int TBill) throws IOException, InterruptedException
	{
		    int i=0;
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
	    	if(TBill>0)
	    	{
	    	long Renew=Money+TBill;
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
	public void Discharge() throws IOException
	{
		boolean Dischargewhile=false;
		while(Dischargewhile==false)
		{
		System.out.println("Press 1 For DisCharge Patient \nPress 2 For Patient Death");
		int DC=input.nextInt();
		switch(DC)
		{
		case 1:
		{
			System.out.println("Please Enter Patient Token ID");
			int FID=input.nextInt();
			Search(FID);
			Delete(FID);
			Dischargewhile=true;
			break;
		}
		case 2:
		{
			System.out.println("This is Really SaD News"); 
			System.out.println("Please Enter Patient Token ID");
			int DID=input.nextInt();
			Search(DID);
			Delete(DID);
			Dischargewhile=true;
			break;
		}
		default:
		{
			System.out.println("Wrong Key Try Again");
			Dischargewhile=false;
			break;
		}
		}
		}
	}
	void Search(int FindToken)throws IOException
	{
		int patientID;
		int Dept;
		String patientName;
		long patientCNIC;
		int a=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("Patients.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	patientID=Obj.nextInt();
	    	patientCNIC=Obj.nextLong();
	    	Dept=Obj.nextInt();
	    	patientName=Obj.next();
	    if(patientID==FindToken)
	    {
	    	System.out.println("Patient    Token Number is = "+patientID 
	    			        +"\nPatient    CNIC  Number is = "+patientCNIC
	    			        +"\nDepartment       Number is = "+Dept
	    			        +"\nPAtient          Name   is = "+patientName+"\n\n");
	        a++;
	    }
	    }
	    if(a==0)
	    {
	    	System.out.println("Not Found");
	    }
	    if(a!=0)
	    {
	    	System.out.println("Allah Protects Everyone");
	    }
	    Obj.close();
	    Fin.close();
	    Bin.close();
	}  
	void UView()throws IOException
    {
		int patientID;
		int Dept;
		String patientName;
		long patientCNIC;
	FileReader Fin;
	BufferedReader Bin = null;
	Fin=new FileReader("Patients.txt");
    Bin=new BufferedReader(Fin);
	Scanner Obj=new Scanner(Bin);
    while(Obj.hasNext())
    {
    	patientID=Obj.nextInt();
    	patientCNIC=Obj.nextLong();
    	Dept=Obj.nextInt();
    	patientName=Obj.next();
    	System.out.println("Patient   Token Number is = "+patientID 
    			        +"\nPatient   CNIC  Number is = "+patientCNIC
    			        +"\nDepartment      Number is = "+Dept
    			        +"\nPAtient         Name   is = "+patientName+"\n\n");
    }
    Fin.close();
    Bin.close();
    Obj.close();
    }
	void Delete(int Find)throws IOException
	{
		int patientID;
		int Dept;
		String patientName;
		long patientCNIC;
	    File fileA=new File("Patients.txt");
	    FileReader Fin=new FileReader(fileA);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File fileB=new File("AddT.txt");
	    FileWriter Fout =new FileWriter(fileB); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	patientID=Obj.nextInt();
	    	patientCNIC=Obj.nextLong();
	    	Dept=Obj.nextInt();
	    	patientName=Obj.next();
	    if(patientID!=Find)
	    {
		Bout.write("\n"+patientID+" "+ patientCNIC + " " +Dept+ " " + patientName);
	    }
	    }
	    Bin.close();
	    Bout.close();
	    
	    fileA.delete();
	    Obj.close();
	    fileB.renameTo(fileA);
	}
	void update(int Find)throws IOException
	{
		int patientID;
		int Dept;
		String patientName;
		long patientCNIC;
	    File file=new File("Patients.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File file1=new File("AddTo.txt");
	    FileWriter Fout =new FileWriter(file1); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    Scanner INPUT=new Scanner(System.in);
	    while(Obj.hasNext())
	    {
	    	patientID=Obj.nextInt();
	    	patientCNIC=Obj.nextLong();
	    	Dept=Obj.nextInt();
	    	patientName=Obj.next();
	    if(patientID==Find)
	    {
	    	System.out.println("Please Enter PatientID Number");
			patientID=input.nextInt();
			System.out.println("Please Enter Patient   Name");
			patientName=input.next();
			System.out.println("Please Enter Patient   CNIC");
			patientCNIC=input.nextLong();
			System.out.println("Please Enter Patient   Department");
			Dept=input.nextInt();
	    	Bout.write("\n"+patientID+" "+ patientCNIC + " " +Dept+ " " + patientName); 
	    }
	    else
	    {
	    	Bout.write("\n"+patientID+" "+ patientCNIC + " " +Dept+ " " + patientName);
	    }
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
}
