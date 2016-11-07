package com.senacor.model;

/**
 * Created by Marynasuprun on 07.11.2016.
 */
import org.springframework.data.annotation.Id;

/**
 * Created by Marynasuprun on 07.11.2016.
 */
public class Role {

    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
