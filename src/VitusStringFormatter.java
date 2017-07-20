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

	public String getNicePaddedString(final char padchar, final char delimiter) {
		StringBuilder result = new StringBuilder(this.length);
		result.append(delimiter);

		for (int i = 0; i < this.length - 2; i++) {
			result.append(padchar);
		}
		result.append(delimiter);
		return result.toString();
	}
}
