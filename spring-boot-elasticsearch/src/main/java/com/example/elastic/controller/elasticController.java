package com.example.elastic.controller;

import com.example.elastic.entity.Blog;
import com.example.elastic.service.elasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class elasticController {

    @Autowired
    private elasticService service;

    //1.查看索引是否存在
    @GetMapping(value = "/ttt")
    public boolean test() throws IOException {
        return service.IndexExists();
    }
    //2.导入所有数据
    @GetMapping(value = "/importAll")
    public boolean importAll() throws IOException {
        return service.importAll();
    }
    //3.精准查询
    @GetMapping(value = "/search/{keyword}")
    public List<Blog> search(@PathVariable("keyword") String keyword) throws IOException {
        return service.search(keyword);
    }
    //4.分词查询
    @GetMapping(value = "/searchPhrase/{keyword}")
    public List<Blog> searchPhrase(@PathVariable("keyword") String keyword) throws IOException {
        return service.searchPhrase(keyword);
    }


    //5.添加文档
    @GetMapping(value = "/addDocument")
    public String addDocument() throws IOException {
        return service.addDocument();
    }

    //6.测试是否添加成功
    @GetMapping(value = "/docIsExists")
    public boolean docIsExists() throws IOException {
        return service.docIsExists();
    }
}
