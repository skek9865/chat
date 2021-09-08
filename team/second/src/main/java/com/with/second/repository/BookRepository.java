package com.with.second.repository;

import com.with.second.entity.BookEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity,Long> {

    @Query("select b,i from BookEntity b left outer join Book_ImgEntity i on i.bookEntity = b")
    List<Object[]> getList(Sort sort);
}
