package justcoders.designpattern.examples.main;

import justcoders.designpattern.examples.DarkThemeFactory;
import justcoders.designpattern.examples.LightThemeFactory;
import justcoders.designpattern.examples.ThemeFactory;

public class ApplicationConfiguration {

	public static void main(String[] args) 
	{;
		ThemeFactory themeFactory=null;
		String theme="light";
		String text="this is just the text";
		if(theme.equals("light"))
		{
			themeFactory = new LightThemeFactory();
		}
		else if(theme.equals("dark"))
		{
			themeFactory = new DarkThemeFactory();
		}
		
		Application app = new Application(themeFactory,text);
		
		app.printApplication();

	}

}
