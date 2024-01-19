package CamRentalApp;

import java.util.*;

public class CameraInventory {
	static List<Camera> list=new ArrayList<Camera>();
	static Scanner sc=new Scanner(System.in);
	static int id=5;

	 public  static void initializeCameras() {
	     // Add some sample cameras to the list during system initialization
		 list.add(new Camera(1, "Canon", "EOS R5", 200.0f, "Available"));
		 list.add(new Camera(2, "Nikon", "Z6 M34", 250.0f, "Available"));
		 list.add(new Camera(3, "Sony", "A7 III", 500.0f, "Rented"));
		 list.add(new Camera(4, "samsung", "AII M2", 5000.0f, "Available"));
		 list.add(new Camera(5, "Panasonic", "Model1", 1000.0f, "Available"));
	    }
	public static void addCamera() {
		id=id+1;
		System.out.println("enter camera brand");
		String cbrand1=sc.next();
		System.out.println("enter camera model");
		String cmodel1=sc.next();
		System.out.println("enter camera price");
		float cprice1=sc.nextFloat();
		String cstatus1="Available";
		Camera cam=new Camera(id,cbrand1,cmodel1,cprice1,cstatus1);
		list.add(cam);
		System.out.println("Camera has been added successfully");
	}
	public static void removeCamera(int cid) {
		for (int i = 0; i < list.size(); i++) {
		    Camera element = list.get(i);
		    if(element.id==cid) {
		    	list.remove(element);
		    	System.out.println("Camera successfully removed from the lsit");
		    	break;
		    }
		}
		System.out.println("Camera is not in the list");
	}
	public static void rentCameras(int rent_id) {
		
		for (int i = 0; i < list.size(); i++) {
		    Camera element = list.get(i);
		    if(element.id==rent_id) {
		    	if(element.price<Wallet.checkbalance()) {
		    		Wallet.deductAmount(element.price);
		    		element.status="RENTED";
		    		System.out.println("Your transaction for camera "+element.brand+" "+element.model+" with rent "+element.price+" has successfully completed");
		    	}
		    	else {
            		System.out.println("Transacttion Failed due to insufficient"
            				+ " wallet balance. Please Deposit the amount to your wallet");
            		Phase1_CamRentalApp.depositAmount();
            	}
		    		
		    }
		}
	}
	public static void listAllCameras(){
		
		System.out.println("=====================================================================================");
        System.out.printf("%-15s%-15s%-15s%-20s%-15s\n", "Camera ID", "Brand", "Model", "Price(Per Day)", "Status");
        System.out.println("=====================================================================================");
        for (Camera camera :list ) {
            
                System.out.printf("%-15d%-15s%-15s%-20.2f%-15s\n",camera.id,camera.brand,camera.model,camera.price,camera.status);
        }
        System.out.println("=====================================================================================");
		
	}
	public static void listAllCamerasAvailable(){
		System.out.println("Following is the list of Available Cameras - ");
        System.out.println("=====================================================================================");
        System.out.printf("%-15s%-15s%-15s%-20s%-15s\n", "Camera ID", "Brand", "Model", "Price(Per Day)", "Status");
        System.out.println("=====================================================================================");
        for (Camera camera : list) {
            if ((camera.status).contentEquals("Available")) {
                System.out.printf("%-15d%-15s%-15s%-20.2f%-15s\n",camera.id,camera.brand,camera.model,camera.price,camera.status);
            }
        }
        System.out.println("=====================================================================================");
		
		
	}
	

}
