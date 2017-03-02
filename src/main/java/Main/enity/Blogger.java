package Main.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @Description ����ʵ��
 * @author Du zhongshu
 *
 */
@Entity
@Table(name = "blogger")
public class Blogger {
	
	public Blogger(Integer id, String username, String password,
			String profile, String nickname, String sign, String imagename) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.profile = profile;
		this.nickname = nickname;
		this.sign = sign;
		this.imagename = imagename;
	}
	public Blogger() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String username; //����
	private String password; //����
	private String profile; //������Ϣ
	private String nickname; //�����ǳ�
	private String sign; //����ǩ��
	private String imagename; //ͷ��·��
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

}
