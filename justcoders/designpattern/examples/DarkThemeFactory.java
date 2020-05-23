package justcoders.designpattern.examples;

public class DarkThemeFactory implements ThemeFactory{

	@Override
	public BackgroundThemeColor createBackgroundThemeColor() {
		
		return new DarkThemeBackground();
	}

	@Override
	public Text createText(String text) {
		return new DarkThemeText(text);
	}

}
