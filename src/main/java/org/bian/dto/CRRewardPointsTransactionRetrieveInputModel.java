package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceAnalysis;
import org.bian.dto.CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionRetrieveInputModel
 */
public class CRRewardPointsTransactionRetrieveInputModel   {
  private Object rewardPointsTransactionRetrieveActionTaskRecord = null;

  private String rewardPointsTransactionRetrieveActionRequest = null;

  private CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceReportRecord rewardPointsTransactionInstanceReportRecord = null;

  private CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceAnalysis rewardPointsTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rewardPointsTransactionRetrieveActionTaskRecord
  **/

  public Object getRewardPointsTransactionRetrieveActionTaskRecord() {
    return rewardPointsTransactionRetrieveActionTaskRecord;
  }

  public void setRewardPointsTransactionRetrieveActionTaskRecord(Object rewardPointsTransactionRetrieveActionTaskRecord) {
    this.rewardPointsTransactionRetrieveActionTaskRecord = rewardPointsTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rewardPointsTransactionRetrieveActionRequest
  **/

  public String getRewardPointsTransactionRetrieveActionRequest() {
    return rewardPointsTransactionRetrieveActionRequest;
  }

  public void setRewardPointsTransactionRetrieveActionRequest(String rewardPointsTransactionRetrieveActionRequest) {
    this.rewardPointsTransactionRetrieveActionRequest = rewardPointsTransactionRetrieveActionRequest;
  }


  /**
   * Get rewardPointsTransactionInstanceReportRecord
   * @return rewardPointsTransactionInstanceReportRecord
  **/

  public CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceReportRecord getRewardPointsTransactionInstanceReportRecord() {
    return rewardPointsTransactionInstanceReportRecord;
  }

  public void setRewardPointsTransactionInstanceReportRecord(CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceReportRecord rewardPointsTransactionInstanceReportRecord) {
    this.rewardPointsTransactionInstanceReportRecord = rewardPointsTransactionInstanceReportRecord;
  }


  /**
   * Get rewardPointsTransactionInstanceAnalysis
   * @return rewardPointsTransactionInstanceAnalysis
  **/

  public CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceAnalysis getRewardPointsTransactionInstanceAnalysis() {
    return rewardPointsTransactionInstanceAnalysis;
  }

  public void setRewardPointsTransactionInstanceAnalysis(CRRewardPointsTransactionRetrieveInputModelRewardPointsTransactionInstanceAnalysis rewardPointsTransactionInstanceAnalysis) {
    this.rewardPointsTransactionInstanceAnalysis = rewardPointsTransactionInstanceAnalysis;
  }


}

