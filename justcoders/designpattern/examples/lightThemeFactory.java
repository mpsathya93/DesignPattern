package justcoders.designpattern.examples;

public class LightThemeFactory implements ThemeFactory {

	@Override
	public BackgroundThemeColor createBackgroundThemeColor() {
		return new LightThemeBackground();
	}

	@Override
	public Text createText(String text) {
		return new LightThemeText(text);
	}

}
