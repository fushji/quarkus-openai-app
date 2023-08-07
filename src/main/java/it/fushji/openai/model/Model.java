package it.fushji.openai.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {
    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created")
    private Integer created;

    @JsonProperty("owned_by")
    private String ownedBy;

    @JsonProperty("root")
    private String root;

    @JsonProperty("parent")
    private String parent;

    public Model id(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Model object(String object) {
        this.object = object;
        return this;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Model created(Integer created) {
        this.created = created;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Model ownedBy(String ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
