package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPractice extends OpMode {
    @Override
    public void init() {

    }


    double Mymethod(double input) {
        double output = input * input;
        if (output < 0) {
            output *= -1;
        }
        return output;
    }


        @Override
        public void loop () {
        double x=Mymethod(4);
        telemetry.addData("squareroot of 4",x);
        }
    }

