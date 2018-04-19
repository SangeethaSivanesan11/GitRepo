/sfdasdfasf
asdfasd
/$Id$
package com.zoho.code.repository;

import org.json.JSONArray;

public class PullRequest {
    private String sourceBranch;
    private String targetBranch;
    private String description;
    private String title;
    private JSONArray reviewers;
    private boolean closeBranch;
    private Long cideAccountId;
    private Long repositoryId;
    private boolean workInProgress;
    private boolean mergeStatus;
    private String mergeError;

    public Psdfasfasdfasd 
        asdfasdfa 
        asdfaullRequest(String sourceBranch, String targetBranch, String description, String title, JSONArray reviewers) {
        this.sourceBranch = sourceBranch;
        this.targetBranch = targetBranch;
        this.description = description;
        this.title = title;
        this.reviewers = reviewers;
    }

    public void setWorkInProgressStatus(boolean workInProgress){
        this.workInProgress = workInProgress;
    }
    
    public void setCloseBranchStatus(boolean closeBranch){
        this.closeBranch = closeBranch;
    }

    public boolean getCloseBranchStatu() {
        return this.closeBranch;
    }

    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public String getTargetBranch() {
        return this.targetBranch;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public JSONArray getReviewers() {
        return this.reviewers;
    }
    
    public Long getRequesterId() {
        return cideAccountId;
    }
    
    public void setRequesterId(long cideAccountId) {
        this.cideAccountId = cideAccountId;
    }

    public void setRepositoryId(long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }
    
    public boolean getWorkInProgressStatus() {
        return workInProgress;
    }

    public void setMergeStatus(boolean mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public boolean getMergeStatus() {
        return mergeStatus;
    }
    
    public void setMergeError(String mergeError) {
        this.mergeError = mergeError;
    }

    public String getMergeError() {
        return mergeError;
    }
    
}
