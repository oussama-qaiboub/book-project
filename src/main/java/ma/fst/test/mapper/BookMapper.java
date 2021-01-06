package ma.fst.test.mapper;

import ma.fst.test.dao.entity.BookEntity;
import ma.fst.test.presentation.model.Book;
import org.springframework.stereotype.Component;

/**
 * Created by Oussama_Qaiboub on 2021-01-06.
 */
@Component
public class BookMapper {

    public BookEntity convertToEntity(Book book){
        BookEntity target = new BookEntity();
        target.setAge(book.getAge());
        target.setTitle(book.getTitle());

       return target;
    }

    public Book convertToModel(BookEntity bookEntity){
        Book target = new Book();
        target.setAge(bookEntity.getAge());
        target.setTitle(bookEntity.getTitle());

        return target;
    }
}
