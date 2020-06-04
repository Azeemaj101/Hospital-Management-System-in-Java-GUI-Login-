import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pharmacy extends HospitalManagementSystem
{
	private String [] MedicineName=new String[13];
	private String [] TokenID=new String[13];
	private String [] StockQuantity=new String[13];
	String [] Price=new String[13];
	Scanner input1=new Scanner(System.in);
	
	public void DisplayManager()
	{
		System.out.println("Manager Name           (LAB Manager) = Shayan Tahir");
		System.out.println("Manager Contant Number (LAB Manager) = 03244064060");
	}
	public void SGPharmacy()
	{
		for(int i=0 ; i<=1 ; i++)
		{
			System.out.println(i+1+". Medicine ID Number");
			TokenID[i]=input1.next();
			System.out.println(i+1+". Medicine Name");
		    MedicineName[i]=input1.next();
		    System.out.println(i+1+". Medicine Stock");
		    StockQuantity[i]=input1.next();
		    System.out.println(i+1+". Medicine Price");
		    Price[i]=input1.next();
		}
    }
	public void PinsertNew ()throws IOException
	{
		int []stockQuantity=new int[70];
		int []price=new int[70];
		int []tokenID=new int[70];
		FileWriter PHFout;
		BufferedWriter PHBout = null;
	    PHFout=new FileWriter("Pharmacy.txt" ,true);
	    PHBout=new BufferedWriter(PHFout);
	    
	    for(int i=0 ; i<=1 ; i++)
		{
	    tokenID[i]=Integer.parseInt(this.TokenID[i]);
	    stockQuantity[i]=Integer.parseInt(this.StockQuantity[i]);
	    price[i]=Integer.parseInt(this.Price[i]);
	    PHFout.write("\n"+tokenID[i]+" "+ stockQuantity[i] + " " + price[i]+ " " +MedicineName[i]);
		}
	    PHBout.close();
	    PHFout.close();
	}

	public void MedicineBuy() throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] MedicineName=new String[100];
		int i=0;
		FileReader phFin;
		BufferedReader phBin = null;
		File phfile=new File("Pharmacy.txt");
		phFin=new FileReader(phfile);
		phBin=new BufferedReader(phFin);
		Scanner Obj=new Scanner(phBin);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	MedicineName[i]=Obj.next();
	    	System.out.println("Medicine    Name  is = "+MedicineName[i] 
	    			        +"\nToken ID of Medicine = "+Token[i]
	    			        +"\nRemaining Stock   is = "+stock[i]
	    			        +"\nPrice             is = "+ price[i]+"\n\n");
	    	i++;
	    }
	    phFin.close();
	    phBin.close();
	}
	public void MedicineBuy2() throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] MedicineName=new String[100];
   	    File Rfile=new File("Pharmacy.txt");
     	FileReader Fin=new FileReader(Rfile);
    	BufferedReader Bin=new BufferedReader(Fin);
    	File Pfile2=new File("AddTo.txt");
   	    FileWriter PFout =new FileWriter(Pfile2); 
   	    BufferedWriter PBout=new BufferedWriter(PFout);
	    System.out.println("Please Enter Token ID of Medicine");
	    int Med=input1.nextInt();
	    int i2=0;
	    Scanner PObj=new Scanner(Bin);
	    while(PObj.hasNext())
	    {
	    	Token[i2]=PObj.nextInt();
	    	stock[i2]=PObj.nextInt();
	    	price[i2]=PObj.nextInt();
	    	MedicineName[i2]=PObj.next();
	    if(Token[i2]==Med)
		{
	    	System.out.println("Medicine    Name  is = "+MedicineName[i2] 
	    			        +"\nToken ID of Medicine = "+Token[i2]
	    			        +"\nRemaining Stock   is = "+stock[i2]
	    			        +"\nPrice             is = "+ price[i2]+"\n\n");
	    	System.out.println("Your Quantity");
	    	int Quan=input1.nextInt();
	    	if(stock[i2]>Quan && Quan>0)
	    	{
	    		long Bill=price[i2]*Quan;
	    		System.out.println("Medicine's Bill is ="+Bill);
	    		int i1=0;
	    	    long Money=0;
	    	 	FileReader MFin;
	    	 	BufferedReader MBin = null;
	    	 	MFin=new FileReader("HospitalBANK.txt");
	    	 	MBin=new BufferedReader(MFin);
	    	 	Scanner MObj=new Scanner(MBin);
	    	 	while(MObj.hasNext())
	    	 	    {
	    	 	    	Money=MObj.nextLong();
	    	 	    	i1++;
	    	 	    }
	    	 	long FBill=Money+Bill;
	        	FileWriter Fout;
	    		BufferedWriter Bout = null;
	    	    Fout=new FileWriter("HospitalBANK.txt" ,false);
	    	    Bout=new BufferedWriter(Fout);
	    	    Bout.write("\n"+FBill);
	     	    Bout.close();
	     	    Fout.close();
	     	    MObj.close();
	     	    MFin.close();
	     	    MBin.close();
	     	    int z=0;
	     	   int Stock=stock[i2]-Quan;
	     	    System.out.println("Payment Done");
	     	   System.out.println("Medicine    Name  is = "+MedicineName[i2] 
   			                   +"\nToken ID of Medicine = "+Token[i2]
   			                   +"\nRemaining Stock   is = "+Stock
   			                   +"\nPrice             is = "+ price[i2]+"\n\n");
	     	    long RemQ[]=new long[100];
	     	    RemQ[z]=stock[i2]-Quan;
	   	    	PBout.write("\n"+Token[i2]+" "+ RemQ[z] + " " + price[i2]+ " " +MedicineName[i2]);
	   	    	z++;
	   	    }
	    	else
	    	{
	    		PBout.write("\n"+Token[i2]+" "+ stock[i2] + " " + price[i2]+ " " +MedicineName[i2]);
	    	}
	   	   
	    	}
	    else
   	    {
   	    	PBout.write("\n"+Token[i2]+" "+ stock[i2] + " " + price[i2]+ " " +MedicineName[i2]);
   	    }
	    i2++;
	    }
	    PBout.close();
	    Bin.close();
	    Rfile.delete();
	    Rfile.delete();
	    Pfile2.renameTo(Rfile);
	    PObj.close();
	    
	    
	}
	void MedicineUpdate(int Find)throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] MedicineName=new String[100];
		int i=0;
	    File file=new File("Pharmacy.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File file1=new File("Addo.txt");
	    FileWriter Fout =new FileWriter(file1); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    Scanner INPUT=new Scanner(System.in);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	MedicineName[i]=Obj.next();
	    if(Token[i]==Find)
	    {
	    	System.out.println(i+1+". Medicine ID Number");
			Token[i]=input1.nextInt();
			System.out.println(i+1+". Medicine Name");
		    MedicineName[i]=input1.next();
		    System.out.println(i+1+". Medicine Stock");
		    stock[i]=input1.nextInt();
		    System.out.println(i+1+". Medicine Price");
		    price[i]=input1.nextInt();
	    	Bout.write("\n"+Token[i]+" "+ stock[i] + " " + price[i]+ " " +MedicineName[i]); 
	    }
	    else
	    {
	    	Bout.write("\n"+Token[i]+" "+ stock[i] + " " + price[i]+ " " +MedicineName[i]);
	    }
	    i++;
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
	void MedicineDelete(int Find)throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] MedicineName=new String[100];
		int i=0;
	    File file=new File("Pharmacy.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File file1=new File("Addo.txt");
	    FileWriter Fout =new FileWriter(file1); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    Scanner INPUT=new Scanner(System.in);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	MedicineName[i]=Obj.next();
	    if(Token[i]!=Find)
	    {
	    	Bout.write("\n"+Token[i]+" "+ stock[i] + " " + price[i]+ " " +MedicineName[i]); 
	    }
	    i++;
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
	void MedicineSearch(int Find)throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] MedicineName=new String[100];
		int i=0;
	    File file=new File("Pharmacy.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    Scanner Obj=new Scanner(Bin);
	    Scanner INPUT=new Scanner(System.in);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	MedicineName[i]=Obj.next();
	    if(Token[i]==Find)
	    {
	    	System.out.println("Medicine    Name  is = "+MedicineName[i] 
	    			        +"\nToken ID of Medicine = "+Token[i]
	    			        +"\nRemaining Stock   is = "+stock[i]
	    			        +"\nPrice             is = "+ price[i]+"\n\n");
	    }
	    i++;
	    }
	    Fin.close();
	    Bin.close();
	    Obj.close();
	}
	public void Pview () throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] MedicineName=new String[100];
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("Pharmacy.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	MedicineName[i]=Obj.next();
	    	System.out.println("Medicine    Name  is = "+MedicineName[i] 
	    			        +"\nToken ID of Medicine = "+Token[i]
	    			        +"\nRemaining Stock   is = "+stock[i]
	    			        +"\nPrice             is = "+ price[i]+"\n\n");
	        i++;
	    }
	    Obj.close();
	    Fin.close();
	    Bin.close();
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
				System.out.println("Welcome Back Shayan Tahir (Accountent)");
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
				Question=input1.nextInt();
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
				Password=input1.nextInt();
				Password=Forget;
				}
			}
			else
			{
				System.out.println("Wrong Password \nPress 1 For Recover your password");
				Recovery=input1.nextInt();
			}
		}
		}
}

