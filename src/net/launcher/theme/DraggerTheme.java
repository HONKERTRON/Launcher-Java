package net.launcher.theme;

import java.awt.Color;

import net.launcher.components.DragbuttonStyle;
import net.launcher.components.DraggerStyle;
import net.launcher.components.TitleStyle;

public class DraggerTheme {
	public static TitleStyle      title	    = new TitleStyle(0, 0, 180, 40, "font", 30F, Color.decode("0xd4dc7b"));
	public static DragbuttonStyle dbuttons	= new DragbuttonStyle(729, 14, 35, 24, 762, 14, 35, 24, "draggbutton", true);
	public static DraggerStyle	  dragger	= new DraggerStyle(0, 0, 506, 555);
}
