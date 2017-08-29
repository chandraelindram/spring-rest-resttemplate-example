
package com.ce.hackathon.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overdraftId",
    "overdraftDisplayNumber",
    "available",
    "limit"
})
public class Overdraft {

    @JsonProperty("overdraftId")
    private String overdraftId;
    @JsonProperty("overdraftDisplayNumber")
    private String overdraftDisplayNumber;
    @JsonProperty("available")
    private String available;
    @JsonProperty("limit")
    private String limit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("overdraftId")
    public String getOverdraftId() {
        return overdraftId;
    }

    @JsonProperty("overdraftId")
    public void setOverdraftId(String overdraftId) {
        this.overdraftId = overdraftId;
    }

    @JsonProperty("overdraftDisplayNumber")
    public String getOverdraftDisplayNumber() {
        return overdraftDisplayNumber;
    }

    @JsonProperty("overdraftDisplayNumber")
    public void setOverdraftDisplayNumber(String overdraftDisplayNumber) {
        this.overdraftDisplayNumber = overdraftDisplayNumber;
    }

    @JsonProperty("available")
    public String getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(String available) {
        this.available = available;
    }

    @JsonProperty("limit")
    public String getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(String limit) {
        this.limit = limit;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
