package it.fushji.openai.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateImageResponse {

    @JsonProperty("created")
    private Integer created;

    @JsonProperty("data")
    private List<Item> urls;

    public List<Item> getUrls() {
        return urls;
    }

    public void setUrls(List<Item> urls) {
        this.urls = urls;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}
