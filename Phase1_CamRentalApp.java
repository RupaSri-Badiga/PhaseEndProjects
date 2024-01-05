package CamRentalApp;
import java.util.*;
public class Phase1_CamRentalApp {
	 Phase1_CamRentalApp cr=new Phase1_CamRentalApp();


	Wallet w=new Wallet();
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("+--------------------------------+");
		System.out.println("|  WELCOME TO CAMERA RENTAL APP  |");
		System.out.println("+--------------------------------+");
		System.out.println("Please login to Continue");
		Scanner sc =new Scanner(System.in);
		System.out.print("Username: ");
		String uname=sc.nextLine();
		System.out.print("Password: ");
		String passwrd=sc.nextLine();
		CameraInventory.initializeCameras();
		optionsSelection();
		

	}
	public static  void optionsSelection()  {
		System.out.println("1. MY CAMERA");	
		System.out.println("2. RENT A CAMERA");
		System.out.println("3. VIEW MY CAMERA");
		System.out.println("4. MY WALLET");
		System.out.println("5. EXIT");
		int choice1=sc.nextInt();
		switch(choice1){
			case 1:
				subOptionsMenu();
				optionsSelection();
				break;
			case 2:
				System.out.println("Following are the list of the cameras available");
				CameraInventory.listAllCameras();
				System.out.println("Enter the camera ID you want to enter");
				int rent_id=sc.nextInt();
				CameraInventory.rentCameras(rent_id);
				optionsSelection();
				break;
			case 3:
				System.out.println("Hi");
				CameraInventory.listAllCameras();
				optionsSelection();
				break;
			case 4:
				System.out.println("Your current wallet balance is "+String.format("%.2f", Wallet.checkbalance()));
				depositAmount();
				break;
			case 5:
				closeApp();
				break;
			default:
				System.out.println("Entered wrong choice !! Please select again!!");
				optionsSelection();
				break;
			}
	}
	public static void subOptionsMenu()  {
		System.out.println("1. ADD");
		System.out.println("2. REMOVE");
		System.out.println("3. VIEW MY CAMERA");
		System.out.println("4. GO TO PREVIOUS MENU");
		int choice2=sc.nextInt();
		switch(choice2) {
			case 1:
				CameraInventory.addCamera();
				subOptionsMenu();
				break;
			case 2:
				CameraInventory.listAllCameras();
				System.out.println("Enter the camera ID to remove");
				int rid=sc.nextInt();
				CameraInventory.removeCamera(rid);
				subOptionsMenu();
				break;
			case 3:
				CameraInventory.listAllCameras();
				subOptionsMenu();
				break;
			case 4:
				optionsSelection();
				break;
			default:
				System.out.println("Entered wrong choice !! Please select again!!");
				subOptionsMenu();
				break;
		}
	}
	public static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
	public static void depositAmount() {
		System.out.println("Do you want to deposit more amount to your wallet?(1.YES 2.NO)");
        int option=sc.nextInt();
        switch(option) {
        	case 1:
        		System.out.println("Enter the amount (INR) - ");
        		float deposit=sc.nextInt();
        		Wallet.addAmount(deposit);
        		System.out.println("Your wallet balance updated successfully. Current "
        				+ "wallet balance - INR." + Wallet.checkbalance());
        		optionsSelection();
        		break;
        	case 2:
        		optionsSelection();
        		break;
        	default:
        		System.out.println("Invalid choice: Enter correct choice");
        		depositAmount();
	}

	}
}
