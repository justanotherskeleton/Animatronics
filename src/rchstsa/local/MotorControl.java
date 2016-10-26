package rchstsa.local;

import com.pi4j.io.gpio.*;
import com.pi4j.wiringpi.Gpio;

public class MotorControl {
	
	/*
	 * Created 10-26-16
	 * 
	 * This class contains the pin numbers and methods for controlling all GPIO pins of the RPi0
	 * Should be called upon to move motors and such
	 * 
	 * This class CANNOT be used through static calls
	 */
	
	//RPi0 GPIO pins numbers used
	public final int pinWheelMotor = 3, pinSteeringMotor = 5, pinHeadMotor = 7;
	
	//GPIO pin instances
	public GpioPinDigitalOutput wheelMotor, steeringMotor, headMotor;
	
	//pi4j GPIO controller
	public GpioController gpio;
	
	public MotorControl() {
		//Initializes pi4j library
		Gpio.wiringPiSetup();
		gpio = GpioFactory.getInstance();
		
		//Get gpio instances
		wheelMotor = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, PinState.LOW);
		steeringMotor = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, PinState.LOW);
		headMotor = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, PinState.LOW);
	}

}
