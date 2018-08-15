package com.spring.boot.blog.repository;

import com.spring.boot.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Authority 仓库.
 *
 * @since 1.0.0 2017年3月2日
 * @author jing.ji
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
