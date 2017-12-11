/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * November 7th, 2017
 * This is where the space for Drum Kit Test Drive
 */

import java.awt.*;

class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.playTopHat();
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
	}
}


