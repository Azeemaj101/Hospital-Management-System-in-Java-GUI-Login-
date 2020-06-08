import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LikeVendi extends HospitalManagementSystem
{
	private String [] FoodName=new String[70];
	private String [] TokenID=new String[70];
	private String [] StockQuantity=new String[70];
	String [] Price=new String[70];
	Scanner input1=new Scanner(System.in);
	
	public void DisplayManager()
	{
		System.out.println("Manager Name           (Food Manager) = Shayan Tahir");
		System.out.println("Manager Contant Number (Food Manager) = 03244064060");
	}
	public void SGPharmacy()
	{
		for(int i=0 ; i<=1 ; i++)
		{
			System.out.println(i+1+". Food ID Number");
			TokenID[i]=input1.next();
			System.out.println(i+1+". Food Name");
		    FoodName[i]=input1.next();
		    System.out.println(i+1+". Food Stock");
		    StockQuantity[i]=input1.next();
		    System.out.println(i+1+". Food Price");
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
	    PHFout=new FileWriter("Food.txt" ,true);
	    PHBout=new BufferedWriter(PHFout);
	    
	    for(int i=0 ; i<=1 ; i++)
		{
	    tokenID[i]=Integer.parseInt(this.TokenID[i]);
	    stockQuantity[i]=Integer.parseInt(this.StockQuantity[i]);
	    price[i]=Integer.parseInt(this.Price[i]);
	    PHFout.write("\n"+tokenID[i]+" "+ stockQuantity[i] + " " + price[i]+ " " +FoodName[i]);
		}
	    PHBout.close();
	    PHFout.close();
	}

	public void FoodBuy() throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] FoodName=new String[100];
		int i=0;
		FileReader phFin;
		BufferedReader phBin = null;
		File phfile=new File("Food.txt");
		phFin=new FileReader(phfile);
		phBin=new BufferedReader(phFin);
		Scanner Obj=new Scanner(phBin);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	FoodName[i]=Obj.next();
	    	System.out.println("Food        Name  is = "+FoodName[i] 
	    			        +"\nToken ID of Food  is = "+Token[i]
	    			        +"\nRemaining Stock   is = "+stock[i]
	    			        +"\nPrice             is = "+ price[i]+"\n\n");
	    	i++;
	    }
	    phFin.close();
	    phBin.close();
	    Obj.close();
	}
	public void FoodBuy2() throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] FoodName=new String[100];
   	    File Rfile=new File("Food.txt");
     	FileReader Fin=new FileReader(Rfile);
    	BufferedReader Bin=new BufferedReader(Fin);
    	File Pfile2=new File("AddTo.txt");
   	    FileWriter PFout =new FileWriter(Pfile2); 
   	    BufferedWriter PBout=new BufferedWriter(PFout);
	    System.out.println("Please Enter Token ID of Food");
	    int Med=input1.nextInt();
	    int i2=0;
	    Scanner PObj=new Scanner(Bin);
	    while(PObj.hasNext())
	    {
	    	Token[i2]=PObj.nextInt();
	    	stock[i2]=PObj.nextInt();
	    	price[i2]=PObj.nextInt();
	    	FoodName[i2]=PObj.next();
	    if(Token[i2]==Med)
		{
	    	System.out.println("Food        Name  is = "+FoodName[i2] 
	    			        +"\nToken ID of Food  is = "+Token[i2]
	    			        +"\nRemaining Stock   is = "+stock[i2]
	    			        +"\nPrice             is = "+ price[i2]+"\n\n");
	    	System.out.println("Your Quantity");
	    	int Quan=input1.nextInt();
	    	if(stock[i2]>Quan && Quan>0)
	    	{
	    		long Bill=price[i2]*Quan;
	    		System.out.println("Food's Bill is ="+Bill);
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
	     	   System.out.println("Food        Name  is = "+FoodName[i2] 
   			                   +"\nToken ID of Food  is = "+Token[i2]
   			                   +"\nRemaining Stock   is = "+Stock
   			                   +"\nPrice             is = "+ price[i2]+"\n\n");
	     	    long RemQ[]=new long[100];
	     	    RemQ[z]=stock[i2]-Quan;
	   	    	PBout.write("\n"+Token[i2]+" "+ RemQ[z] + " " + price[i2]+ " " +FoodName[i2]);
	   	    	z++;
	   	    }
	    	else
	    	{
	    		PBout.write("\n"+Token[i2]+" "+ stock[i2] + " " + price[i2]+ " " +FoodName[i2]);
	    	}
	   	   
	    	}
	    else
   	    {
   	    	PBout.write("\n"+Token[i2]+" "+ stock[i2] + " " + price[i2]+ " " +FoodName[i2]);
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
	void FoodUpdate(int Find)throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] FoodName=new String[100];
		int i=0;
	    File file=new File("Food.txt");
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
	    	FoodName[i]=Obj.next();
	    if(Token[i]==Find)
	    {
	    	System.out.println(i+1+". Food ID Number");
			Token[i]=input1.nextInt();
			System.out.println(i+1+". Food Name");
		    FoodName[i]=input1.next();
		    System.out.println(i+1+". Food Stock");
		    stock[i]=input1.nextInt();
		    System.out.println(i+1+". Food Price");
		    price[i]=input1.nextInt();
	    	Bout.write("\n"+Token[i]+" "+ stock[i] + " " + price[i]+ " " +FoodName[i]); 
	    }
	    else
	    {
	    	Bout.write("\n"+Token[i]+" "+ stock[i] + " " + price[i]+ " " +FoodName[i]);
	    }
	    i++;
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
	void FoodDelete(int Find)throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] FoodName=new String[100];
		int i=0;
	    File file=new File("Food.txt");
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
	    	FoodName[i]=Obj.next();
	    if(Token[i]!=Find)
	    {
	    	Bout.write("\n"+Token[i]+" "+ stock[i] + " " + price[i]+ " " +FoodName[i]); 
	    }
	    i++;
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
	void FoodSearch(int Find)throws IOException
	{
		int [] Token =new int[100];
		int [] stock=new int[100];
		long [] price=new long[100];
		String [] FoodName=new String[100];
		int i=0;
	    File file=new File("Food.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    Scanner Obj=new Scanner(Bin);
	    Scanner INPUT=new Scanner(System.in);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	FoodName[i]=Obj.next();
	    if(Token[i]==Find)
	    {
	    	System.out.println("Food        Name  is = "+FoodName[i] 
	    			        +"\nToken ID of Food  is = "+Token[i]
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
		String [] FoodName=new String[100];
		int i=0;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("Food.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	Token[i]=Obj.nextInt();
	    	stock[i]=Obj.nextInt();
	    	price[i]=Obj.nextInt();
	    	FoodName[i]=Obj.next();
	    	System.out.println("Medicine    Name  is = "+FoodName[i] 
	    			        +"\nToken ID of Food  is = "+Token[i]
	    			        +"\nRemaining Stock   is = "+stock[i]
	    			        +"\nPrice             is = "+ price[i]+"\n\n");
	        i++;
	    }
	    Obj.close();
	    Fin.close();
	    Bin.close();
     }
}

