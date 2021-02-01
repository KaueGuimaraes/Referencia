package com.kauescompany.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Abc implements KeyListener{
	
	public static int[] AbcListInt = {KeyEvent.VK_A, KeyEvent.VK_B, KeyEvent.VK_C, KeyEvent.VK_D, KeyEvent.VK_E, KeyEvent.VK_F,
							KeyEvent.VK_G, KeyEvent.VK_H, KeyEvent.VK_I, KeyEvent.VK_J, KeyEvent.VK_K, KeyEvent.VK_L,
							KeyEvent.VK_M, KeyEvent.VK_N, KeyEvent.VK_O, KeyEvent.VK_P, KeyEvent.VK_Q, KeyEvent.VK_R,
							KeyEvent.VK_S, KeyEvent.VK_T, KeyEvent.VK_U, KeyEvent.VK_V, KeyEvent.VK_W, KeyEvent.VK_X,
							KeyEvent.VK_Y, KeyEvent.VK_Z};
	public static String[] AbcListString = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
									"S", "T", "U", "V", "W", "X", "Y", "Z"}; 
	
	public static int[] OneTwoThreeInt = {};
	
	public static String Abc(int e, boolean Lower) {
		/*if(e == KeyEvent.VK_Q) {
			
		}else if(e == KeyEvent.VK_W) {
			
		}*/
		
		for(int i = 0; i < AbcListInt.length; i++) {
			if(e == AbcListInt[i]) {
				if(Lower) {
					return AbcListString[i].toLowerCase();
				}else {
					return AbcListString[i];
				}
			}
		}
		
		return "";
	}
	
	public void AbcM(int e) {
		
	}
	
	public void oneTwoThree(int e) {
		
	}
	
	public void oneTwoThreeM(int e) {
		
	}

}
