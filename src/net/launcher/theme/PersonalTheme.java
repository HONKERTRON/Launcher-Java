/* Данный класс отвечает за хранение координат всех компонентов личного кабинета лаунчера */

package net.launcher.theme;

import java.awt.Color;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.ComponentStyle;

public class PersonalTheme
{
	public static ComponentStyle	ugroup		= new ComponentStyle(20, 300, 140, -1, "font", 16F, Color.WHITE, true);
	
	public static int	  skinX			= 270;
	public static int	  skinY			= 220;
	public static int	  skinW			= 64;
	public static int	  skinH			= 128;
	public static int	  cloakX		= 110;
	public static int	  cloakY		= 170;
	public static int	  cloakW		= 40;
	public static int	  cloakH		= 60;
	
	public static ComponentStyle iConomy	  = new ComponentStyle(280, 300, -1, -1, "font", 18F, Color.GREEN, true);
	public static ComponentStyle realmoney	  = new ComponentStyle(420, 300, -1, -1, "font", 18F, Color.GREEN, true);
	
	public static ButtonStyle	 changeskin	  = new ButtonStyle(180, 440, 180, 47, "font", "button", 16F, Color.decode("0xd4dc7b"), true, Align.LEFT);		

	
	public static ButtonStyle	 toGamePSL    = new ButtonStyle(123, 385, 180, 47, "font", "", 16F, Color.decode("0xd4dc7b"), true, Align.LEFT);
}