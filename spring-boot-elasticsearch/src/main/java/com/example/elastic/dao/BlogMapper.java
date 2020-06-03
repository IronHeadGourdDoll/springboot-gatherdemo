package com.example.elastic.dao;

import com.example.elastic.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository

public interface BlogMapper extends JpaRepository<Blog,Long>, JpaSpecificationExecutor<Blog> {
}
