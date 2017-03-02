package Main.dao;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.Comment;

 

/**
 * @Description ÆÀÂÛdao½Ó¿Ú
 * @author Du zhongshu
 *
 */
@Transactional
public interface CommentDao extends CrudRepository<Comment, Long> {
} 
