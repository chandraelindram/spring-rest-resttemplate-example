
package com.ce.hackathon.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountId",
    "authId",
    "accountGroupId",
    "accountGroupIdType",
    "accountGroupOwnershipType",
    "accountGroupOwner",
    "accountNumber",
    "micrNumbers",
    "accountType",
    "nickname",
    "description",
    "status",
    "openDate",
    "closeDate",
    "balances"
})
public class Account {

    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("authId")
    private String authId;
    @JsonProperty("accountGroupId")
    private String accountGroupId;
    @JsonProperty("accountGroupIdType")
    private String accountGroupIdType;
    @JsonProperty("accountGroupOwnershipType")
    private String accountGroupOwnershipType;
    @JsonProperty("accountGroupOwner")
    private AccountGroupOwner accountGroupOwner;
    @JsonProperty("accountNumber")
    private AccountNumber accountNumber;
    @JsonProperty("micrNumbers")
    private List<MicrNumber> micrNumbers = null;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private String status;
    @JsonProperty("openDate")
    private String openDate;
    @JsonProperty("closeDate")
    private String closeDate;
    @JsonProperty("balances")
    private Balances balances;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("authId")
    public String getAuthId() {
        return authId;
    }

    @JsonProperty("authId")
    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @JsonProperty("accountGroupId")
    public String getAccountGroupId() {
        return accountGroupId;
    }

    @JsonProperty("accountGroupId")
    public void setAccountGroupId(String accountGroupId) {
        this.accountGroupId = accountGroupId;
    }

    @JsonProperty("accountGroupIdType")
    public String getAccountGroupIdType() {
        return accountGroupIdType;
    }

    @JsonProperty("accountGroupIdType")
    public void setAccountGroupIdType(String accountGroupIdType) {
        this.accountGroupIdType = accountGroupIdType;
    }

    @JsonProperty("accountGroupOwnershipType")
    public String getAccountGroupOwnershipType() {
        return accountGroupOwnershipType;
    }

    @JsonProperty("accountGroupOwnershipType")
    public void setAccountGroupOwnershipType(String accountGroupOwnershipType) {
        this.accountGroupOwnershipType = accountGroupOwnershipType;
    }

    @JsonProperty("accountGroupOwner")
    public AccountGroupOwner getAccountGroupOwner() {
        return accountGroupOwner;
    }

    @JsonProperty("accountGroupOwner")
    public void setAccountGroupOwner(AccountGroupOwner accountGroupOwner) {
        this.accountGroupOwner = accountGroupOwner;
    }

    @JsonProperty("accountNumber")
    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("micrNumbers")
    public List<MicrNumber> getMicrNumbers() {
        return micrNumbers;
    }

    @JsonProperty("micrNumbers")
    public void setMicrNumbers(List<MicrNumber> micrNumbers) {
        this.micrNumbers = micrNumbers;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("openDate")
    public String getOpenDate() {
        return openDate;
    }

    @JsonProperty("openDate")
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    @JsonProperty("closeDate")
    public String getCloseDate() {
        return closeDate;
    }

    @JsonProperty("closeDate")
    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    @JsonProperty("balances")
    public Balances getBalances() {
        return balances;
    }

    @JsonProperty("balances")
    public void setBalances(Balances balances) {
        this.balances = balances;
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
