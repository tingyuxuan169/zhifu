package cn.zrf.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @Description  
 * @Author  ZhangRongFei
 * @Date 2019/08/30 16:10 
 */

@Repository
@Setter
@Getter
@ToString
@Entity
@Table ( name ="users" )
public class Users  implements Serializable {


   	@Column(name = "id" )
	private Integer id;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "email" )
	private String email;

   	@Column(name = "phone" )
	private String phone;

   	@Column(name = "possword" )
	private String possword;

}
