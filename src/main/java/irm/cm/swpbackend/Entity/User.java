package irm.cm.swpbackend.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private String username;

    private String password;

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    private String userphone;

    private String archvies_name;

    private String archvies_loaction;

    private String archvies_phone;

    private String archvies_faxnumber;

    private String archives_postalcode;

    private String archvies_email;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @CreatedDate
    private Date registration_time;

    public Date getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(Date registration_time) {
        this.registration_time = registration_time;
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



    public String getArchvies_name() {
        return archvies_name;
    }

    public void setArchvies_name(String archvies_name) {
        this.archvies_name = archvies_name;
    }

    public String getArchvies_loaction() {
        return archvies_loaction;
    }

    public void setArchvies_loaction(String archvies_loaction) {
        this.archvies_loaction = archvies_loaction;
    }

    public String getArchvies_phone() {
        return archvies_phone;
    }

    public void setArchvies_phone(String archvies_phone) {
        this.archvies_phone = archvies_phone;
    }

    public String getArchvies_faxnumber() {
        return archvies_faxnumber;
    }

    public void setArchvies_faxnumber(String archvies_faxnumber) {
        this.archvies_faxnumber = archvies_faxnumber;
    }

    public String getArchives_postalcode() {
        return archives_postalcode;
    }

    public void setArchives_postalcode(String archives_postalcode) {
        this.archives_postalcode = archives_postalcode;
    }

    public String getArchvies_email() {
        return archvies_email;
    }

    public void setArchvies_email(String archvies_email) {
        this.archvies_email = archvies_email;
    }


}
