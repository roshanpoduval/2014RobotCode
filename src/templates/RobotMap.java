/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

/**
 *
 * @author Developer
 */
public class RobotMap {
    //Mecanums
    public static final int MECANUM_BACK_LEFT = 1;
    public static final int MECANUM_BACK_RIGHT = 2;
    public static final int MECANUM_FRONT_LEFT = 3;
    public static final int MECANUM_FRONT_RIGHT = 4;
    
    //Ports
    public static final int JAGUAR_PORT = 5; //semi-pointless thing that Ethan told us to make for testing
    public static final int SPINNING_BALL_GRABBER_PORT = 6; //port for that spinning thing that grabs the ball
    public static final int SOLENOID_PASSING_PORT = 7; //port for the solenoid thing in passcommand
    //Buttons
    public static final int ONE_MOTOR = XboxController.ButtonType.kLeftStick.value;
}
//Magikarp is better than Ditto. Nothing is better than the Guillotine. No one likes Gyrados.