package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class ifPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop(){
        double motorSpeed=gamepad1.left_stick_y;
        boolean aButton=gamepad1.a;
        if(!aButton){
            motorSpeed*=0.5;
        }
    }
}
