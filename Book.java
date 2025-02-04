/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Alejandro Olea)
 * @version (02/03/2025)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }
    
    //Determines if book is a course textbook
    public boolean isCourseText()
    {
        return courseText;
    }
    
    //Mutator method
    public void borrowed()
    {
        borrowed += 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    //Mutator method
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error: Reference number must be at least 3 characters");
        }
    }
    
    //Collect reference number
    public String getRefNumber()
    {
        return refNumber;
    }

    //Collect author name
    public String getAuthor()
    {
        return author;
    }
    
    //Collect book title
    public String getTitle()
    {
        return title;
    }
    
    //Collect page amount
    public int getPages()
    {
        return pages;
    }
    
    //Print author name
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    //Print book title
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //Print book details
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
        if (refNumber.length() == 0) {
            System.out.println("\nReference Number: ZZZ");
        } else {
            System.out.println("\nReference Number: " + refNumber);
        }
        
        if (borrowed == 1) {
            System.out.println("\nThis book has been borrowed 1 time.");
        } else {
            System.out.println("\nThis book has been borrowed " + borrowed + " times.");
        }
    }
}
