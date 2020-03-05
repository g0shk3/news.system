package com.atanasov.company.news.system.service;

import com.atanasov.company.news.system.model.News;
import com.atanasov.company.news.system.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
    public void createOrUpdateNews(News news){
        if(null == news.getId()){
            createNews(news);
            return;
        }
        updateNews(news);
    }
    public void createNews(News news){
        newsRepository.save(news);

    }
    public void updateNews(News news){
        newsRepository.save(news);
    }

//    public List<News> sortByDate(LocalDate date) {
//        return newsRepository.sortByDate(date);
//    }

}
