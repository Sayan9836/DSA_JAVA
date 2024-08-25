public class duplicatewords {
    public static void main(String[] args) {
        String str = "bug time bug left time pass time left lawra time";
        str.toLowerCase();
        String[] word = str.split(" ");
        int count;

        for (int i = 0; i < word.length; i++) {
            count = 1;// everytime count will reset to 1;
            if(word[i] == "0"){
                continue;
            }
            for (int j = i + 1; j < word.length; j++) {

                if (word[i].equals(word[j])) {
                    count++;

                    word[j] = "0";// to avoid printing visited words
                }

            }
            // display the word whose count >1;
            if (count > 1 && word[i] != "0") {
                System.out.println(word[i]);
                System.out.println(count);
            }
        }

    }

}
