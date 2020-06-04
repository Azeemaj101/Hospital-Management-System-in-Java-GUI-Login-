import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HospitalWorkers 
{
	private String [] Name=new String[1000];
	private String [] IDNumber=new String[1000];
	private String [] PAY=new String[1000];
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
				System.out.println("Welcome Back Admin ");
				System.out.println("Total Hospital Workers = " + List.HospitalWorkers);
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
		public void ADWorkers()
		{
			for(int i=0 ; i<=List.HospitalWorkers ; i++)
			{
			System.out.println(i+1+". Workers ID Number");
			IDNumber[i]=input.next();
			System.out.println(i+1+". Workers Name");
			Name[i]=input.next();
			System.out.println(i+1+". Doctor PAY");
			PAY[i]=input.next();
			}
	    }
		public void WinsertNew ()throws IOException
		{
			int []WorkersID=new int[1000];
			int []pay=new int[1000];
			FileWriter Fout;
			BufferedWriter Bout = null;
		    Fout=new FileWriter("HospitalWorkers.txt" ,true);
		    Bout=new BufferedWriter(Fout);
		    for(int i=0 ; i<=List.HospitalWorkers ; i++)
			{
		    WorkersID[i]=Integer.parseInt(this.IDNumber[i]);
		    pay[i]=Integer.parseInt(this.PAY[i]);
		    Fout.write("\n"+WorkersID[i]+" "+pay[i]+" "+Name[i]);
			}
		    Bout.close();
		    Fout.close();
		}
		public void Wview () throws IOException
		{
			int [] WorkersID =new int[1000];
			int []pay=new int[1000];
			String [] WorkersName=new String[1000];
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
		    	System.out.println("Workers ID   is = "+WorkersID[i]
		    			     +"\n"+"Workers Name is = "+WorkersName[i]
		    			    	+"\nWorker  PAY  is = "+pay[i] +"\n\n");
		        i++;
		    }
		    Obj.close();
		    Fin.close();
		    Bin.close();
	     }
		void WSearch(int FindID)throws IOException
		{
			int [] WorkersID =new int[1000];
			int []pay=new int[1000];
			String [] WorkersName=new String[1000];
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
		    if(WorkersID[i]==FindID)
		    {
		    	System.out.println("Workers ID   is = "+WorkersID[i]
		    			     +"\n"+"Workers Name is = "+WorkersName[i] 
		    			    	+"\nWorker  PAY  is = "+pay[i]+"\n\n");
		    }
		    }
		    Obj.close();
		    Fin.close();
		    Bin.close();
		}
		void WDelete(int Delete)throws IOException
		{
			int [] WorkersID =new int[1000];
			int []pay=new int[1000];
			String [] WorkersName=new String[1000];
			int i=0;
		    File fileA=new File("HospitalWorkers.txt");
		    FileReader Fin=new FileReader(fileA);
		    BufferedReader Bin=new BufferedReader(Fin);
		    File fileB=new File("AddTz.txt");
		    FileWriter Fout =new FileWriter(fileB); 
		    BufferedWriter Bout=new BufferedWriter(Fout);
		    Scanner Obj=new Scanner(Bin);
		    while(Obj.hasNext())
		    {
		    	WorkersID[i]=Obj.nextInt();
		    	pay[i]=Obj.nextInt();
		    	WorkersName[i]=Obj.nextLine();
		    if(WorkersID[i]!=Delete)
		    {
			Bout.write("\n"+WorkersID[i]+" "+pay[i]+" "+WorkersName[i]);	
		    }
		    i++;
		    }
		    Bin.close();
		    Bout.close();
		    fileA.delete();
		    Obj.close();
		    fileB.renameTo(fileA);
		      
		}
		void WUpdate(int Find)throws IOException
		{
			int [] WorkersID =new int[1000];
			int []pay=new int[1000];
			String [] WorkersName=new String[1000];
			int i=0;
		    File file=new File("HospitalWorkers.txt");
		    FileReader Fin=new FileReader(file);
		    BufferedReader Bin=new BufferedReader(Fin);
		    File file1=new File("AddTo.txt");
		    FileWriter Fout =new FileWriter(file1); 
		    BufferedWriter Bout=new BufferedWriter(Fout);
		    Scanner Obj=new Scanner(Bin);
		    while(Obj.hasNext())
		    {
		    	WorkersID[i]=Obj.nextInt();
		    	pay[i]=Obj.nextInt();
		    	WorkersName[i]=Obj.nextLine();
		    if(WorkersID[i]==Find)
		    {
		    	System.out.println(i+1+". Workers ID Number");
				WorkersID[i]=input.nextInt();
		    	System.out.println(i+1+". Workers Name");
		    	WorkersName[i]=input.next();
				System.out.println(i+1+". Doctor PAY");
				PAY[i]=input.next();
		    	Bout.write("\n"+WorkersID[i]+" "+pay[i]+" "+ WorkersName[i]); 
		    }
		    else
		    {
		    	Bout.write("\n"+WorkersID[i]+" "+pay[i]+" "+ WorkersName[i]);
		    }
		    i++;
		    }
		    Bout.close();
		    Bin.close();
		    file.delete();
		    file1.renameTo(file);
		    Obj.close();
		}
}
