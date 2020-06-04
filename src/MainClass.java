import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
public class MainClass 
{
	public static void main(String [] args) throws InterruptedException, IOException
	{
		Login Run=new Login();
		Exit Ex=new Exit();
		Scanner input=new Scanner(System.in);
		HospitalManagementSystem obj=new HospitalManagementSystem();
		LocalDateTime RuffTime=LocalDateTime.now();
		DateTimeFormatter NowDate=DateTimeFormatter.ofPattern("E-dd-MM-yy");
		DateTimeFormatter NowTime=DateTimeFormatter.ofPattern("hh-mm-ss");
		String TrueTime=RuffTime.format(NowTime);
		String TrueDate=RuffTime.format(NowDate);
		Run.main(args);
		System.out.println("Continue....");
		System.in.read();
		System.in.read();
		if(Login.a != 0)
		{
		FileReader Fout;
		BufferedReader Bout = null;
	    Fout=new FileReader("Welcome.txt");
	    Bout=new BufferedReader(Fout);
		Scanner Obj=new Scanner(Bout);
	    int ch;
		while((ch=Bout.read())!=-1)
	    {
	    	System.out.print((char)ch);
	    }
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tDate:"+TrueDate);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tTime:"+TrueTime);
		System.in.read();
		
		boolean HStart=false;
		while(HStart==false)
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
		System.out.println("\nPress 1   For Hospital       Information         ");
		System.out.println("\nPress 2   For Hospital       Parking     System  ");
		System.out.println("\nPress 3   For Receptionist   All                 ");
		System.out.println("\nPress 4   For Hospital       Notice      Board   ");
		System.out.println("\nPress 5   For Hospital       Salaries            ");
		System.out.println("\nPress 6   For Hospital       Patients            ");
		System.out.println("\nPress 7   For Hospital       Pathology   LAB     ");
		System.out.println("\nPress 8   For Hospital       Pharmacy            ");
		System.out.println("\nPress 9   For Hospital       EXITS               ");
		for(int i=0; i<=10 ; i++)
		{
			System.out.println();
		}
		int ParentSwitch=input.nextInt();
		switch(ParentSwitch)
		{
		case 1:
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			System.out.println("Please Enter your Password ");
			int Hlogin=input.nextInt();
			obj.Login(Hlogin);
			boolean HWhile=true;
			while(HWhile==true)
			{
				System.out.println("\nPress Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			System.out.println("\n\nPress 1 for Insert New \nPress 2 for View Hospital Information \nPress 3 for Main Manu");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int HAdd=input.nextInt();
			if(HAdd==1)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter Hospital Name");
				String HName=input.next();
				System.out.println("Please Enter Hospital City");
				String HCity=input.next();
				System.out.println("Please Enter Hospital Contact Number");
				String HNumber=input.next();
				obj.setHospitalName(HName);
				obj.setLocation(HCity);
				obj.setHospitalNumber(HNumber);
				obj.insert();
			}
			else if(HAdd==2)
			{
				
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				obj.View();		
				System.out.println("\nPress Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			}
			else if(HAdd==3)
			{
				
				HWhile=false;
				
			}
			else
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Wrong Please Only Press Enter To Try Again");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				System.out.println("\nPress Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			}
			}
			break;
		}
		case 2:
		{
			boolean WhileParking=false;
			while(WhileParking==false)
			{
			HospitalParking Hp=new HospitalParking();
			int ParkingSelect;
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			System.out.println("Press 1 For Add    Vehical");
			System.out.println("Press 2 For View   Vehical");
			System.out.println("Press 3 For Search Vehical");
			System.out.println("Press 4 For Delete Vehical");
			System.out.println("Press 5 For Update Vehical");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			ParkingSelect=input.nextInt();
			if(ParkingSelect==1)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Token Number");
		    	String TNumber=input.next();
		    	System.out.println("Enter Vehicle Number");
		    	String VNumber=input.next();
		    	System.out.println("Enter Your Vehicle Type");
		    	String VType=input.next();
		    	Hp.setTokenNumber(TNumber);
		    	Hp.setVehicleNumber(VNumber);
		    	Hp.setVehicleType(VType);
				Hp.insert();
				System.out.println("\n\n\n\n");
				boolean whileSPI=false;
				while(whileSPI==false)
				{
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Parking Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SPI=input.nextInt();
				if(SPI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileSPI=true;
				}
				else if(SPI==2)
				{
					WhileParking=true;
					whileSPI=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			}
			else if(ParkingSelect==2)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				Hp.View();
				System.out.println("Press Enter To Continue....");
				System.out.println("\n\n\n\n\n\n");
				boolean whileSPV=false;
				while(whileSPV==false)
				{
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Parking Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SPV=input.nextInt();
				if(SPV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileSPV=true;
				}
				else if(SPV==2)
				{
					WhileParking=true;
					whileSPV=true;
				}
				else
				{
					System.out.println("\n\n\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			}
			else if(ParkingSelect==3)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Token Number for Search");
	    	    int TSNumber=input.nextInt();
				Hp.Search(TSNumber);
				System.out.println("\n\n\n\n\n\n");
				boolean whileSPS=false;
				while(whileSPS==false)
				{
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Parking Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SPS=input.nextInt();
				if(SPS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileSPS=true;
				}
				else if(SPS==2)
				{
					WhileParking=true;
					whileSPS=true;
				}
				else
				{
					System.out.println("\n\n\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			}
			else if(ParkingSelect==4)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Token Number for Delete");
	    	    int TDNumber=input.nextInt();
				Hp.Delete(TDNumber);
				System.out.println("\n\n\n\n\n\n");
				boolean whileSPD=false;
				while(whileSPD==false)
				{
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Parking Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SPD=input.nextInt();
				if(SPD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileSPD=true;
				}
				else if(SPD==2)
				{
					WhileParking=true;
					whileSPD=true;
				}
				else
				{
					System.out.println("\n\n\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			}
			else if(ParkingSelect==5)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Token Number for Update");
	    	    int TUNumber=input.nextInt();
				Hp.update(TUNumber);
				System.out.println("\n\n\n\n\n\n");
				boolean whileSPU=false;
				while(whileSPU==false)
				{
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Parking Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SPU=input.nextInt();
				if(SPU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileSPU=true;
				}
				else if(SPU==2)
				{
					WhileParking=true;
					whileSPU=true;
				}
				else
				{
					System.out.println("\n\n\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			}
			else if(ParkingSelect==6)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				WhileParking=true;
				System.out.println("\n\n\n\n");
			}
			else
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Try Again Please Press Enter Only");
				System.out.println("\nPress Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			}
			}
			break;
		}
		case 3:
		{
		boolean REPSwitch=false;
		while(REPSwitch==false)
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
		System.out.println("\nPress 1   For Hospital Eye       Department");//270
		System.out.println("\nPress 2   For Hospital Cancer    Department");//543
		System.out.println("\nPress 3   For Hospital Cardiac   Department");//816
		System.out.println("\nPress 4   For Hospital Corona    Department");//1080
		System.out.println("\nPress 5   For Hospital Gernal    Department");//1464
		System.out.println("\nPress 6   For Hospital Operation Department");//1737
		System.out.println("\nPress 7   For Hospital Rooms               ");//2019
		System.out.println("\nPress 8   For Hospital Doctors             ");//2106
		System.out.println("\nPress 9   For Hospital Nurses              ");//2273
		System.out.println("\nPress 10  For Hospital Workers             ");//2440
		System.out.println("\nPress 11  For Hospital Utility   Bills     ");//2607
		for(int i=0; i<=14 ; i++)
		{
			System.out.println();
		}
		int Start=input.nextInt();
		switch(Start)
		{
		case 1://Receptionist switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			Eyereceptionist Hp = new Eyereceptionist();
			System.out.println("Enter Your Password (Eye Department)");
			int Password=input.nextInt();
			Hp.Login(Password);
			boolean WhileEye=false;
			while(WhileEye==false)
			{
			int EyeSelect;
			System.out.println("\nPress Enter To Continue....");
			System.in.read();
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			System.out.println("\nPress 1 For Eye Department Information");
			System.out.println("Press 2 For Receptionist");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			EyeSelect=input.nextInt();
			if(EyeSelect==1)
			{
				
				boolean HEyeWhileSwitch=false;
				while(HEyeWhileSwitch==false)
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("\nPress 1 for Insert Hospital Information \nPress 2 for View Hospital Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int IHI=input.nextInt();
		    	switch(IHI)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Enter Name of Eye Department Head");
			    	String HName=input.next();
			    	System.out.println("Enter Block Number of Eye Department");
			    	String BNumber=input.next();
			    	Hp.setHeadName(HName);
			    	Hp.setDeptBlockNumber(BNumber);
					Hp.insertNew();
					boolean whileHEI=false;
					while(whileHEI==false)
					{
						System.out.println("\nPress Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
					int HEI=input.nextInt();
					if(HEI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHEI=true;
						HEyeWhileSwitch=true;
					}
					else if(HEI==2)
					{
						whileHEI=true;
						WhileEye=true;
						HEyeWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("\nPress Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
		    	}
		    	case 2:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		Hp.Hview();
		    		System.out.println("\n\n\n\n");
				boolean whilHEV=false;
				while(whilHEV==false)
				{
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVE=input.nextInt();
				if(SVE==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHEV=true;
					HEyeWhileSwitch=true;
				}
				else if(SVE==2)
				{
					WhileEye=true;
					whilHEV=true;
					HEyeWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("\nPress Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	default:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Try Again Wrong Key");
		    		System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
		    		HEyeWhileSwitch=false;
		    		break;
		    	}
		    	}
		    }
			}
			else if(EyeSelect==2)
			{
			    boolean RecpSwitWhil=false;
			    while(RecpSwitWhil==false)
			    {
			    	for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Doctors List");
				System.out.println("Press 2 For View   Doctors List");
				System.out.println("Press 3 For Search Doctors List");
				System.out.println("Press 4 For Delete Doctors List");
				System.out.println("Press 5 For Update Doctors List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepSwitch=input.nextInt();
				switch(RecepSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					Hp.DoctorTimeTable();
					Hp.RinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileREI=false;
					while(whileREI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int REI=input.nextInt();
					if(REI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileREI=true;
						RecpSwitWhil=true;
					}
					else if(REI==2)
					{
						WhileEye=true;
						whileREI=true;
						RecpSwitWhil=true;
					}
					else
					{
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=25 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					Hp.view();
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					System.out.println("\n\n\n\n");
					boolean whileREV=false;
					while(whileREV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int REV=input.nextInt();
					if(REV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileREV=true;
						RecpSwitWhil=true;
					}
					else if(REV==2)
					{
						WhileEye=true;
						whileREV=true;
						RecpSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					Hp.Search(FindID);
					System.out.println("\n\n\n\n");
					boolean whileRES=false;
					while(whileRES==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RES=input.nextInt();
					if(RES==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRES=true;
						RecpSwitWhil=true;
					}
					else if(RES==2)
					{
						WhileEye=true;
						whileRES=true;
						RecpSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					int Find=input.nextInt();
					Hp.Delete(Find);
					boolean whileRED=false;
					while(whileRED==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RED=input.nextInt();
					if(RED==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRED=true;
						RecpSwitWhil=true;
					}
					else if(RED==2)
					{
						WhileEye=true;
						whileRED=true;
						RecpSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					Hp.update(UFind);
					boolean whileREU=false;
					while(whileREU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Eye Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int REU=input.nextInt();
					if(REU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileREU=true;
						RecpSwitWhil=true;
					}
					else if(REU==2)
					{
						WhileEye=true;
						whileREU=true;
						RecpSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
				}
				default:
				{
					System.out.println("Press Right Key");
					RecpSwitWhil=false;
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			    }
			}
			else
			{
				System.out.println("Press Right Key");
				WhileEye=false;
			}
			}
			break;
		}
		case 2://Receptionist Switch
		{
		    for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			Cancerreceptionist HC = new Cancerreceptionist();
			System.out.println("Enter Your Password (Cencer Department)");
			int Password=input.nextInt();
			HC.Login(Password);
			boolean WhileCancer=false;
			while(WhileCancer==false)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			int CancerSelect;
			System.out.println("\nPress 1 For Cancer Department Information");
			System.out.println("Press 2 For Cancer Receptionist");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			CancerSelect=input.nextInt();
			if(CancerSelect==1)
			{
				boolean HCancerWhileSwitch=false;
				while(HCancerWhileSwitch==false)
				{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("\nPress 1 for Insert Hospital Information \nPress 2 for View Hospital Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int IHI=input.nextInt();
		    	switch(IHI)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Enter Name of Eye Department Head");
			    	String HName=input.next();
			    	System.out.println("Enter Block Number of Eye Department");
			    	String BNumber=input.next();
			    	HC.setHeadName(HName);
			    	HC.setDeptBlockNumber(BNumber);
					HC.insertNew();
					boolean whileHEI=false;
					while(whileHEI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HEI=input.nextInt();
					if(HEI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHEI=true;
						HCancerWhileSwitch=true;
					}
					else if(HEI==2)
					{
						whileHEI=true;
						WhileCancer=true;
						HCancerWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
		    	}
		    	case 2:
		    	{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HC.Hview();
				System.out.println("\n\n\n\n");
				boolean whilHEV=false;
				while(whilHEV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVE=input.nextInt();
				if(SVE==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHEV=true;
					HCancerWhileSwitch=true;
				}
				else if(SVE==2)
				{
					WhileCancer=true;
					whilHEV=true;
					HCancerWhileSwitch=true;
				}
				else
				{
					
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	default:
		    	{
		    		System.out.println("Try Again Wrong Key");
		    		HCancerWhileSwitch=false;
		    		break;
		    	}
		    	}
		    }
			}
			else if(CancerSelect==2)
			{
			    boolean RecpCancerSwitWhil=false;
			    while(RecpCancerSwitWhil==false)
			    {
			    	for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Doctors List");
				System.out.println("Press 2 For View   Doctors List");
				System.out.println("Press 3 For Search Doctors List");
				System.out.println("Press 4 For Delete Doctors List");
				System.out.println("Press 5 For Update Doctors List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepSwitch=input.nextInt();
				switch(RecepSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HC.DoctorTimeTable();
					HC.RCNinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileRCI=false;
					while(whileRCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCI=input.nextInt();
					if(RCI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCI=true;
						RecpCancerSwitWhil=true;
					}
					else if(RCI==2)
					{
						WhileCancer=true;
						whileRCI=true;
						RecpCancerSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HC.RCNview();
					System.out.println("\n\n\n\n");
					boolean whileRCV=false;
					while(whileRCV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCV=input.nextInt();
					if(RCV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCV=true;
						RecpCancerSwitWhil=true;
					}
					else if(RCV==2)
					{
						WhileCancer=true;
						whileRCV=true;
						RecpCancerSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					HC.RCNSearch(FindID);
					System.out.println("\n\n\n\n");
					boolean whileRCS=false;
					while(whileRCS==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCS=input.nextInt();
					if(RCS==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCS=true;
						RecpCancerSwitWhil=true;
					}
					else if(RCS==2)
					{
						WhileCancer=true;
						whileRCS=true;
						RecpCancerSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					int Find=input.nextInt();
					HC.RCNDelete(Find);
					boolean whileRCD=false;
					while(whileRCD==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCD=input.nextInt();
					if(RCD==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCD=true;
						RecpCancerSwitWhil=true;
					}
					else if(RCD==2)
					{
						WhileCancer=true;
						whileRCD=true;
						RecpCancerSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					HC.RCNUpdate(UFind);
					boolean whileRCU=false;
					while(whileRCU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCU=input.nextInt();
					if(RCU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCU=true;
						RecpCancerSwitWhil=true;
					}
					else if(RCU==2)
					{
						WhileCancer=true;
						whileRCU=true;
						RecpCancerSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					RecpCancerSwitWhil=false;
				}
				}
			    }
			}
			else
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				WhileCancer=false;
			}
			}
			break;
		}
		case 3://Receptionist Switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			Cardiacreceptionist HCD = new Cardiacreceptionist();
			boolean WhileCardiac=false;
			while(WhileCardiac==false)
			{
				
			int CardiacSelect;
			System.out.println("Enter Your Password (Cardiac Department)");
			int Password=input.nextInt();
			HCD.Login(Password);
			System.out.println("Press Enter To Continue....");
			System.in.read();
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			System.out.println("\nPress 1 For Cardiac Department   Information");
			System.out.println("Press 2 For Cardiac Receptionist            ");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			CardiacSelect=input.nextInt();
			if(CardiacSelect==1)
			{
				
				boolean HCardiacWhileSwitch=false;
				while(HCardiacWhileSwitch==false)
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("\nPress 1 for Insert Hospital Information \nPress 2 for View Hospital Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
		    	int CD=input.nextInt();
		    	switch(CD)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Enter Name of Eye Department Head");
			    	String HName=input.next();
			    	System.out.println("Enter Block Number of Eye Department");
			    	String BNumber=input.next();
			    	HCD.setHeadName(HName);
			    	HCD.setDeptBlockNumber(BNumber);
					HCD.insertNew();
					boolean whileHCI=false;
					while(whileHCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cardiac Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HCI=input.nextInt();
					if(HCI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHCI=true;
						HCardiacWhileSwitch=true;
					}
					else if(HCI==2)
					{
						whileHCI=true;
						WhileCardiac=true;
						HCardiacWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
		    	}
		    	case 2:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HCD.Hview();
				System.out.println("\n\n\n\n");
				boolean whilHCV=false;
				while(whilHCV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVC=input.nextInt();
				if(SVC==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHCV=true;
					HCardiacWhileSwitch=true;
				}
				else if(SVC==2)
				{
					WhileCardiac=true;
					whilHCV=true;
					HCardiacWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	default:
		    	{
		    		System.out.println("Try Again Wrong Key");
		    		System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HCardiacWhileSwitch=false;
		    		break;
		    	}
		    	}
		    }
			}
			else if(CardiacSelect==2)
			{
			    boolean RecpCardiacSwitWhil=false;
			    while(RecpCardiacSwitWhil==false)
			    {
			        for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Doctors List");
				System.out.println("Press 2 For View   Doctors List");
				System.out.println("Press 3 For Search Doctors List");
				System.out.println("Press 4 For Delete Doctors List");
				System.out.println("Press 5 For Update Doctors List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepCardiacSwitch=input.nextInt();
				switch(RecepCardiacSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HCD.DoctorTimeTable();
					HCD.RCDinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileRCI=false;
					while(whileRCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCDI=input.nextInt();
					if(RCDI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCI=true;
						RecpCardiacSwitWhil=true;
					}
					else if(RCDI==2)
					{
						WhileCardiac=true;
						whileRCI=true;
						RecpCardiacSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HCD.RCDview();
					System.out.println("\n\n\n\n");
					boolean whileRCDV=false;
					while(whileRCDV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCDV=input.nextInt();
					if(RCDV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCDV=true;
						RecpCardiacSwitWhil=true;
					}
					else if(RCDV==2)
					{
						WhileCardiac=true;
						whileRCDV=true;
						RecpCardiacSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					HCD.RCDSearch(FindID);
					System.out.println("\n\n\n\n");
					boolean whileRCD=false;
					while(whileRCD==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cardiac Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCD=input.nextInt();
					if(RCD==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCD=true;
						RecpCardiacSwitWhil=true;
					}
					else if(RCD==2)
					{
						WhileCardiac=true;
						whileRCD=true;
						RecpCardiacSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					int Find=input.nextInt();
					HCD.RCDelete(Find);
					boolean whileRCD=false;
					while(whileRCD==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCD=input.nextInt();
					if(RCD==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCD=true;
						RecpCardiacSwitWhil=true;
					}
					else if(RCD==2)
					{
						WhileCardiac=true;
						whileRCD=true;
						RecpCardiacSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					HCD.RCDUpdate(UFind);
					boolean whileRCU=false;
					while(whileRCU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Cancer Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCU=input.nextInt();
					if(RCU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCU=true;
						RecpCardiacSwitWhil=true;
					}
					else if(RCU==2)
					{
						WhileCardiac=true;
						whileRCU=true;
						RecpCardiacSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					RecpCardiacSwitWhil=false;
				}
				}
			    }
			}
			else
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				WhileCardiac=false;
			}
			}
			break;
		}
		case 4://Receptionist Switch
		{
			REPSwitch=true;
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			Coronareceptionist HCR = new Coronareceptionist();
			System.out.println("Enter Your Password (Corona Depatment)");
			int Password=input.nextInt();
			HCR.Login(Password);
			boolean WhileCorona=false;
			while(WhileCorona==false)
			{
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			int CoronaSelect;
			System.out.println("\nPress 1 For Corona Department Information");
			System.out.println("Press 2 For Corona Receptionist");
			System.out.println("Press 3 For IsolationWard ");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			CoronaSelect=input.nextInt();
			if(CoronaSelect==1)
			{
				
				boolean HCoronaWhileSwitch=false;
				while(HCoronaWhileSwitch==false)
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("\nPress 1 for Insert Hospital Information \nPress 2 for View Hospital Information \nPress 3 For Doctor's Kits Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HCI=input.nextInt();
		    	switch(HCI)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Enter Name of Corona Department Head");
			    	String HName=input.next();
			    	System.out.println("Enter Block Number of Corona Department");
			    	String BNumber=input.next();
			    	HCR.setHeadName(HName);
			    	HCR.setDeptBlockNumber(BNumber);
					HCR.insertNew();
					boolean whileHCI=false;
					while(whileHCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HRI=input.nextInt();
					if(HRI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHCI=true;
						HCoronaWhileSwitch=true;
					}
					else if(HCI==2)
					{
						whileHCI=true;
						WhileCorona=true;
						HCoronaWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
		    	}
		    	case 2:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HCR.Hview();
				System.out.println("\n\n\n\n");
				boolean whilHCV=false;
				while(whilHCV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVC=input.nextInt();
				if(SVC==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHCV=true;
					HCoronaWhileSwitch=true;
				}
				else if(SVC==2)
				{
					WhileCorona=true;
					whilHCV=true;
					HCoronaWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	case 3:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HCR.DoctorKit();
				System.out.println("\n\n\n\n");
				boolean whilHCV=false;
				while(whilHCV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVC=input.nextInt();
				if(SVC==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHCV=true;
					HCoronaWhileSwitch=true;
				}
				else if(SVC==2)
				{
					WhileCorona=true;
					whilHCV=true;
					HCoronaWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	
		    	default:
		    	{
		    		System.out.println("Try Again Wrong Key");
		    		System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HCoronaWhileSwitch=false;
		    		break;
		    	}
		    	}
		    }
			}
			else if(CoronaSelect==2)
			{
			    boolean RecpCoronaSwitWhil=false;
			    while(RecpCoronaSwitWhil==false)
			    {
			    	for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Doctors List");
				System.out.println("Press 2 For View   Doctors List");
				System.out.println("Press 3 For Search Doctors List");
				System.out.println("Press 4 For Delete Doctors List");
				System.out.println("Press 5 For Update Doctors List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepCoronaSwitch=input.nextInt();
				switch(RecepCoronaSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HCR.DoctorTimeTable();
					HCR.CRinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileRCI=false;
					while(whileRCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCI=input.nextInt();
					if(RCI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCI=true;
						RecpCoronaSwitWhil=true;
					}
					else if(RCI==2)
					{
						WhileCorona=true;
						whileRCI=true;
						RecpCoronaSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HCR.RCview();
					System.out.println("\n\n\n\n");
					boolean whileRCV=false;
					while(whileRCV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCV=input.nextInt();
					if(RCV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCV=true;
						RecpCoronaSwitWhil=true;
					}
					else if(RCV==2)
					{
						WhileCorona=true;
						whileRCV=true;
						RecpCoronaSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					HCR.RCSearch(FindID);
					System.out.println("\n\n\n\n");
					boolean whileRCS=false;
					while(whileRCS==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCS=input.nextInt();
					if(RCS==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCS=true;
						RecpCoronaSwitWhil=true;
					}
					else if(RCS==2)
					{
						WhileCorona=true;
						whileRCS=true;
						RecpCoronaSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					int Find=input.nextInt();
					HCR.RCDelete(Find);
					boolean whileRCD=false;
					while(whileRCD==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCD=input.nextInt();
					if(RCD==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCD=true;
						RecpCoronaSwitWhil=true;
					}
					else if(RCD==2)
					{
						WhileCorona=true;
						whileRCD=true;
						RecpCoronaSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					HCR.RCUpdate(UFind);
					boolean whileRCU=false;
					while(whileRCU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCU=input.nextInt();
					if(RCU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCU=true;
						RecpCoronaSwitWhil=true;
					}
					else if(RCU==2)
					{
						WhileCorona=true;
						whileRCU=true;
						RecpCoronaSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					RecpCoronaSwitWhil=false;
				}
				}
			    }
			}
			else if(CoronaSelect==3)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				IsolationWard IW= new IsolationWard();
				boolean IsolationSwitWhil=false;
				while(IsolationSwitWhil==false)
				{
					System.out.println("Press 1 For Symptom \nPress 2 For QuarantineDuration \nPress 3 For Food");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int SIW=input.nextInt();
				switch(SIW)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					IW.Symptom();
					boolean whileRIW=false;
					while(whileRIW==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RIW=input.nextInt();
					if(RIW==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRIW=true;
						IsolationSwitWhil=true;
					}
					else if(RIW==2)
					{
						WhileCorona=true;
						whileRIW=true;
						IsolationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					IW.QuarantineDuration();	
					boolean whileRCI=false;
					while(whileRCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCI=input.nextInt();
					if(RCI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCI=true;
						IsolationSwitWhil=true;
					}
					else if(RCI==2)
					{
						WhileCorona=true;
						whileRCI=true;
						IsolationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					IW.Food();
					boolean whileRCI=false;
					while(whileRCI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Corona Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RCI=input.nextInt();
					if(RCI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRCI=true;
						IsolationSwitWhil=true;
					}
					else if(RCI==2)
					{
						WhileCorona=true;
						whileRCI=true;
						IsolationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Wrong Key Please Try again");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
			}
			}
			else
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				WhileCorona=false;
			}
			}
			break;
		}
		case 5://Receptionist switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			Gernalreceptionist HGD = new Gernalreceptionist();
			System.out.println("Enter Your Password (Gernal Department)");
			int Password=input.nextInt();
			HGD.Login(Password);
			boolean WhileGernal=false;
			while(WhileGernal==false)
			{
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			int GernalSelect;
			System.out.println("\nPress 1 For Gernal Department Information");
			System.out.println("Press 2 For Gernal Receptionist");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			GernalSelect=input.nextInt();
			if(GernalSelect==1)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				boolean HGernalWhileSwitch=false;
				while(HGernalWhileSwitch==false)
				{
				System.out.println("\nPress 1 for Insert Hospital Information \nPress 2 for View Hospital Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HGI=input.nextInt();
		    	switch(HGI)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Enter Name of Gernal Department Head");
			    	String HName=input.next();
			    	System.out.println("Enter Block Number of Gernal Department");
			    	String BNumber=input.next();
			    	HGD.setHeadName(HName);
			    	HGD.setDeptBlockNumber(BNumber);
					HGD.insertNew();
					boolean whileHGI=false;
					while(whileHGI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HGDI=input.nextInt();
					if(HGDI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHGI=true;
						HGernalWhileSwitch=true;
					}
					else if(HGDI==2)
					{
						whileHGI=true;
						WhileGernal=true;
						HGernalWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
		    	}
		    	case 2:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HGD.Hview();
				System.out.println("\n\n\n\n");
				boolean whilHGV=false;
				while(whilHGV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVG=input.nextInt();
				if(SVG==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHGV=true;
					HGernalWhileSwitch=true;
				}
				else if(SVG==2)
				{
					WhileGernal=true;
					whilHGV=true;
					HGernalWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	default:
		    	{
		    		System.out.println("Try Again Wrong Key");
		    		System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HGernalWhileSwitch=false;
		    		break;
		    	}
		    	}
		    }
			}
			else if(GernalSelect==2)
			{
			    boolean RecpGernalSwitWhil=false;
			    while(RecpGernalSwitWhil==false)
			    {
			    	for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Doctors List");
				System.out.println("Press 2 For View   Doctors List");
				System.out.println("Press 3 For Search Doctors List");
				System.out.println("Press 4 For Delete Doctors List");
				System.out.println("Press 5 For Update Doctors List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepGernalSwitch=input.nextInt();
				switch(RecepGernalSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HGD.DoctorTimeTable();
					HGD.RGDinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileRGI=false;
					while(whileRGI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RGI=input.nextInt();
					if(RGI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRGI=true;
						RecpGernalSwitWhil=true;
					}
					else if(RGI==2)
					{
						WhileGernal=true;
						whileRGI=true;
						RecpGernalSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HGD.RGDview();
					System.out.println("\n\n\n\n");
					boolean whileRGV=false;
					while(whileRGV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RGV=input.nextInt();
					if(RGV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRGV=true;
						RecpGernalSwitWhil=true;
					}
					else if(RGV==2)
					{
						WhileGernal=true;
						whileRGV=true;
						RecpGernalSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					HGD.RGDSearch(FindID);
					System.out.println("\n\n\n\n");
					boolean whileRGS=false;
					while(whileRGS==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RGS=input.nextInt();
					if(RGS==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRGS=true;
						RecpGernalSwitWhil=true;
					}
					else if(RGS==2)
					{
						WhileGernal=true;
						whileRGS=true;
						RecpGernalSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					int Find=input.nextInt();
					HGD.RGDDelete(Find);
					boolean whileRGD=false;
					while(whileRGD==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RGD=input.nextInt();
					if(RGD==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRGD=true;
						RecpGernalSwitWhil=true;
					}
					else if(RGD==2)
					{
						WhileGernal=true;
						whileRGD=true;
						RecpGernalSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
				    for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					HGD.RGDUpdate(UFind);
					boolean whileRGU=false;
					while(whileRGU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int RGU=input.nextInt();
					if(RGU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileRGU=true;
						RecpGernalSwitWhil=true;
					}
					else if(RGU==2)
					{
						WhileGernal=true;
						whileRGU=true;
						RecpGernalSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					RecpGernalSwitWhil=false;
				}
				}
			    }
			}
			else
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				WhileGernal=false;
			}
			}
			break;
		}
		case 6://Receptionist switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			Operationreceptionist HOD = new Operationreceptionist();
			System.out.println("Enter Your Password (Operation Department)");
			int Password=input.nextInt();
			HOD.Login(Password);
			boolean WhileOperation=false;
			while(WhileOperation==false)
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			int OperationSelect;
			System.out.println("\nPress 1 For Operation Department Information");
			System.out.println("Press 2 For Operation Receptionist");
			System.out.println("Press Enter To Continue....");
			System.in.read();
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			OperationSelect=input.nextInt();
			if(OperationSelect==1)
			{
				boolean HOperationWhileSwitch=false;
				while(HOperationWhileSwitch==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("\nPress 1 for Insert Hospital Information \nPress 2 for View Hospital Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HOI=input.nextInt();
		    	switch(HOI)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Enter Name of Operation Department Head");
			    	String HName=input.next();
			    	System.out.println("Enter Block Number of Operation Department");
			    	String BNumber=input.next();
			    	HOD.setHeadName(HName);
			    	HOD.setDeptBlockNumber(BNumber);
					HOD.insertNew();
					boolean whileHOI=false;
					while(whileHOI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Operation Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HODI=input.nextInt();
					if(HODI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHOI=true;
						HOperationWhileSwitch=true;
					}
					else if(HODI==2)
					{
						whileHOI=true;
						WhileOperation=true;
						HOperationWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						} 
					}
					}
					break;
		    	}
		    	case 2:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HOD.Hview();
				System.out.println("\n\n\n\n");
				boolean whilHOV=false;
				while(whilHOV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Gernal Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVO=input.nextInt();
				if(SVO==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHOV=true;
					HOperationWhileSwitch=true;
				}
				else if(SVO==2)
				{
					WhileOperation=true;
					whilHOV=true;
					HOperationWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	default:
		    	{
		    		System.out.println("Try Again Wrong Key");
		    		System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HOperationWhileSwitch=false;
		    		break;
		    	}
		    	}
		    }
			}
			else if(OperationSelect==2)
			{
			    boolean RecpOperationSwitWhil=false;
			    while(RecpOperationSwitWhil==false)
			    {
			        for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Doctors List");
				System.out.println("Press 2 For View   Doctors List");
				System.out.println("Press 3 For Search Doctors List");
				System.out.println("Press 4 For Delete Doctors List");
				System.out.println("Press 5 For Update Doctors List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepOperationSwitch=input.nextInt();
				switch(RecepOperationSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HOD.DoctorTimeTable();
					HOD.ROinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileROI=false;
					while(whileROI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Operation Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int ROI=input.nextInt();
					if(ROI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileROI=true;
						RecpOperationSwitWhil=true;
					}
					else if(ROI==2)
					{
						WhileOperation=true;
						whileROI=true;
						RecpOperationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HOD.ROview();
					
					System.out.println("\n\n\n\n");
					boolean whileROV=false;
					while(whileROV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Operation Menu & Press 2 For Main menu");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					int ROV=input.nextInt();
					if(ROV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileROV=true;
						RecpOperationSwitWhil=true;
					}
					else if(ROV==2)
					{
						WhileOperation=true;
						whileROV=true;
						RecpOperationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					HOD.ROSearch(FindID);
					System.out.println("\n\n\n\n");
					boolean whileROS=false;
					while(whileROS==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Operation Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int ROS=input.nextInt();
					if(ROS==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileROS=true;
						RecpOperationSwitWhil=true;
					}
					else if(ROS==2)
					{
						WhileOperation=true;
						whileROS=true;
						RecpOperationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					
					int Find=input.nextInt();
					HOD.RODelete(Find);
					boolean whileROD=false;
					while(whileROD==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Operation Menu & Press 2 For Main menu");
					int ROD=input.nextInt();
					if(ROD==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileROD=true;
						RecpOperationSwitWhil=true;
					}
					else if(ROD==2)
					{
						WhileOperation=true;
						whileROD=true;
						RecpOperationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					HOD.ROUpdate(UFind);
					boolean whileROU=false;
					while(whileROU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Operation Menu & Press 2 For Main menu");
					for(int i=0; i<=14 ; i++)
					{
						System.out.println();
					}
					int ROU=input.nextInt();
					if(ROU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileROU=true;
						RecpOperationSwitWhil=true;
					}
					else if(ROU==2)
					{
						WhileOperation=true;
						whileROU=true;
						RecpOperationSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					RecpOperationSwitWhil=false;
				}
				}
			    }
			}
			else
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}WhileOperation=false;
			}
			}
			break;
		}
		case 7://Receptionist switch
		{
			REPSwitch=true;
			Rooms HOD = new Rooms();
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}	
			System.out.println("Enter Your Password");
				int Password=input.nextInt();
				HOD.LoginReceptionists(Password);
				boolean HRoomsWhileSwitch=false;
				while(HRoomsWhileSwitch==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("\nPress 1 for Insert Rooms Information \nPress 2 for View Hospital Rooms Information");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HRI=input.nextInt();
		    	switch(HRI)
		    	{
		    	case 1:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		System.out.println("Total Local Room in Hospital ");
		    		String LRoom=input.next();
		    		System.out.println("Total VIP Rooms in Hospital ");
		    		String VRoom=input.next();
		    		System.out.println("Total ICU in Hospital ");
		    		String IRoom=input.next();
		    		Rooms.setTotalLocalRooms(LRoom);
		    		Rooms.setTotalVIPRooms(VRoom);
		    		Rooms.setTotalICU(IRoom);
			    	HOD.insertNew();
					boolean whileHOI=false;
					while(whileHOI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Rooms Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HODI=input.nextInt();
					if(HODI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHOI=true;
					}
					else if(HODI==2)
					{
						whileHOI=true;
						HRoomsWhileSwitch=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
		    	}
		    	case 2:
		    	{
		    		for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HOD.view();
				    
		    		System.out.println("\n\n\n\n");
				boolean whilHOV=false;
				while(whilHOV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Rooms Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int SVO=input.nextInt();
				if(SVO==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whilHOV=true;
				}
				else if(SVO==2)
				{
					whilHOV=true;
					HRoomsWhileSwitch=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
		    	}
		    	default:
		    	{
		    		System.out.println("Try Again Wrong Key");
		    		System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
		    		HRoomsWhileSwitch=false;
		    		break;
		    	}
		    	}		
		}
				break;
		}
		
		case 8://Receptionist switch
		{
			REPSwitch=true;
			HospitalDoctors HD=new HospitalDoctors();
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			System.out.println("Welcome Receptionists Please Enter Your Password");
			int Password=input.nextInt();
		    HD.LoginReceptionists(Password);
			boolean RecpHDOSwitWhil=false;
		    while(RecpHDOSwitWhil==false)
		    {
		    	System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			System.out.println("Press 1 For Add    Hospital Doctors List");
			System.out.println("Press 2 For View   Hospital Doctors List");
			System.out.println("Press 3 For Search Hospital Doctors List");
			System.out.println("Press 4 For Delete Hospital Doctors List");
			System.out.println("Press 5 For Update Hospital Doctors List");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHDOSwitch=input.nextInt();
			switch(RecepHDOSwitch)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				HD.ADDoctor();
				HD.HDinsertNew();
				System.out.println("\n\n\n\n");
				boolean whileHDI=false;
				while(whileHDI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Doctor Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HDI=input.nextInt();
				if(HDI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHDI=true;
				}
				else if(HDI==2)
				{
					whileHDI=true;
					RecpHDOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				HD.HDview();
				System.out.println("\n\n\n\n");
				boolean whileHDV=false;
				while(whileHDV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Doctor Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HDV=input.nextInt();
				if(HDV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHDV=true;
				}
				else if(HDV==2)
				{
					whileHDV=true;
					RecpHDOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Find Doctor");
				int FindID=input.nextInt();
				HD.HDSearch(FindID);
				System.out.println("\n\n\n\n");
				boolean whileHDS=false;
				while(whileHDS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Doctors Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HDS=input.nextInt();
				if(HDS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHDS=true;
				}
				else if(HDS==2)
				{
					whileHDS=true;
					RecpHDOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Delete Doctor ID");
				int Find=input.nextInt();
				HD.HDDelete(Find);
				boolean whileHDD=false;
				while(whileHDD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Doctor Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HDD=input.nextInt();
				if(HDD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHDD=true;
				}
				else if(HDD==2)
				{
					whileHDD=true;
					RecpHDOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Update Doctor ID");
				int UFind=input.nextInt();
				HD.HDUpdate(UFind);
				boolean whileHDU=false;
				while(whileHDU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Doctors Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HDU=input.nextInt();
				if(HDU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHDU=true;
				}
				else if(HDU==2)
				{
					whileHDU=true;
					RecpHDOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				RecpHDOSwitWhil=false;
			}
			}
		    }
			break;
		}
		case 9://Receptionist switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			HospitalNurses HN=new HospitalNurses();
			System.out.println("Welcome Receptionists Please Enter Your Password");
			int Password=input.nextInt();
			HN.LoginReceptionists(Password);
			boolean RecpHNOSwitWhil=false;
			    while(RecpHNOSwitWhil==false)
			    {
			    	System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Add    Hospital Nurses List");
				System.out.println("Press 2 For View   Hospital Nurses List");
				System.out.println("Press 3 For Search Hospital Nurses List");
				System.out.println("Press 4 For Delete Hospital Nurses List");
				System.out.println("Press 5 For Update Hospital Nurses List");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RecepHNOSwitch=input.nextInt();
				switch(RecepHNOSwitch)
				{
				case 1:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HN.ADNurses();
					HN.NinsertNew();
					System.out.println("\n\n\n\n");
					boolean whileHNI=false;
					while(whileHNI==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Hospital Nurses Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HNI=input.nextInt();
					if(HNI==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHNI=true;
					}
					else if(HNI==2)
					{
						whileHNI=true;
						RecpHNOSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 2:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					HN.Nview();
					System.out.println("\n\n\n\n");
					boolean whileHNV=false;
					while(whileHNV==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Hospital Nurses Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HNV=input.nextInt();
					if(HNV==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHNV=true;
					}
					else if(HNV==2)
					{
						whileHNV=true;
						RecpHNOSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 3:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Find Doctor");
					int FindID=input.nextInt();
					HN.NSearch(FindID);
					System.out.println("\n\n\n\n");
					boolean whileHNS=false;
					while(whileHNS==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Hospital Nurses Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HNS=input.nextInt();
					if(HNS==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHNS=true;
					}
					else if(HNS==2)
					{
						whileHNS=true;
						RecpHNOSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
				}
				break;
				}
				case 4:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Delete Doctor ID");
					int Find=input.nextInt();
					HN.NDelete(Find);
					boolean whileHND=false;
					while(whileHND==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Hospital Nurses Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HND=input.nextInt();
					if(HND==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHND=true;
					}
					else if(HND==2)
					{
						whileHND=true;
						RecpHNOSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				case 5:
				{
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					System.out.println("Update Doctor ID");
					int UFind=input.nextInt();
					HN.NUpdate(UFind);
					boolean whileHNU=false;
					while(whileHNU==false)
					{
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					System.out.println("Press 1 For Hospital Nurses Menu & Press 2 For Main menu");
					for(int i=0; i<=15 ; i++)
					{
						System.out.println();
					}
					int HNU=input.nextInt();
					if(HNU==1)
					{
						TimeUnit.SECONDS.sleep(0);
						whileHNU=true;
					}
					else if(HNU==2)
					{
						whileHNU=true;
						RecpHNOSwitWhil=true;
					}
					else
					{
						System.out.println("\n\n\n\n");
						System.out.println("Press Right Key");
						System.out.println("Press Enter To Continue....");
						System.in.read();
						for(int i=0; i<=40 ; i++)
						{
							System.out.println();
						}
					}
					}
					break;
				}
				default:
				{
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
					RecpHNOSwitWhil=false;
				}
				}
			    }
			break;
		}
		case 10://Receptionist switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			HospitalWorkers HW=new HospitalWorkers();
			System.out.println("Welcome Receptionists Please Enter Your Password");
			int Password=input.nextInt();
			HW.LoginReceptionists(Password);
			boolean RecpHWOSwitWhil=false;
		    while(RecpHWOSwitWhil==false)
		    {
		    	System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			System.out.println("Press 1 For Add    Hospital Workers List");
			System.out.println("Press 2 For View   Hospital Workers List");
			System.out.println("Press 3 For Search Hospital Workers List");
			System.out.println("Press 4 For Delete Hospital Workers List");
			System.out.println("Press 5 For Update Hospital Workers List");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHWOSwitch=input.nextInt();
			switch(RecepHWOSwitch)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				HW.ADWorkers();
				HW.WinsertNew();
				System.out.println("\n\n\n\n");
				boolean whileHWI=false;
				while(whileHWI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Workers Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HWI=input.nextInt();
				if(HWI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHWI=true;
				}
				else if(HWI==2)
				{
					whileHWI=true;
					RecpHWOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				HW.Wview();
				System.out.println("\n\n\n\n");
				boolean whileHWV=false;
				while(whileHWV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}	
				System.out.println("Press 1 For Hospital Workers Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HWV=input.nextInt();
				if(HWV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHWV=true;
				}
				else if(HWV==2)
				{
					whileHWV=true;
					RecpHWOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Find Doctor");
				int FindID=input.nextInt();
				HW.WSearch(FindID);
				System.out.println("\n\n\n\n");
				boolean whileHWS=false;
				while(whileHWS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Workers Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HWS=input.nextInt();
				if(HWS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHWS=true;
				}
				else if(HWS==2)
				{
					whileHWS=true;
					RecpHWOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Delete Doctor ID");
				int Find=input.nextInt();
				HW.WDelete(Find);
				boolean whileHWD=false;
				while(whileHWD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Workers Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HWD=input.nextInt();
				if(HWD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHWD=true;
				}
				else if(HWD==2)
				{
					whileHWD=true;
					RecpHWOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Update Doctor ID");
				int UFind=input.nextInt();
				HW.WUpdate(UFind);
				boolean whileHWU=false;
				while(whileHWU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Workers Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HWU=input.nextInt();
				if(HWU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHWU=true;
				}
				else if(HWU==2)
				{
					whileHWU=true;
					RecpHWOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				RecpHWOSwitWhil=false;
			}
			}
		    }
			break;
		}
		case 11://Receptionist switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=true;
			UtilityBill HU=new UtilityBill();
			System.out.println("Welcome Receptionists Please Enter Your Password");
			int Password=input.nextInt();
			HU.LoginReceptionists(Password);
			boolean RecpHUOSwitWhil=false;
		    while(RecpHUOSwitWhil==false)
		    {
		    	System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			System.out.println("Press 1 For Add    Hospital Utility BillS");
			System.out.println("Press 2 For View   Hospital Utility BillS");
			System.out.println("Press 3 For Search Hospital Utility BillS");
			System.out.println("Press 4 For Delete Hospital Utility BillS");
			System.out.println("Press 5 For Update Hospital Utility BillS");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHWOSwitch=input.nextInt();
			switch(RecepHWOSwitch)
			{
			case 1:
			{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
				String year;
				String month;
				String day;
				String amount;
				String BillName;
				System.out.println("Enter Bill Name");
		    	BillName=input.next();
		    	System.out.println("Enter Total Amount");
		    	amount=input.next();
		    	System.out.println("Enter Day ");
		    	day=input.next();
		    	System.out.println("Enter Month ");
		    	month=input.next();
		    	System.out.println("Enter Year ");
		    	year=input.next();
		    	HU.setBillName(BillName);
		    	HU.setAmount(amount);
		    	HU.setYear(year);
		    	HU.setMonth(month);
		    	HU.setDay(day);
				HU.Uinsert();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Utility Bills Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					RecpHUOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				HU.UView();
				System.out.println("\n\n\n\n");
				boolean whileHUV=false;
				while(whileHUV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Utility Bills Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUV=input.nextInt();
				if(HUV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUV=true;
				}
				else if(HUV==2)
				{
					whileHUV=true;
					RecpHUOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Year To Find");
				int FindID=input.nextInt();
				HU.USearch(FindID);
				System.out.println("\n\n\n\n");
				boolean whileHUS=false;
				while(whileHUS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Utility Bills Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUS=input.nextInt();
				if(HUS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUS=true;
				}
				else if(HUS==2)
				{
					whileHUS=true;
					RecpHUOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Delete Doctor ID");
				int Find=input.nextInt();
				HU.UDelete(Find);
				boolean whileHUD=false;
				while(whileHUD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Utility Bills Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUD=input.nextInt();
				if(HUD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUD=true;
				}
				else if(HUD==2)
				{
					whileHUD=true;
					RecpHUOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Update Doctor ID");
				int UFind=input.nextInt();
				HU.Uupdate(UFind);
				boolean whileHUU=false;
				while(whileHUU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Utility Bills Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUU=input.nextInt();
				if(HUU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUU=true;
				}
				else if(HUU==2)
				{
					whileHUU=true;
					RecpHUOSwitWhil=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				RecpHUOSwitWhil=false;
			}
			}
		    }
			break;
		}
		default:
		{
			System.out.println("Press Right Key");
			System.out.println("Press Enter To Continue....");
			System.in.read();
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			REPSwitch=false;
		}
		}
         break;
		}
		break;
}
		case 4://Main Switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			NoticeBoard NTD=new NoticeBoard();
			boolean NoticWhile=false;
			while(NoticWhile==false)
			{
			System.out.println("Press 1 For Set Notice Board \nPress 2 For View Notice Board");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int ND=input.nextInt();
			switch(ND)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Your Meassage!");
				String Message=input.nextLine();
				Message=input.nextLine();
				NTD.SetNoticeBoard(Message);
				NTD.InsertNew();
				boolean whileRGU=false;
				while(whileRGU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Notice Board Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RGU=input.nextInt();
				if(RGU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileRGU=true;
				}
				else if(RGU==2)
				{
					whileRGU=true;
					NoticWhile=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.print("Your Notice Board Message is = " );
				 NTD.View();
				boolean whileRGU=false;
				while(whileRGU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("\nPress 1 For Notice Board Menu & Press 2 For Main menu\n");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int RGU=input.nextInt();
				if(RGU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileRGU=true;
				}
				else if(RGU==2)
				{
					whileRGU=true;
					whileRGU=true;
					NoticWhile=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Wrong Key Try Again");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			}
			}
			}
			break;
		}
		case 5://Main Switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			DNWPay TP=new DNWPay();
			TP.DisplayManager();
			System.out.println("Dear Please Enter Your Password");
			int Password=input.nextInt();
			TP.LoginReceptionists(Password);
			boolean whilPay=false;
			while(whilPay==false)
			{
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
			System.out.println("Press 1 For Total Doctors     PAY");
			System.out.println("Press 2 For Total Nurses      PAY");
			System.out.println("Press 3 For Total Workers     PAY");
			System.out.println("Press 4 For Total Grand Total PAY");
			System.out.println("Press 5 For Send  PAY         PAY");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHWOSwitch=input.nextInt();
			switch(RecepHWOSwitch)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				TP.DoctorPay();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Total Pay Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				TP.NursePay();
				System.out.println("\n\n\n\n");
				boolean whileHUV=false;
				while(whileHUV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Total Pay Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUV=input.nextInt();
				if(HUV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUV=true;
				}
				else if(HUV==2)
				{
					whileHUV=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				TP.WorkerPay();
				System.out.println("\n\n\n\n");
				boolean whileHUS=false;
				while(whileHUS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Total Pay Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUS=input.nextInt();
				if(HUS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUS=true;
				}
				else if(HUS==2)
				{
					whileHUS=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				TP.GrandTotal();
				boolean whileHUD=false;
				while(whileHUD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Total Pay Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUD=input.nextInt();
				if(HUD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUD=true;
				}
				else if(HUD==2)
				{
					whileHUD=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				TP.Bank();
				boolean whileHUU=false;
				while(whileHUU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Total Pay Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUU=input.nextInt();
				if(HUU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUU=true;
				}
				else if(HUU==2)
				{
					whileHUU=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				whilPay=false;
				break;
			}
			}
		}
			break;
		}
		case 6://Main Switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			Patients PT=new Patients();
			boolean whilPay=false;
			while(whilPay==false)
			{
				
			System.out.println("Press 1 For DisCharge Patient     ");
			System.out.println("Press 2 For ADD       Patient     ");
			System.out.println("Press 3 For View      Patients    ");
			System.out.println("Press 4 For Search    Patient     ");
			System.out.println("Press 5 For Delete    Patient     ");
			System.out.println("Press 6 For Update    Patient     ");
			System.out.println("Press 7 For Pathology Test        ");
			System.out.println("Press 8 For Pharmacy  (Medicine)  ");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHWOSwitch=input.nextInt();
			switch(RecepHWOSwitch)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PT.Discharge();
				System.out.println("\n\n\n\n");
				boolean whileHUV=false;
				while(whileHUV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUV=input.nextInt();
				if(HUV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUV=true;
				}
				else if(HUV==2)
				{
					whileHUV=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PT.PatientADD();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PT.UView();
				System.out.println("\n\n\n\n");
				boolean whileHUV=false;
				while(whileHUV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUV=input.nextInt();
				if(HUV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUV=true;
				}
				else if(HUV==2)
				{
					whileHUV=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter Patient Token ID");
				int Find=input.nextInt();
				PT.Search(Find);
				System.out.println("\n\n\n\n");
				boolean whileHUS=false;
				while(whileHUS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUS=input.nextInt();
				if(HUS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUS=true;
				}
				else if(HUS==2)
				{
					whileHUS=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter Patient Token ID");
				int Find=input.nextInt();
				PT.Delete(Find);
				boolean whileHUD=false;
				while(whileHUD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUD=input.nextInt();
				if(HUD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUD=true;
				}
				else if(HUD==2)
				{
					whileHUD=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 6:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter Patient Token ID");
				int Find=input.nextInt();
				PT.update(Find);
				boolean whileHUU=false;
				while(whileHUU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUU=input.nextInt();
				if(HUU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUU=true;
				}
				else if(HUU==2)
				{
					whileHUU=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 7:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PathologyLab PL=new PathologyLab();
				System.out.println("Enter Token Number");
		    	String tokenID=input.next();
		    	System.out.println("Enter Patient Name");
		    	String patientName=input.next();
		    	System.out.println("Enter Test Name");
		    	String testName=input.next();
		    	PL.setTokenID(tokenID);
		    	PL.setPatientName(patientName);
		    	PL.setTestName(testName);
		    	PL.Uinsert();
		    	PL.LabPament();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 8:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				Pharmacy PY=new Pharmacy();
				PY.MedicineBuy();
				PY.MedicineBuy2();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Patient Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				whilPay=false;
				break;
			}
			}
		}
			break;
		}
		case 7://Main Switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			PathologyLab LB=new PathologyLab();
			LB.DisplayManager();
			System.out.println("Dear Please Enter Your Password");
			int Password=input.nextInt();
			LB.LoginReceptionists(Password);
			boolean whilPay=false;
			while(whilPay==false)
			{
			System.out.println("Press 1 For ADD    LAB Test  ");
			System.out.println("Press 2 For View   LAB Test  ");
			System.out.println("Press 3 For Search LAB Test  ");
			System.out.println("Press 4 For Delete LAB Test  ");
			System.out.println("Press 5 For Update LAB Test  ");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHWOSwitch=input.nextInt();
			switch(RecepHWOSwitch)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Enter Token Number");
		    	String tokenID=input.next();
		    	System.out.println("Enter Patient Name");
		    	String patientName=input.next();
		    	System.out.println("Enter Test Name");
		    	String testName=input.next();
		    	LB.setTokenID(tokenID);
		    	LB.setPatientName(patientName);
		    	LB.setTestName(testName);
		    	LB.Uinsert();
		    	LB.LabPament();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital LAB Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				LB.UView();
				System.out.println("\n\n\n\n");
				boolean whileHUV=false;
				while(whileHUV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital LAB Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUV=input.nextInt();
				if(HUV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUV=true;
				}
				else if(HUV==2)
				{
					whileHUV=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter LAB Test ID");
				int Find=input.nextInt();
				LB.USearch(Find);
				System.out.println("\n\n\n\n");
				boolean whileHUS=false;
				while(whileHUS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital LAB Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUS=input.nextInt();
				if(HUS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUS=true;
				}
				else if(HUS==2)
				{
					whileHUS=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter LAB Test ID");
				int Find=input.nextInt();
				LB.UDelete(Find);
				boolean whileHUD=false;
				while(whileHUD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital LAB Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUD=input.nextInt();
				if(HUD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUD=true;
				}
				else if(HUD==2)
				{
					whileHUD=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter LAB Test ID");
				int Find=input.nextInt();
				LB.Uupdate(Find);
				boolean whileHUU=false;
				while(whileHUU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital LAB Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUU=input.nextInt();
				if(HUU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUU=true;
				}
				else if(HUU==2)
				{
					whileHUU=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				whilPay=false;
				break;
			}
			}
		}
			break;
		}
		case 8:// Main Switch
		{
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			Pharmacy PM=new Pharmacy();
			PM.DisplayManager();
			System.out.println("Dear Please Enter Your Password");
			int Password=input.nextInt();
			PM.LoginReceptionists(Password);
			boolean whilPay=false;
			while(whilPay==false)
			{
			System.out.println("Press 1 For ADD    Medicines  ");
			System.out.println("Press 2 For View   Medicines  ");
			System.out.println("Press 3 For Search Medicines  ");
			System.out.println("Press 4 For Delete Medicines  ");
			System.out.println("Press 5 For Update Medicines  ");
			System.out.println("Press 6 For Buy    Medicines  ");
			for(int i=0; i<=15 ; i++)
			{
				System.out.println();
			}
			int RecepHWOSwitch=input.nextInt();
			switch(RecepHWOSwitch)
			{
			case 1:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PM.SGPharmacy();
				PM.PinsertNew();
				System.out.println("\n\n\n\n");
				boolean whileHUI=false;
				while(whileHUI==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Pharmacy Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUI=input.nextInt();
				if(HUI==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUI=true;
				}
				else if(HUI==2)
				{
					whileHUI=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 2:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PM.Pview();
				System.out.println("\n\n\n\n");
				boolean whileHUV=false;
				while(whileHUV==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Pharmacy Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUV=input.nextInt();
				if(HUV==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUV=true;
				}
				else if(HUV==2)
				{
					whileHUV=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 3:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Medicine ID");
				int Find=input.nextInt();
				PM.MedicineSearch(Find);
				System.out.println("\n\n\n\n");
				boolean whileHUS=false;
				while(whileHUS==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Pharmacy Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUS=input.nextInt();
				if(HUS==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUS=true;
				}
				else if(HUS==2)
				{
					whileHUS=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
			}
			break;
			}
			case 4:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter Medicine ID");
				int Find=input.nextInt();
				PM.MedicineDelete(Find);
				boolean whileHUD=false;
				while(whileHUD==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Pharmacy Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUD=input.nextInt();
				if(HUD==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUD=true;
				}
				else if(HUD==2)
				{
					whileHUD=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 5:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				System.out.println("Please Enter Medicine ID");
				int Find=input.nextInt();
				PM.MedicineUpdate(Find);
				boolean whileHUU=false;
				while(whileHUU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Pharmacy Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUU=input.nextInt();
				if(HUU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUU=true;
				}
				else if(HUU==2)
				{
					whileHUU=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			case 6:
			{
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				PM.MedicineBuy();
				PM.MedicineBuy2();
				boolean whileHUU=false;
				while(whileHUU==false)
				{
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				System.out.println("Press 1 For Hospital Pharmacy Menu & Press 2 For Main menu");
				for(int i=0; i<=15 ; i++)
				{
					System.out.println();
				}
				int HUU=input.nextInt();
				if(HUU==1)
				{
					TimeUnit.SECONDS.sleep(0);
					whileHUU=true;
				}
				else if(HUU==2)
				{
					whileHUU=true;
					whilPay=true;
				}
				else
				{
					System.out.println("\n\n\n\n");
					System.out.println("Press Right Key");
					System.out.println("Press Enter To Continue....");
					System.in.read();
					for(int i=0; i<=40 ; i++)
					{
						System.out.println();
					}
				}
				}
				break;
			}
			default:
			{
				System.out.println("Press Right Key");
				System.out.println("Press Enter To Continue....");
				System.in.read();
				for(int i=0; i<=40 ; i++)
				{
					System.out.println();
				}
				whilPay=false;
				break;
			}
			}
		}
			break;
		}
		case 9:
		{
			Ex.main(args);
			HStart=true;
			break;
		}
		default:
		{
			System.out.println("Wrong Key Please Try Again");
			System.out.println("Press Enter To Continue....");
			System.in.read();
			for(int i=0; i<=40 ; i++)
			{
				System.out.println();
			}
			HStart=false;
		}
}
}
}
		else 
		{
			Ex.main(args);
		}
	}
	
	}	