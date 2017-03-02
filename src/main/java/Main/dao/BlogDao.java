package Main.dao;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.Blog;
 

/**
 * @Description ²©¿ÍDao½Ó¿Ú
 * @author Du zhongshu
 *
 */
@Transactional
public interface BlogDao  extends CrudRepository<Blog, Long> {
	
} 
