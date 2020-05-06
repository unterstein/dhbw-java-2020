public class SortierungLoesung {
    public static void main(String[] args) {
        // Eingabe:
        int[] zuSortieren = {12, 14, 125, 1, 9, 28, 3};
        // Ausgabe: Sortierte Liste
        int tmp;

        for (int i = 0; i < zuSortieren.length; i++) {
            for (int j = i; j < zuSortieren.length; j++) {
                if (zuSortieren[j] < zuSortieren[i]) {
                    tmp = zuSortieren[i];
                    zuSortieren[i] = zuSortieren[j];
                    zuSortieren[j] = tmp;
                }
            }
        }

        for (int ausgabe: zuSortieren) {
            System.out.println(ausgabe);
        }
    }
}
