
public class _03_FullHouse {

	public static void main(String[] args) {

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A", };
		char[] suits = { '♣', '♦', '♥', '♠' };
		int count = 0;
		String[] results = new String[5];
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (i == j) {
					continue;
				}
				for (int j2 = 0; j2 < suits.length; j2++) {
					for (int k = j2 + 1; k < suits.length; k++) {
						for (int k2 = k + 1; k2 < suits.length; k2++) {
							for (int l = 0; l < suits.length; l++) {
								for (int l2 = l + 1; l2 < suits.length; l2++) {
									results[4] = cards[i] + suits[j2];
									results[3] = cards[i] + suits[k];
									results[2] = cards[i] + suits[k2];
									results[1] = cards[j] + suits[l];
									results[0] = cards[j] + suits[l2];
									count++;
									System.out.print("(" + results[4]
											+ results[3] + results[2]
											+ results[1] + results[0] + ")");
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(count + " full houses");
	}

}
