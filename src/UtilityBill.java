import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UtilityBill 
{
	private String BillName; 
	private String Amount;
	private String Month;
	private String Day;
	private String Year;
	Scanner input=new Scanner(System.in); 	
	public void setAmount(String amount) {
		Amount = amount;
	}
	public void setBillName(String billName) {
		BillName = billName;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public void setDay(String day) {
		Day = day;
	}
	public void setYear(String year) {
		Year = year;
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
				System.out.println("Welcome Back Admin ");
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
	public void Uinsert() throws IOException
	{
	FileWriter Fout;
	BufferedWriter Bout = null;
    Fout=new FileWriter("UtilityBills.txt" ,true);
    Bout=new BufferedWriter(Fout);
    
    int month=Integer.parseInt(Month);
    int day=Integer.parseInt(Day);
    int year=Integer.parseInt(Year);
    int amount=Integer.parseInt(Amount);
    Fout.write("\n"+year+" "+ day + " " + month+ " " + amount + " " + BillName);
    Bout.close();
    Fout.close();
	}
	void UView()throws IOException
	{
		int year = 0;
		int month =0;
		int day=0;
		int amount=0;
		String BillName;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("UtilityBills.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	year=Obj.nextInt();
	    	day=Obj.nextInt();
	    	month=Obj.nextInt();
	    	amount=Obj.nextInt();
	    	BillName=Obj.next();
	    	System.out.println("Bill Name   is = "+BillName 
	    			        +"\nBill Amount is = "+amount
	    			        +"\nDate        is = "+day+"/"+ month +"/"+year+"\n\n");
	    }
	    Fin.close();
	    Bin.close();
	    Obj.close();
	    }
	void USearch(int FindToken)throws IOException
	{
		int year = 0;
		int month =0;
		int day=0;
		int amount=0;
		String BillName;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("UtilityBills.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	year=Obj.nextInt();
	    	day=Obj.nextInt();
	    	month=Obj.nextInt();
	    	amount=Obj.nextInt();
	    	BillName=Obj.next();
	    if(year==FindToken)
	    {
	    	System.out.println("Bill Name   is = "+BillName 
	    			        +"\nBill Amount is = "+amount
	    			        +"\nDate        is = "+day+"/"+ month +"/"+year+"\n\n");
	    }
	    }
	    Obj.close();
	    Fin.close();
	    Bin.close();
	}
	void UDelete(int Find)throws IOException
	{
		int year = 0;
		int month =0;
		int day=0;
		int amount=0;
		String BillName;
	    File fileA=new File("UtilityBills.txt");
	    FileReader Fin=new FileReader(fileA);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File fileB=new File("AddT.txt");
	    FileWriter Fout =new FileWriter(fileB); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    year=Obj.nextInt();
    	day=Obj.nextInt();
    	month=Obj.nextInt();
    	amount=Obj.nextInt();
    	BillName=Obj.next();
	    if(year!=Find)
	    {
		Bout.write("\n"+year+" "+ day + " " + month+ " " + amount + " " + BillName);
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
		int year = 0;
		int month =0;
		int day=0;
		int amount=0;
		String BillName;
	    File file=new File("UtilityBills.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File file1=new File("AddTo.txt");
	    FileWriter Fout =new FileWriter(file1); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	year=Obj.nextInt();
	    	day=Obj.nextInt();
	    	month=Obj.nextInt();
	    	amount=Obj.nextInt();
	    	BillName=Obj.next();
	    if(year==Find)
	    {
	    	System.out.println("Enter Bill Name");
	    	BillName=input.next();
	    	System.out.println("Enter Total Amount");
	    	amount=input.nextInt();
	    	System.out.println("Enter Day ");
	    	day=input.nextInt();
	    	System.out.println("Enter Month ");
	    	month=input.nextInt();
	    	System.out.println("Enter Year ");
	    	year=input.nextInt();
	    	Bout.write("\n"+year+" "+ day + " " + month+ " " + amount + " " + BillName); 
	    }
	    else
	    {
	    	Bout.write("\n"+year+" "+ day + " " + month+ " " + amount + " " + BillName);
	    }
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
}
