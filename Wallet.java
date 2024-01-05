package CamRentalApp;

	class InsufficientWalletbalance  extends Exception  
	{ 
		private static final long serialVersionUID = -3773903691062612691L;

		public InsufficientWalletbalance (String str)  
	    {  
	        super(str);  
	    }  
	}  
	public class Wallet {
		static float amount=10000;
		public static  float checkbalance() {
			return amount;
		}
		public static float addAmount(float amt){
			amount=amount+amt;
			return amount;
			
		}
		public static void deductAmount(float amt){
			amount=amount-amt;
		}
		
	}
