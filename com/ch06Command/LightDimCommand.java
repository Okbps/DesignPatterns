package com.ch06Command;

public class LightDimCommand implements Command {
	Light light;

	public LightDimCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.dim();
	}

    @Override
    public void undo() {
        light.off();
    }
}
