package org;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@Autonomous
public class helloworld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "Amy Kim");
    }

    @Override
    public void loop() {
    }

    // Single Line Comment
    /*
    1. Hello: World, change the telementary data to display "Hello: Amy Kim"
    2. Run this code in the Autonomous section of you DS
     */
}
