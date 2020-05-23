package AbstractDesignPattern;

public interface ThemeFactory {
	
	public BackgroundThemeColor createBackgroundThemeColor();
	public Text createText(String text);

}
