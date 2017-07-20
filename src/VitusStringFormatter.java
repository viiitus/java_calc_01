public class VitusStringFormatter {

	private final int length;

	public VitusStringFormatter(final int length) {
		this.length = length;
	}

	public String getPaddedString(final char padchar) {
		String result = "";
		for (int i = 0; i < this.length; i++) {
			result = result + padchar;
		}
		return result;
	}
}
