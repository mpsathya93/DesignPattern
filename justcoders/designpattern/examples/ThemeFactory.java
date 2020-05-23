package justcoders.designpattern.examples;

public interface ThemeFactory {
	
	public BackgroundThemeColor createBackgroundThemeColor();
	public Text createText(String text);

}
