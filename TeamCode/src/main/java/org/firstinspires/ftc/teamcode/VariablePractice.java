package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 23420;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name="mark";

        telemetry.addData("teamNumber", teamNumber);
        telemetry.addData("motorSpeed", motorSpeed);
        telemetry.addData("clawClosed", clawClosed);
        telemetry.addData("name",name);
    }
    @Override
    public void loop(){

    }

}

