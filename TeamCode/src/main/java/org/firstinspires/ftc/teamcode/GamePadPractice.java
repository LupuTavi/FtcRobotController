package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }
    @Override
    public void loop() {
        double forwardSpeed=-gamepad1.left_stick_y / 2.0;
        double JoyDifference=gamepad1.left_stick_x-gamepad1.right_stick_x;

        telemetry.addData("left x",gamepad1.left_stick_x);
        telemetry.addData("left y",forwardSpeed);
        telemetry.addData("right x",gamepad1.right_stick_x);
        telemetry.addData("right y",gamepad1.right_stick_y);

        telemetry.addData("x button",gamepad1.a);
        telemetry.addData("○ button",gamepad1.b);
        telemetry.addData("□ button",gamepad1.x);
        telemetry.addData("△ button",gamepad1.y);
        telemetry.addData("JoyDifference",JoyDifference);


    }
}

