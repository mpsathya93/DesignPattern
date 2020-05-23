package test;

import AbstractDesignPattern.BackgroundThemeColor;
import AbstractDesignPattern.Text;
import AbstractDesignPattern.ThemeFactory;

public class Application {
   private Text text;
   private BackgroundThemeColor bgtheme;
   
   
   private ThemeFactory theme;
   
   public Application(ThemeFactory theme,String text){
	   this.theme=theme;
	   this.bgtheme= theme.createBackgroundThemeColor();
	   this.text=theme.createText(text);
   }
   
   public void printApplication()
   {
	   System.out.println("The backgroundTheme color is "+bgtheme.getcolor() );
	   System.out.println("The Text color is "+text.getcolor());
   }
}
