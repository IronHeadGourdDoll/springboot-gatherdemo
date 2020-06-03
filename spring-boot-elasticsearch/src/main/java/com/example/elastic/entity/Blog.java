package com.example.elastic.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="blog")
@Entity
@DynamicInsert
@DynamicUpdate
//@Document(indexName = "blog",type = "docs")
@Data
public class Blog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//这样的话，save(xxx)后xxx就已经更新为已经保存的实体了,添加的xxx就有id了
    public Long id;
    public String title;
//    @Field(type = FieldType.Keyword)
    public String author;
    public String summary;
    @Lob
    @Column(columnDefinition = "TEXT")
    public String content;
    public String createTime;
    public String updateTime;
    public Integer commend;
    public Integer status;
    public String headerImg;
    public String categoryName;
    public int readTimes;
    public int likedTimes;
    public int dislikedTimes;
    public int commentTimes;
    public int grade;

    public Blog(Long id,String title) {
        this.id=id;
        this.title=title;
    }
}
