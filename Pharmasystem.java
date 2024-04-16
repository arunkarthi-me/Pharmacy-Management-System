//PHARMACY MANAGEMENT SYSTEM
import java.util.*;
class Pharmasystem                                  //CLASS 1
{
 void user()                                       //User Login Function
 {
	 Scanner sc=new Scanner(System.in);
	 int choice;
	 String username="";
	 int userage;
	 int userid;
	 int usercontact;
	 System.out.print("\n\t\t\t\t\t<<<<< USER LOG-IN >>>>>");
	 System.out.print("\n\t\tEnter 	User Name : ");
	 username=sc.next();
	 System.out.print("\n\t\tEnter ID : ");
	 userid=sc.nextInt();
	 System.out.print("\n\t\tEnter the Age : ");
	 userage=sc.nextInt();
	 System.out.print("\n\t\tEnter the Contact No : ");
	 usercontact=sc.nextInt();
	 System.out.print("\n\t\t\t\tUSER LOGGED IN SUCCESSFULLY ");
 }
}
 class admin extends pharmasystem                       //CLASS 2
{
 void admin()
 {
	 Scanner sc=new Scanner(System.in);
	 int choice,adminage,adminid;
	 String adpass=" ";
	 System.out.print("\n\t\t\t\t\t<<<<< ADMIN LOG-IN >>>>>");
	 System.out.print("\n\t\tAdmin ID : ");
	 adminid=sc.nextInt();
	 System.out.print("\n\t\tAdmin Password : ");
	 adpass=sc.next();
	 System.out.print("\n\t\t\t LOGGED IN SUCCESSFULLY \n"); 
 }
 void company1()                                       //Company1  Function
 {
	 System.out.print("\n\tCOMPANY NAME        COMPANY ID         COMPANY PASSCODE");
	 System.out.print("\n\n\tPfizer \t\t   => 56089 \t\t => pfizer@pms");
	 System.out.print("\n\tJohnson &Johnson   => 98065 \t\t => johnson#123 ");
	 System.out.print("\n\tGSK \t\t   => 56098 \t\t => gsk@glaxoSmithKline ");
	 System.out.print("\n\tAmgen \t\t   => 56090 \t\t => negmaforpms1 ");
	 System.out.print("\n\tBoston \t\t   => 09065 \t\t => bostonscienticfic0 ");
	 System.out.print("\n\tMerck Group \t   => 43903 \t\t => merckgroup@peek ");
	 System.out.print("\n\tBiogen \t\t   => 30934 \t\t => biogen@007 ");
	 System.out.print("\n\tAbbott \t\t   => 79830 \t\t => abbotttheabbott \n\n");
 }
 void medinstock()                                             //medicine in stock function
 {
	 System.out.print("\n\t\t------ MEDICINES IN STOCK -------");
	 System.out.print("\n\tProbiotics");
	 System.out.print("\n\tPenicillin");
	 System.out.print("\n\tAcid Free C(500mg)");
	 System.out.print("\n\tWomen'S Multivate");
	 System.out.print("\n\tMarino Tablet ");
	 System.out.print("\n\tJavac jaMaxi Cal Tablet ");
	 System.out.print("\n\tAmino Zinc Tablet ");
	 System.out.print("\n\tBurnex ");
	 System.out.print("\n\tFabuloss 5 ");
	 System.out.print("\n\tRoyal Propollen ");
 }
}
 class  bill extends admin                                            //CLASS 3
 {
 		void bill()                                                   //Bill Function
 		{
			Scanner sc=new Scanner(System.in);
 			System.out.print("\n\t\t\t\t\t--------< BILLING >---------\n");
 			int price,orderno;
			System.out.print("\t\t**************************************************************************\n");
			System.out.print("\t\tDRUGS ID   DRUGS TYPE  \t\tDRUGS NAME  \t\tDRUGS PRICE(Rs)\n");
			System.out.print("\t\t**************************************************************************\n");
            System.out.print("\t\t0001 \t OTC    \tProbiotics			Rs 2.00\n");
			System.out.print("\t\t0002 \t OTC    \tPenicillin			Rs 2.00\n");
            System.out.print("\t\t0003 \t OTC    \tAcid Free C(500mg)	\tRs 1.00\n");
            System.out.print("\t\t0004 \t OTC    \tWomen'S Multivate	\tRs 4.00\n");
            System.out.print("\t\t0005 \t OTC    \tMarino Tablet	 	\tRs 1.00\n");
            System.out.print("\t\t0006 \t OTC    \tJavac jaMaxi Cal Tablet	    \tRM 5.00\n");
            System.out.print("\t\t0007 \t OTC    \tAmino Zinc Tablet	\tRs 7.00\n");
            System.out.print("\t\t0008 \t OTC    \tBurnex				Rs 4.00\n");
            System.out.print("\t\t0009 \t OTC    \tFabuloss 5			Rs 3.00\n");
            System.out.print("\t\t0010 \t OTC    \tRoyal Propollen	    \t\tRs 5.00\n");
			System.out.print("\n\t\tType Order Number : ");
			orderno=sc.nextInt();
			int medi,quantity;
			System.out.print("\n\t\tMedicine CODE : ");
			medi=sc.nextInt();
			switch(medi)
			{
				case 1:
				System.out.print("\t\tProbiotics");
				break;
				case 2:
				System.out.print("\t\tPenicillin");
				break;
				case 3:
				System.out.print("\t\tAcid Free C(500mg)");
				break;
				case 4:
				System.out.print("\t\tWomen'S Multivate");
				break;
				case 5:
				System.out.print("\t\tMarino Tablet");
				break;
				case 6:
				System.out.print("\t\tJavac jaMaxi Cal Tablet");
				break;
				case 7:
				System.out.print("\t\tAmino Zinc Tablet");
				break;
				case 8:
				System.out.print("\t\tBurnex");
				break;
				case 9:
				System.out.print("\t\tFabuloss 5");
				break;
				case 10:
				System.out.print("\t\tRoyal Propollen");
				break;
				default:
				System.out.print("\t\t OUT OF STOCKS");
				break;
			}
			System.out.print("\n\t\tMedicine PRICE : ");
			price=sc.nextInt();
			System.out.print("\n\t\tEnter Quantity : ");
			quantity=sc.nextInt();
	if(orderno<1000)
	{
		System.out.print("\n\n\t\t\tORDER PLACED SUCCESSFULLY\n");
	}                                                                         //Receipt and Billing
	Scanner C=new Scanner(System.in);
	System.out.print("\n\t===============================================================================");
	System.out.print("\n\n\t\t\t<<<  RECEIPT AND PAYMENTS >>>");
	int receipt,amount;
	String med="TABLET";
	System.out.print("\n\n\t\tEnter the Receipt Number: ");
	receipt=C.nextInt();
	if(receipt==orderno)
	{
	System.out.print("\n\t===============================================================================");
	System.out.print("\n\t|  Medicine Type |     Medicine CODE    |  	Quantity     |    Total Price |");
	System.out.print("\n\t==============================================================================\n");
	System.out.print("\n\t"+med);System.out.print("\t\t\t"+medi);  System.out.print("\t\t\t"+quantity);System.out.print("\t\t"+(price*quantity));
	System.out.print("\n\n\tTotal BILL is Rs."+(price*quantity));
	System.out.print("\n\n\tType Exact Amount you need to pay: ");
	amount=C.nextInt();
	System.out.print("\n\t\t\tPAYMENT DONE!  THANK YOU\n");
	}
	else
	{
		System.out.print("\n\t\t\tThere is no Order List");
	}
 }
 }
 class company extends bill                                      //CLASS 4
 {
	 void company()                                             //Company login function
	 {
		 Scanner S=new Scanner(System.in);
		 int coid,cophone;
		 String coname="";
		 String coaddr="";
		 String guide="";
		 System.out.print("\n\t\t\t<<<<<< COMPANY LOGIN >>>>>>");
		 System.out.print("\n\n\t Company Name :");
		 coname=S.next();
		 System.out.print("\n\t Company ID :");
		 coid=S.nextInt();
		 System.out.print("\n\t Company Contact :");
		 cophone=S.nextInt();
		 System.out.print("\n\t Company Address :");
		 coaddr=S.next();
		 System.out.print("\n\n\t\tThis guidance is recommended as a set of professional goals to be met in the interest of \nthe patients and other key stakeholders in the pharmaceuticalsector. \nResponsibility moving the project forward will rest with eachnational pharmacy professional association");
		System.out.print("\n\nDo You Accepting our Guidelines? : ");
		guide=S.next();
		System.out.print("\n\t\t\tCompany has Successfully Registered !");
	 }
 }
 class main 
{
public static void main(String args[])                                  //Main Function
{
	Scanner c=new Scanner(System.in);
	System.out.print("\n\t\t**********  WELCOME TO PHARMACY MANAGEMENT SYSTEM  **********\n");
	System.out.print("\n\t\t\t========================================");
	System.out.print("\n\t\t\t|\t 1 => NEW USER SIGN IN          |");
	System.out.print("\n\n\t\t\t|\t 2 => ADMIN LOGIN               |");
	System.out.print("\n\n\t\t\t|\t 3 => NEW ORDER & BILL PAYMENTS |");
	System.out.print("\n\n\t\t\t|\t 4 => COMPANY SIGN IN           |");
	System.out.print("\n\t\t\t========================================");
	int passcode=007,pvalue;
	System.out.print("\n\n\t\t\tEnter the Passcode: ");
	pvalue=c.nextInt();
	if(pvalue==passcode)
	{
	int choice;
	System.out.print("\nEnter the Choice: ");
	choice=c.nextInt();
	if(choice==1)
	{
	pharmasystem u1= new pharmasystem();
	u1.user();
	}
	else if(choice==2)
	{
	    admin a1=new admin();
	    a1.admin();
		a1.company1();
		a1.medinstock();
	}
	else if(choice==3)
	{
		bill b1=new bill();
	    b1.bill();
	}
	else if(choice==4)
	{
		company c1=new company();
		c1.company();
    }
	else
	{
		System.out.print("\n\t\t\tINVALID CHOICE");
	}
	}
	else{
		System.out.print("\n\t\t\tWrong Passcode !");
	}
}
}
