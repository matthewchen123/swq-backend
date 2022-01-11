package irm.cm.swpbackend.Entity;

import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@Table(name = "senitiveword")
@EntityListeners(AuditingEntityListener.class)
public class Sensitiveword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sensitivewordid")
    private int sensitivewordid;

    private String wordname;// 词名
    private String wordpartofspeech;// 词性
    private String description; // 描述
    private String synonym; // 同义词
    private String homoionym; // 近义词

    private String file_category_of_word; // 敏感词所在档案分类
    private String category_of_word; // 敏感词分类

    private String file_confidentially; // 所属档案涉密程度
    private String contributor; // 贡献者
    private String creator; // 著录者
    private String region; // 地区

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @CreatedDate
    private Date sentitive_time_invoved; // 涉敏时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @CreatedDate
    private Date timeout_of_sensitivity; // 脱敏时间


    private String sensitivitylevel; // 词敏感级别
    private String language; // 语言
    private String otherinfo; // 其他
    
    public int getSensitivewordid() {
        return sensitivewordid;
    }

    public void setSensitivewordid(int sensitivewordid) {
        this.sensitivewordid = sensitivewordid;
    }
    public Date getSentitive_time_invoved() {
        return sentitive_time_invoved;
    }

    public void setSentitive_time_invoved(Date sentitive_time_invoved) {
        this.sentitive_time_invoved = sentitive_time_invoved;
    }

    public Date getTimeout_of_sensitivity() {
        return timeout_of_sensitivity;
    }

    public void setTimeout_of_sensitivity(Date timeout_of_sensitivity) {
        this.timeout_of_sensitivity = timeout_of_sensitivity;
    }

    public String getFile_confidentially() {
        return file_confidentially;
    }

    public void setFile_confidentially(String file_confidentially) {
        this.file_confidentially = file_confidentially;
    }



    public String getHomoionym() {
        return homoionym;
    }

    public void setHomoionym(String homoionym) {
        this.homoionym = homoionym;
    }

    public String getWordname() {
        return wordname;
    }

    public void setWordname(String wordname) {
        this.wordname = wordname;
    }

    public String getWordpartofspeech() {
        return wordpartofspeech;
    }

    public void setWordpartofspeech(String wordpartofspeech) {
        this.wordpartofspeech = wordpartofspeech;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public String getFile_category_of_word() {
        return file_category_of_word;
    }

    public void setFile_category_of_word(String file_category_of_word) {
        this.file_category_of_word = file_category_of_word;
    }

    public String getCategory_of_word() {
        return category_of_word;
    }

    public void setCategory_of_word(String category_of_word) {
        this.category_of_word = category_of_word;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSensitivitylevel() {
        return sensitivitylevel;
    }

    public void setSensitivitylevel(String sensitivitylevel) {
        this.sensitivitylevel = sensitivitylevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }

}
