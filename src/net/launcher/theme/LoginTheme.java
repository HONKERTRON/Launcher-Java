package net.launcher.theme;

import java.awt.Color;

import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.ComboboxStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.LinklabelStyle;
import net.launcher.components.PassfieldStyle;
import net.launcher.components.ServerbarStyle;
import net.launcher.components.TextfieldStyle;

public class LoginTheme
{
	public static int frameW = 1024; 
	public static int frameH = 644;
  public static ButtonStyle server1 = new ButtonStyle(405, 190, 199, 113, "font", "HT", 16.0F, Color.decode("0x000000"), true, Align.LEFT);
  public static ButtonStyle server2 = new ButtonStyle(600, 217, 204, 50, "font", "", 16.0F, Color.decode("0x000000"), true, Align.LEFT);
  public static ButtonStyle server3 = new ButtonStyle(600, 304, 204, 50, "font", "", 16.0F, Color.decode("0x000000"), true, Align.LEFT);
  public static ButtonStyle server4 = new ButtonStyle(800, 135, 357, 50, "font", "", 16.0F, Color.decode("0x000000"), true, Align.LEFT);
  public static ButtonStyle server5 = new ButtonStyle(800, 217, 357, 50, "font", "", 16.0F, Color.decode("0x000000"), true, Align.LEFT);
  public static ButtonStyle server6 = new ButtonStyle(800, 304, 357, 50, "font", "", 16.0F, Color.decode("0x000000"), true, Align.LEFT);
  public static ServerbarStyle serverbar1 = new ServerbarStyle(600, 171, 100, 16, "font", 15.0F, Color.decode("0xFFFFFF"), true);
  public static ServerbarStyle serverbar2 = new ServerbarStyle(600, 254, 100, 16, "font", 15.0F, Color.decode("0xFFFFFF"), true);
  public static ServerbarStyle serverbar3 = new ServerbarStyle(600, 339, 100, 16, "font", 15.0F, Color.decode("0xFFFFFF"), true);
  public static ServerbarStyle serverbar4 = new ServerbarStyle(800, 171, 100, 16, "font", 15.0F, Color.decode("0xFFFFFF"), true);
  public static ServerbarStyle serverbar5 = new ServerbarStyle(800, 254, 100, 16, "font", 15.0F, Color.decode("0xFFFFFF"), true);
  public static ServerbarStyle serverbar6 = new ServerbarStyle(800, 339, 100, 16, "font", 15.0F, Color.decode("0xFFFFFF"), true);
	public static ButtonStyle	 toAuth	     = new ButtonStyle(96, 345, 245, 91, "font", "togame", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	public static ButtonStyle	 toLogout    = new ButtonStyle(96, 436, 245, 36, "font", "exit", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	
	public static ButtonStyle	 toGame	     = new ButtonStyle(462, 307, 180, 47, "font", "button", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	public static ButtonStyle	 toPersonal  = new ButtonStyle(96, 345, 245, 91, "font", "togame", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	public static ButtonStyle	 toOptions   = new ButtonStyle(396, 307, 150, 47, "font", "button", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	public static ButtonStyle	 toRegister  = new ButtonStyle(296, 367, 150, 47, "font", "button", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	
	public static TextfieldStyle login		= new TextfieldStyle(123, 280, 185, 38, "", "font", 16F, Color.decode("0xA67A53"), Color.decode("0xA67A53"), new EmptyBorder(0, 10, 0, 10));
	public static PassfieldStyle password	= new PassfieldStyle(123, 318, 250, 38, "", "font", 19F, Color.decode("0xA67A53"), Color.decode("0xA67A53"), "1", new EmptyBorder(0, 10, 0, 10));
	
	public static ComponentStyle newsBrowser= new ComponentStyle(20, 60, 660, 60, "font", 0F, Color.WHITE, false);
	public static LinklabelStyle links		= new LinklabelStyle(420, 280, 0, "font", 16F, Color.WHITE, Color.LIGHT_GRAY);
	
	public static ButtonStyle	 update_exe	= new ButtonStyle(96, 440, 150, 47, "font", "button", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	public static ButtonStyle	 update_jar	= new ButtonStyle(262, 440, 150, 47, "font", "button", 16F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	public static ButtonStyle    update_no	= new ButtonStyle(600, 0, 0, 0, "font", "button", 0F, Color.decode("0xd4dc7b"), true, Align.CENTER);
	
	public static ComboboxStyle	 servers	= new ComboboxStyle(128, 431, 250, 25, "font", "combobox", 14F, Color.decode("0xA67A53"), true, Align.CENTER);
	public static ServerbarStyle serverbar	= new ServerbarStyle(155, 470, 260, 16, "font", 15F, Color.decode("0xA67A53"), true);
	
	public static float fontbasesize		= 14F;
	public static float fonttitlesize		= 20F;
}