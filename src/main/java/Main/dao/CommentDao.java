package Main.dao;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.Comment;

 

/**
 * @Description ����dao�ӿ�
 * @author Du zhongshu
 *
 */
@Transactional
public interface CommentDao extends CrudRepository<Comment, Long> {
} 
