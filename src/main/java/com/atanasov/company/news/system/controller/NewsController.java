package com.atanasov.company.news.system.controller;

import com.atanasov.company.news.system.model.News;
import com.atanasov.company.news.system.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {
    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping
    public void createOrUpdateNews(@RequestBody News news) {
        newsService.createOrUpdateNews(news);
    }

    @GetMapping("news/date")
    public List<News> newsDate(@Param("date")LocalDate date){
        return newsService.findAllNewsByDate(date);
    }
    @GetMapping("news/title")
    public List<News> newsTitle(@Param("title")String title){
        return newsService.findAllNewsByTitle(title);
    }
}
