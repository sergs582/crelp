package com.idealabs.crelpweb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ideas")
public class Idea {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "idea")
	private String idea;
	
	@Column(name = "userId")
	private String userId;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "photo1")
	private String photo1;
	
	@Column(name = "photo2")
	private String photo2;
	
	@Column(name = "photo3")
	private String photo3;
	
	@Column(name = "photo4")
	private String photo4;
	
	@Column(name = "photo5")
	private String photo5;

	public Idea(int id, String title, String idea, String userId, String date, String photo1, String photo2,
			String photo3, String photo4, String photo5) {
		super();
		this.id = id;
		this.title = title;
		this.idea = idea;
		this.userId = userId;
		this.date = date;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
		this.photo4 = photo4;
		this.photo5 = photo5;
	}

	public Idea() {
		super();
	}

	public Idea(String title, String idea, String userId, String date) {
		super();
		this.title = title;
		this.idea = idea;
		this.userId = userId;
		this.date = date;
	}

	public Idea(String title, String idea, String userId, String date, String photo1) {
		super();
		this.title = title;
		this.idea = idea;
		this.userId = userId;
		this.date = date;
		this.photo1 = photo1;
	}

	public Idea(String title, String idea, String userId, String date, String photo1, String photo2) {
		super();
		this.title = title;
		this.idea = idea;
		this.userId = userId;
		this.date = date;
		this.photo1 = photo1;
		this.photo2 = photo2;
	}

	public Idea(String title, String idea, String userId, String date, String photo1, String photo2, String photo3) {
		super();
		this.title = title;
		this.idea = idea;
		this.userId = userId;
		this.date = date;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
	}

	public Idea(String title, String idea, String userId, String date, String photo1, String photo2, String photo3,
			String photo4) {
		super();
		this.title = title;
		this.idea = idea;
		this.userId = userId;
		this.date = date;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
		this.photo4 = photo4;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getPhoto3() {
		return photo3;
	}

	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}

	public String getPhoto4() {
		return photo4;
	}

	public void setPhoto4(String photo4) {
		this.photo4 = photo4;
	}

	public String getPhoto5() {
		return photo5;
	}

	public void setPhoto5(String photo5) {
		this.photo5 = photo5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((idea == null) ? 0 : idea.hashCode());
		result = prime * result + ((photo1 == null) ? 0 : photo1.hashCode());
		result = prime * result + ((photo2 == null) ? 0 : photo2.hashCode());
		result = prime * result + ((photo3 == null) ? 0 : photo3.hashCode());
		result = prime * result + ((photo4 == null) ? 0 : photo4.hashCode());
		result = prime * result + ((photo5 == null) ? 0 : photo5.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Idea other = (Idea) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (idea == null) {
			if (other.idea != null)
				return false;
		} else if (!idea.equals(other.idea))
			return false;
		if (photo1 == null) {
			if (other.photo1 != null)
				return false;
		} else if (!photo1.equals(other.photo1))
			return false;
		if (photo2 == null) {
			if (other.photo2 != null)
				return false;
		} else if (!photo2.equals(other.photo2))
			return false;
		if (photo3 == null) {
			if (other.photo3 != null)
				return false;
		} else if (!photo3.equals(other.photo3))
			return false;
		if (photo4 == null) {
			if (other.photo4 != null)
				return false;
		} else if (!photo4.equals(other.photo4))
			return false;
		if (photo5 == null) {
			if (other.photo5 != null)
				return false;
		} else if (!photo5.equals(other.photo5))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Idea [id=" + id + ", title=" + title + ", idea=" + idea + ", userId=" + userId + ", date=" + date
				+ ", photo1=" + photo1 + ", photo2=" + photo2 + ", photo3=" + photo3 + ", photo4=" + photo4
				+ ", photo5=" + photo5 + "]";
	}
	
	
	
	
	
	
	

}
