package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@Autonomous(name="BasicDrive", group="Linear Opmode")

public class BasicDrive extends LinearOpMode {

    // How long its been running?
    private ElapsedTime runtime = new ElapsedTime();

    // Declaring one motor
    DcMotor leftMotor;

    // Declaring the other one
    DcMotor rightMotor;

    // Declaring the middle motor
    DcMotor middleMotor;

    // The speed of moving
    double power = 0.7;

    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Connects with the motors
        leftMotor = hardwareMap.get(DcMotor.class, "Left_Drive");
        rightMotor = hardwareMap.get(DcMotor.class, "Right_Drive");
        middleMotor = hardwareMap.get(DcMotor.class, "Middle_Motor");

        //reverses motor
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // makes the motors move at the preset power
        leftMotor.setPower(power);
        rightMotor.setPower(power);
        middleMotor.setPower(power);

        // while sleep is active the robot will be running
        sleep(5000);

        // shuts down the motors
        leftMotor.setPower(0.0);
        rightMotor.setPower(0.0);
        middleMotor.setPower(0.0);
    }

}
