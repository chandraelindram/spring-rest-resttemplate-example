
package com.ce.hackathon.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "displayNumber",
    "externalNumber",
    "routingNumber"
})
public class AccountNumber {

    @JsonProperty("displayNumber")
    private String displayNumber;
    @JsonProperty("externalNumber")
    private String externalNumber;
    @JsonProperty("routingNumber")
    private String routingNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayNumber")
    public String getDisplayNumber() {
        return displayNumber;
    }

    @JsonProperty("displayNumber")
    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }

    @JsonProperty("externalNumber")
    public String getExternalNumber() {
        return externalNumber;
    }

    @JsonProperty("externalNumber")
    public void setExternalNumber(String externalNumber) {
        this.externalNumber = externalNumber;
    }

    @JsonProperty("routingNumber")
    public String getRoutingNumber() {
        return routingNumber;
    }

    @JsonProperty("routingNumber")
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
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
