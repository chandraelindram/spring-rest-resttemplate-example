
package com.ce.hackathon.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "micrNumber",
    "routingNumber",
    "isPrimary"
})
public class MicrNumber {

    @JsonProperty("micrNumber")
    private String micrNumber;
    @JsonProperty("routingNumber")
    private String routingNumber;
    @JsonProperty("isPrimary")
    private String isPrimary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("micrNumber")
    public String getMicrNumber() {
        return micrNumber;
    }

    @JsonProperty("micrNumber")
    public void setMicrNumber(String micrNumber) {
        this.micrNumber = micrNumber;
    }

    @JsonProperty("routingNumber")
    public String getRoutingNumber() {
        return routingNumber;
    }

    @JsonProperty("routingNumber")
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    @JsonProperty("isPrimary")
    public String getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
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
