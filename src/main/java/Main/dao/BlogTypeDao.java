package Main.dao;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.BlogType;

 

/**
 * @Description �������dao�ӿ�
 * @author Du zhongshu
 *
 */
@Transactional
public interface BlogTypeDao extends CrudRepository<BlogType, Long> {
} 
