package io.github.raulsmail.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

	public InputHandler(Game game) {
		game.addKeyListener(this);
	}

	public class Key {
		private boolean pressed = false;

		public boolean isPressed() {
			return pressed;
		}

		public void toggle(boolean pressed) {
			this.pressed = pressed;
		}
	}

	public Key up = new Key();
	public Key down = new Key();
	public Key right = new Key();
	public Key left = new Key();

	public void keyPressed(KeyEvent e) {
		toggleKey(e.getKeyCode(), true);
	}

	public void keyReleased(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void toggleKey(int keyCode, boolean pressed) {
		if (keyCode == KeyEvent.VK_W) {
			up.toggle(pressed);
		}
		if (keyCode == KeyEvent.VK_S) {
			down.toggle(pressed);
		}
		if (keyCode == KeyEvent.VK_D) {
			right.toggle(pressed);
		}
		if (keyCode == KeyEvent.VK_A) {
			left.toggle(pressed);
		}
	}
}
