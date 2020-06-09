import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HospitalParking 
{
	private String VehicleNumber;
	private String TokenNumber;
	private String VehicleType;
	Scanner INPUT=new Scanner(System.in);
	public void setVehicleType(String vehicleType) 
	{
		VehicleType = vehicleType;
	}
	public void setTokenNumber(String tokenNumber) 
	{
		TokenNumber = tokenNumber;
	}
	public void setVehicleNumber(String vehicleNumber) 
	{
		VehicleNumber = vehicleNumber;
	}
	public void insert() throws IOException
	{
	FileWriter Fout;
	BufferedWriter Bout = null;
    Fout=new FileWriter("HospitalParking.txt" ,true);
    Bout=new BufferedWriter(Fout);
    
    int Vnumber=Integer.parseInt(VehicleNumber);
    int TNumber=Integer.parseInt(TokenNumber);
    Fout.write("\n"+TNumber+" "+ Vnumber + " " + VehicleType);
    Bout.close();
    Fout.close();
	}
	void View()throws IOException
	{
		int VNumber = 0;
		int TNumber =0;
		String VType;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("HospitalParking.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	TNumber=Obj.nextInt();
	    	VNumber=Obj.nextInt();
	    	VType=Obj.next();
	    	System.out.println("Token   Number is = "+TNumber 
	    			        +"\nVehicle Number is = "+VNumber
	    			        +"\nVehicle Type   is = "+VType+"\n");
	}
	    Fin.close();
	    Bin.close();
	    Obj.close();
	    }
	void Search(int FindToken)throws IOException
	{
		int VNumber = 0;
		int TNumber =0;
		String VType;
		FileReader Fin;
		BufferedReader Bin = null;
		Fin=new FileReader("HospitalParking.txt");
	    Bin=new BufferedReader(Fin);
		Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	TNumber=Obj.nextInt();
	    	VNumber=Obj.nextInt();
	    	VType=Obj.next();
	    if(TNumber==FindToken)
	    {
	    	System.out.println("Token   Number is = "+TNumber 
	    			        +"\nVehicle Number is = "+VNumber
	    			        +"\nVehicle Type   is = "+VType+"\n");
	    }
	    }
	    Obj.close();
	    Fin.close();
	    Bin.close();
	}
	void Delete(int Find)throws IOException
	{
		int VNumber = 0;
		int TNumber =0;
		String VType;
	    File fileA=new File("HospitalParking.txt");
	    FileReader Fin=new FileReader(fileA);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File fileB=new File("AddT.txt");
	    FileWriter Fout =new FileWriter(fileB); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    while(Obj.hasNext())
	    {
	    	TNumber=Obj.nextInt();
	    	VNumber=Obj.nextInt();
	    	VType=Obj.next();
	    if(TNumber!=Find)
	    {
		Bout.write("\n"+TNumber+" "+ VNumber + " " + VType);
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
		int VNumber = 0;
		int TNumber =0;
		String VType;
	    File file=new File("HospitalParking.txt");
	    FileReader Fin=new FileReader(file);
	    BufferedReader Bin=new BufferedReader(Fin);
	    File file1=new File("AddTo.txt");
	    FileWriter Fout =new FileWriter(file1); 
	    BufferedWriter Bout=new BufferedWriter(Fout);
	    Scanner Obj=new Scanner(Bin);
	    
	    while(Obj.hasNext())
	    {
	    	TNumber=Obj.nextInt();
	    	VNumber=Obj.nextInt();
	    	VType=Obj.next();
	    if(TNumber==Find)
	    {
	    	System.out.println("Enter Token Number");
	    	TNumber=INPUT.nextInt();
	    	System.out.println("Enter Vehicle Number");
	    	VNumber=INPUT.nextInt();
	    	System.out.println("Enter Your Vehicle Type");
	    	VType=INPUT.next();
	    	Bout.write("\n"+TNumber+" "+ VNumber + " " + VType); 
	    }
	    else
	    {
	    	Bout.write("\n"+TNumber+" "+ VNumber + " " + VType);
	    }
	    }
	    Bout.close();
	    Bin.close();
	    file.delete();
	    file1.renameTo(file);
	    Obj.close();
	}
}
