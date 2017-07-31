public class VitusStringFormatter {

	private final int length;

	public VitusStringFormatter(final int length) {
		this.length = length;
	}

	/**
	 * Method returns a String consisting of length number of padchar characters.
	 * 
	 * @param padchar
	 *            a character to be used for constructing the String.
	 * @param length
	 *            a integer value greater than zero defining the length of the
	 *            String to be built.
	 * @return a String with the given length, consisting of padchar characters.
	 */
	private String getPaddedString(final char padchar, final int length) {
		StringBuilder result = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			result.append(padchar);
		}
		return result.toString();
	}

	// Kopierte Methode
	public String getPaddedString(final char padchar) {
		return getPaddedString(padchar, this.length);
	}

	public String getNicePaddedString(final char padchar, final char delimiter) {
		StringBuilder result = new StringBuilder(this.length);
		result.append(delimiter);

		result.append(getPaddedString(padchar, this.length - 2));
		result.append(delimiter);
		return result.toString();
	}
}
