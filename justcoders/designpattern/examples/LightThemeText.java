package justcoders.designpattern.examples;

public class LightThemeText implements Text {

	private String text;
	
	public LightThemeText(String text)
	{
		this.text=text;
	}
	@Override
	public String getcolor() {
		
		return "Black";
	}

	@Override
	public String getText() {
		
		return text;
	}

}
