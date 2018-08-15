package com.spring.boot.blog.repository;

import com.spring.boot.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vote 仓库.
 *
 * @since 1.0.0 2017年4月9日
 * @author jing.ji
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
