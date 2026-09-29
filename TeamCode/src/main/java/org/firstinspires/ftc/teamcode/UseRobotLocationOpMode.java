package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class UseRobotLocationOpMode extends OpMode {

    RobotLocationPractice RobotLocationPractice= new RobotLocationPractice(0);



    @Override
    public void init() {
        RobotLocationPractice.setAngle(0);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            RobotLocationPractice.turnRobot(0.1);
        }
        else if(gamepad1.b){
            RobotLocationPractice.turnRobot(-0.1);
        }

        telemetry.addData("Heading",RobotLocationPractice.getHeading());
    }
}
