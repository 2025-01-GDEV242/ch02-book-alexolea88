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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    //Mutator method
    public void setRefNumber(String ref)
    {
        refNumber = ref;
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
    }
}
