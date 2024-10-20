package org.example.daos;

import com.mysql.cj.Session;
import org.example.entities.Author;
import org.example.entities.Book;
import org.example.exeptions.LibraryExeptions;

import java.util.ArrayList;
import java.util.List;

public class BookDao extends GenericDao<Book , Long> {
    private final Session session;
    private final AuthorDao authorDao;

    public BookDao(Session session,AuthorDao authorDao){
        super(session,Book.class);
        this.session=session;
        this.authorDao=authorDao;
}
public Book create(Book book){
        if(book.getBookId()=null) {
            return super.createOrUpdate(book);
        }
                else {
                    throw LibraryExeptions.idNotNull();
            }
        }
public void takeBooks





public List<Book> findAllByAuthor(String name) {
    List<Author> authors =
             authorDao.findByFirstNameAndLastName(name);
    List<Book> books = new ArrayList<>();
    authors.forEach(author -> {
            author,get.Books();
});
    return books;
    return  authors.stream()
            .filter((author -> author.getBooks() != null))
            .map(author -> author.getBooks())
            .flatMap(List::stream)
            .toList();

        }
        }




}
