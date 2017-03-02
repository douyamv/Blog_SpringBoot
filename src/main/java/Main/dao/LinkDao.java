package Main.dao;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import Main.enity.Link;
import Main.enity.User;


 

/**
 * @Description 友情链接dao接口
 * @author Du zhongshu
 *
 */
@Transactional
public interface LinkDao extends CrudRepository<Link, Long> {
} 