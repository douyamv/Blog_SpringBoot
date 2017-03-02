package Main.enity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @Description ����ʵ��
 * @author Du zhongshu
 *
 */

@Entity
@Table(name = "blog")
public class Blog {
	public Blog(Integer id, String title, String summary, Date releaseDate,
			Integer clickHit, Integer replyHit, String content,
			String contentNoTag, String keyWord,
			Integer blogCount, String releaseDateStr, List<String> imageList, BlogType blogType) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.releaseDate = releaseDate;
		this.clickHit = clickHit;
		this.replyHit = replyHit;
		this.content = content;
		this.contentNoTag = contentNoTag;
		this.keyWord = keyWord;
		 this.blogType = blogType;
		this.blogCount = blogCount;
		this.releaseDateStr = releaseDateStr;
		this.imageList = imageList;
	}

	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
 
	private String title;
	private String summary;
	private Date releaseDate;
	private Integer clickHit;
	private Integer replyHit;
	private String content;
	private String contentNoTag; //������ǩ�Ĳ������ݣ�����Lucene������
	private String keyWord; //�ؼ��֣��ÿո����
	
	@ManyToOne 
	 private BlogType blogType; //��������
	private Integer blogCount; //�����������ǲ���ʵ�����ԣ����ڸ��ݷ������ڹ鵵��ѯ
	private String releaseDateStr; //�������ڵ��ַ�����ֻȡ����
	
	@ElementCollection
	@Column(name="nickname")
	private List<String> imageList = new LinkedList<String>();//��������ͼƬ����Ҫ����չʾ����ͼ

	public Integer getId() {
		return id;
	}

	public BlogType getBlogType() {
		return blogType;
	}

	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getClickHit() {
		return clickHit;
	}

	public void setClickHit(Integer clickHit) {
		this.clickHit = clickHit;
	}

	public Integer getReplyHit() {
		return replyHit;
	}

	public void setReplyHit(Integer replyHit) {
		this.replyHit = replyHit;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	
	public Integer getBlogCount() {
		return blogCount;
	}

	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}

	public String getReleaseDateStr() {
		return releaseDateStr;
	}

	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}

	public List<String> getImageList() {
		return imageList;
	}
	 
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getContentNoTag() {
		return contentNoTag;
	}

	public void setContentNoTag(String contentNoTag) {
		this.contentNoTag = contentNoTag;
	}
	
}
