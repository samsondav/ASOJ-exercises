package main;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
	public void run() {
		GLabel msg = new GLabel("I love Java", 100, 75);
		msg.setFont("Dialog-24");
		GLabel sig = new GLabel("Sam Philip", 300, 300);
		sig.setFont("Lucida Black-28");
		add(msg);
		add(sig);
	}

}
