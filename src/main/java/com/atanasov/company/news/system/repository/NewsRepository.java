package com.atanasov.company.news.system.repository;
import com.atanasov.company.news.system.model.News;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends CrudRepository<News , Integer> {


    List<News> findAll(Sort date);
    List<News> findAllByTitle(String title);
}

