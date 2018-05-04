package GetterSetterReview;

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
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollections;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckOutPeriod() {
        return this.lengthOfCheckOutPeriod;
    }

    public double getIntialLateFee() {
        return this.intialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    // INSTANCE METHODS

    public void checkOut(String title) {
        Book book = getBook(title);
        if(book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " +
                    (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
        if(daysLate > 0 ) {
            System.out.println("You owe the library $" + (getIntialLateFee() + daysLate * getFeePerLateDay()) +
                    " because your book is " + daysLate + " days overdue");
        } else {
            System.out.println("Book returned. Thank you!");
        }

        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " +
                "It should be back on day " + (book.getDayCheckedOut() +
                getLengthOfCheckOutPeriod() + "."));
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 946, 54578);
        bookCollection.put("Harry Potter", harry);
        libraryCatalogue lib = new libraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }
}
