package justcoders.designpattern.examples.main;

import justcoders.designpattern.examples.BackgroundThemeColor;
import justcoders.designpattern.examples.Text;
import justcoders.designpattern.examples.ThemeFactory;

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
