import java.util.ArrayList;

/* Sort functions used in path finding to
 * determine lowest F cost Node. Bubble sort is mainly
 * used, quick sort needs work. Currently not working
 * by Tony Le
 */
public class Sort {

	private boolean lowToHigh, highToLow;

	public Sort() {
		lowToHigh = true;
		highToLow = false;
	}

	public void bubbleSort(int[] data) {
		int Switch = -1;
		int temp;

		while (Switch != 0) {
			Switch = 0;

			if (lowToHigh) {
				for (int i = 0; i < data.length - 1; i++) {
					if (data[i] > data[i + 1]) {
						temp = data[i];
						data[i] = data[i + 1];
						data[i + 1] = temp;
						Switch = 1;
					}
				}
			} else if (highToLow) {
				for (int i = 0; i < data.length - 1; i++) {
					if (data[i] < data[i + 1]) {
						temp = data[i];
						data[i] = data[i + 1];
						data[i + 1] = temp;
						Switch = 1;
					}
				}
			}
		}
	}

	public void bubbleSort(ArrayList<Node> list) {
		int Switch = -1;
		Node temp;

		while (Switch != 0) {
			Switch = 0;

			if (lowToHigh) {
				for (int i = 0; i < list.size() - 1; i++) {
					if (list.get(i).getF() > list.get(i + 1).getF()) {
						temp = list.get(i);
						list.remove(i);
						list.add(i + 1, temp);
						Switch = 1;
					}
				}
			} else if (highToLow) {
				for (int i = 0; i < list.size() - 1; i++) {
					if (list.get(i).getF() < list.get(i + 1).getF()) {
						temp = list.get(i);
						list.remove(i);
						list.add(i + 1, temp);
						Switch = 1;
					}
				}
			}
		}
	}


	public void setLowToHigh() {
		lowToHigh = true;
		highToLow = false;
	}

	public void setHighToLow() {
		lowToHigh = false;
		highToLow = true;
	}
}
