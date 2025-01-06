package maccess;
import test.*;
import java.util.*;
public class BankMainClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		label:  //Label (pqr): pqr is a label attached to the while loop. Labels in Java are identifiers followed by a colon (:) and can be placed before loops or blocks. They are used to specify the target loop or block for certain control flow statements like break or continue.
			while(true)
			{
				System.out.println("Enter the piNo:");
				int piNo=sc.nextInt();
				if(piNo>=1111 && piNo<=9999)
				{
					CheckPinNo ch=new CheckPinNo();
					boolean k=ch.verify(piNo);
					if(k)
					{
						System.out.println("====Choice===");
						System.out.println("1.WithDraw\n2.Deposit");
						System.out.println("Enter the Choice:");
						switch(sc.nextInt()) {
						case 1:
							System.out.println("Enter amount :");
							int a1=sc.nextInt();
							if(a1>0 && a1%100==0) {
								WithDraw wd=new WithDraw();
								wd.process(a1);
							}
							else
							{
								System.out.println("Invalid amount :");
							}
							break label;//stop loop
						case 2:
							System.out.println("Enter amount :");
							int a2=sc.nextInt();
							if(a2>0 && a2%100==0) {
								Deposit dp=new Deposit();
								dp.process(a2);
								
							}
							else
							{
								System.out.println("Invalid amount :");
							}
							break label;//stop loop
						}
						
					}
					else {
						System.out.println("Wrong pin :");
						count++;
					}
				}
				else {
					System.out.println("Invalid Nuber");
					count++;
				}
				if(count==3) {
					System.out.println("tranasaction blocked:");
					break ;//stop loop
				}
			}
		sc.close();;
	}

}
