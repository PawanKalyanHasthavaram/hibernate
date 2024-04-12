package hibernateJSP;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="marchant")
@NamedQuery(name="findByName",query="select m from Marchant m where m.name=?1")

@NamedQueries(value= {
		@NamedQuery(name="verifyByEmail",query="select m from Marchant m where m.email=?1 and m.password=?2"),
		@NamedQuery(name="verifyById",query="select m from Marchant m where m.id=?1 and m.password=?2")
})
public class Marchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable=false,unique=true)
	private long phone;
	@Column(nullable=false,unique=true)
	private String gst_number;
	@Column(nullable=false,unique=true)
	private String email;
	@Column(nullable=false)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGst_number() {
		return gst_number;
	}
	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
