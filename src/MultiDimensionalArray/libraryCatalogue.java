package MultiDimensionalArray;

import java.util.HashMap;
import java.util.Map;

public class libraryCatalogue {
    Map<String, Book> bookCollections = new HashMap<String, Book>();

    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double intialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public libraryCatalogue(Map<String, Book> collection) {
        this.bookCollections = collection;
    }

    public libraryCatalogue (Map<String, Book> collection, int lengthOfCheckedOutPeriod,
                             double initialLateFee, double feePerLateDay) {
        this.bookCollections = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckedOutPeriod;
        this.intialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // Getters
    pulic int getCurrentDay() {

    }

    pulic Map<String, Book> getBookCollection() {

    }

    pulic Book getBook() {

    }

    pulic int getCurrentDay() {

    }

    public static void Main(String[] args) {

    }
}
