package justcoders.designpattern.examples;

public class DarkThemeText implements Text{

	private String text;
	
	public DarkThemeText(String text)
	{
		this.text=text;
	}
	@Override
	public String getcolor() {
		return "White";
	}

	@Override
	public String getText() {
		return text;
	}

}
