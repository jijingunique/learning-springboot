package com.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.blog.domain.Comment;

/**
 * Comment 仓库.
 *
 * @since 1.0.0 2017年4月7日
 * @author jing.ji
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
