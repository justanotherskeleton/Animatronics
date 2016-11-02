package rchstsa.local;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class Settings {
	
	/*
	 * Created 11-2-16
	 * 
	 * This class contains static variables for how the dinosaur should operator
	 * These variables are to be used locally on the dinosaur, the client has no use for them
	 */
	
	/*
	 * Operation flags
	 * 
	 * Automation variability:
	 * 
	 * use_automation - Enable/disable automation [boolean]
	 * tail_wag - Enable/disable tail wagging, is overrode by 'use_automation' [boolean]
	 * head_movement - Enable/disable head movement, is overrode by 'use_automation' [boolean]
	 * leg_movement - Enable/disable leg movement, is overrode by 'use_automation' [boolean]
	 * 
	 * Automation parameters:
	 * 
	 * tail_cooldown_min - Minimum cooldown time for the tail to wag again (in seconds) [integer]
	 * tail_cooldown_max - Maximum cooldown time for the tail to wag again (in seconds) [integer]
	 * head_cooldown_min - Minimum cooldown time for the tail to move again (in seconds) [integer]
	 * head_cooldown_max - Maximum cooldown time for the head to move again (in seconds) [integer]
	 */
	
	//The loaded JSON data
	public static SettingsMap map;
	
	//Load data from action.json into the operation parameters
	public static void load() throws Exception {
		String fileRead = FileUtils.readFileToString(new File("action.json"));
		map = new Gson().fromJson(fileRead, SettingsMap.class);
		Log.write("Loaded operation parameters!");
	}

}
