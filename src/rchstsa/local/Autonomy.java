package rchstsa.local;

public class Autonomy extends Thread {
	
	/*
	 * Created 11-2-16
	 * 
	 * This class is run on the RPi
	 * 
	 * It will automate some of the dinosaurs' features like the tail wagging and eating grass
	 */
	
	public Autonomy() {
		Log.write("Started autonomy thread!");
	}

	@Override
	public void run() {
		//Verify automony is allowed
		if((boolean)Settings.map.operationParameters.get("use_automation") == false) {
			//Don't launch this thread
			Log.write("Autonomy is disabled, halting thread!");
			this.interrupt();
		}
	}

}
