	package Main.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.Blogger;

 

/**
 * @Description ²©Ö÷dao½Ó¿Ú
 * @author Du zhongshu
 *
 */
@Transactional
public interface BloggerDao  extends CrudRepository<Blogger, Long> {
} 

