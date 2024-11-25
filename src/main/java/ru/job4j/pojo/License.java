package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class License {
	private String owner;
    private String model;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

	@Override
	public int hashCode() {
		return Objects.hash(code, created, model, owner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		License other = (License) obj;
		return Objects.equals(code, other.code) 
				&& Objects.equals(created, other.created)
				&& Objects.equals(model, other.model) 
				&& Objects.equals(owner, other.owner);
	}
    
}
