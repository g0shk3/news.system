package com.atanasov.company.news.system.repository;
import com.atanasov.company.news.system.model.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface NewsRepository extends CrudRepository<News , Integer> {
 //   List<News> findAllByDate(@Param("date")LocalDate date, Pageable pageable);
//    List<News> findAllByTitle(@Param("title")String title, Pageable pageable);
// List<News> sortByDate(LocalDate date);
 //List<News> getAllNewsByTitle(String title);
}
