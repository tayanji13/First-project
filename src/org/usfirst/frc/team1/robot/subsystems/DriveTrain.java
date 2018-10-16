package org.usfirst.frc.team1.robot.subsystems;

import org.usfirst.frc.team1.robot.Robot;
import org.usfirst.frc.team1.robot.commands.drive;

import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
public Talon c1= new Talon(1);
public Talon c2= new Talon(2);
public Talon c3= new Talon(3);
public Talon c4= new Talon(4);


public void speed() {
	if(!RobotState.isAutonomous()) { 
		
	
	if(Robot.oi.djoy.getRawButton(5)) {
		 c1.set(-Robot.oi.djoy.getRawAxis(1)*0.5);
		 c2.set(-Robot.oi.djoy.getRawAxis(1)*0.5);
		 c3.set(Robot.oi.djoy.getRawAxis(5)*0.5);
		 c4.set(Robot.oi.djoy.getRawAxis(5)*0.5);
	}
		 else {
	c1.set(-Robot.oi.djoy.getRawAxis(1));
	c2.set(-Robot.oi.djoy.getRawAxis(1));
	c3.set(Robot.oi.djoy.getRawAxis(5));
	c4.set(Robot.oi.djoy.getRawAxis(5));


 }
	}
	
}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new drive());
    }
}


