package com.ch12Compound.djview;

/**
 * Created by Aspire on 01.06.2017.
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
