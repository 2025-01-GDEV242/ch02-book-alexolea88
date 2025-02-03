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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
}
