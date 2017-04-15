package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(100,100);
		sleep(13000);
		driveDirect(-100, 100);
		sleep(1900);
		driveDirect(1000,1000);
		sleep(3500);
		driveDirect(-100, 100);
		sleep(1800);
		driveDirect(1000,1000);
		sleep(13000);
	}

	public void loop() {
	
	}
}
