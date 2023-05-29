
public class main {

	/*
	 * Marwan Yasser Mostafa
	 * 20180270
	 * */
	public static void main(String[] args) {
		
		/*
		 * 
		 * To change the collection all you need to do is to add a folder of new docs to the project folder
		 * and pass the name of the collection folder to the Inverted_index constructor
		 * instead of "collection"
		 * 
		 * */
		String query[] = {
				"sleep",
				"language OR NOT programming",
				"NOT programming OR NOT game",
				"computer OR programming AND language",
				"NOT notInIndex"
		};
        Inverted_index algo = new Inverted_index("collection",query);
	}

}
