package com.spring.boot.blog.service;

import com.spring.boot.blog.domain.Comment;

/**
 * Comment 服务接口.
 * 
 * @since 1.0.0 2017年4月9日
 * @author jing.ji
 */
public interface CommentService {
	/**
	 * 根据id获取 Comment
	 * @param id
	 * @return
	 */
	Comment getCommentById(Long id);
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	void removeComment(Long id);
}
