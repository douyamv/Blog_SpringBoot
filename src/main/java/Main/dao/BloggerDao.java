	package Main.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.Blogger;

 

/**
 * @Description ����dao�ӿ�
 * @author Du zhongshu
 *
 */
@Transactional
public interface BloggerDao  extends CrudRepository<Blogger, Long> {
} 

