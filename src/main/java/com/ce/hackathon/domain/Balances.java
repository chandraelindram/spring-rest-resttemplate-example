
package com.ce.hackathon.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "available",
    "effectiveDate",
    "current",
    "creditLimit",
    "overdrafts",
    "averageMonthly",
    "closingStatement",
    "openingStatement",
    "minimumStatement",
    "previousStatement",
    "escrow",
    "principal",
    "interest"
})
public class Balances {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("available")
    private String available;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("current")
    private String current;
    @JsonProperty("creditLimit")
    private String creditLimit;
    @JsonProperty("overdrafts")
    private List<Overdraft> overdrafts = null;
    @JsonProperty("averageMonthly")
    private String averageMonthly;
    @JsonProperty("closingStatement")
    private String closingStatement;
    @JsonProperty("openingStatement")
    private String openingStatement;
    @JsonProperty("minimumStatement")
    private String minimumStatement;
    @JsonProperty("previousStatement")
    private String previousStatement;
    @JsonProperty("escrow")
    private String escrow;
    @JsonProperty("principal")
    private String principal;
    @JsonProperty("interest")
    private String interest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("available")
    public String getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(String available) {
        this.available = available;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("current")
    public String getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(String current) {
        this.current = current;
    }

    @JsonProperty("creditLimit")
    public String getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("creditLimit")
    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("overdrafts")
    public List<Overdraft> getOverdrafts() {
        return overdrafts;
    }

    @JsonProperty("overdrafts")
    public void setOverdrafts(List<Overdraft> overdrafts) {
        this.overdrafts = overdrafts;
    }

    @JsonProperty("averageMonthly")
    public String getAverageMonthly() {
        return averageMonthly;
    }

    @JsonProperty("averageMonthly")
    public void setAverageMonthly(String averageMonthly) {
        this.averageMonthly = averageMonthly;
    }

    @JsonProperty("closingStatement")
    public String getClosingStatement() {
        return closingStatement;
    }

    @JsonProperty("closingStatement")
    public void setClosingStatement(String closingStatement) {
        this.closingStatement = closingStatement;
    }

    @JsonProperty("openingStatement")
    public String getOpeningStatement() {
        return openingStatement;
    }

    @JsonProperty("openingStatement")
    public void setOpeningStatement(String openingStatement) {
        this.openingStatement = openingStatement;
    }

    @JsonProperty("minimumStatement")
    public String getMinimumStatement() {
        return minimumStatement;
    }

    @JsonProperty("minimumStatement")
    public void setMinimumStatement(String minimumStatement) {
        this.minimumStatement = minimumStatement;
    }

    @JsonProperty("previousStatement")
    public String getPreviousStatement() {
        return previousStatement;
    }

    @JsonProperty("previousStatement")
    public void setPreviousStatement(String previousStatement) {
        this.previousStatement = previousStatement;
    }

    @JsonProperty("escrow")
    public String getEscrow() {
        return escrow;
    }

    @JsonProperty("escrow")
    public void setEscrow(String escrow) {
        this.escrow = escrow;
    }

    @JsonProperty("principal")
    public String getPrincipal() {
        return principal;
    }

    @JsonProperty("principal")
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @JsonProperty("interest")
    public String getInterest() {
        return interest;
    }

    @JsonProperty("interest")
    public void setInterest(String interest) {
        this.interest = interest;
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
