public class VitusStringFormatter {

	private final int length;

	public VitusStringFormatter(final int length) {
		this.length = length;
	}

	public String getPaddedString(final char padchar) {
		StringBuilder result = new StringBuilder(this.length);
		for (int i = 0; i < this.length; i++) {
			result.append(padchar);
		}
		return result.toString();
	}
}
