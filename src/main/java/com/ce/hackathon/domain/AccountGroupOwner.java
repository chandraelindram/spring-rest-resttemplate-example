
package com.ce.hackathon.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ownerUserId",
    "ownerUserType",
    "ownerNameFull"
})
public class AccountGroupOwner {

    @JsonProperty("ownerUserId")
    private String ownerUserId;
    @JsonProperty("ownerUserType")
    private String ownerUserType;
    @JsonProperty("ownerNameFull")
    private String ownerNameFull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ownerUserId")
    public String getOwnerUserId() {
        return ownerUserId;
    }

    @JsonProperty("ownerUserId")
    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    @JsonProperty("ownerUserType")
    public String getOwnerUserType() {
        return ownerUserType;
    }

    @JsonProperty("ownerUserType")
    public void setOwnerUserType(String ownerUserType) {
        this.ownerUserType = ownerUserType;
    }

    @JsonProperty("ownerNameFull")
    public String getOwnerNameFull() {
        return ownerNameFull;
    }

    @JsonProperty("ownerNameFull")
    public void setOwnerNameFull(String ownerNameFull) {
        this.ownerNameFull = ownerNameFull;
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
