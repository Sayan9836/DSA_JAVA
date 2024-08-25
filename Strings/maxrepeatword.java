public class maxrepeatword {
    public static void main(String[] args) {
        String str = "bug time bug left time pass time left lawra time";
        str.toLowerCase();
        String[] word = str.split(" ");
        int count = 1;
        int temp = 0;
        int[] arr = new int[100];
        String words = " ";

        for (int i = 0; i < word.length; i++) {
            count = 1;// everytime count will reset to 1;
            for (int j = i + 1; j < word.length; j++) {

                if (word[i].equals(word[j])) {
                    count++;

                    word[j] = "0";// to avoid printing visited words
                }

            }
            arr[temp] = count;
            temp++;
        }
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                words = word[i];

            }
        }
        System.out.println(words);
        System.out.println(max);

        // System.out.println(word);

        // display the word whose count >1;

    }

}
