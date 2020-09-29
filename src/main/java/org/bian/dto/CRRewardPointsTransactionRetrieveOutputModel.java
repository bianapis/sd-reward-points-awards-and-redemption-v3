package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceAnalysis;
import org.bian.dto.CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionRetrieveOutputModel
 */
public class CRRewardPointsTransactionRetrieveOutputModel   {
  private String rewardPointsTransactionParameterType = null;

  private String rewardPointsTransactionSelectedOption = null;

  private String rewardPointsTransactionStatus = null;

  private String rewardPointsTransactionType = null;

  private String rewardPointsTransactionTransactionType = null;

  private String rewardPointsTransactionRetrieveActionTaskReference = null;

  private Object rewardPointsTransactionRetrieveActionTaskRecord = null;

  private String rewardPointsTransactionRetrieveActionResponse = null;

  private CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceReportRecord rewardPointsTransactionInstanceReportRecord = null;

  private CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceAnalysis rewardPointsTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between business service transaction within Reward Points Transaction 
   * @return rewardPointsTransactionParameterType
  **/

  public String getRewardPointsTransactionParameterType() {
    return rewardPointsTransactionParameterType;
  }

  public void setRewardPointsTransactionParameterType(String rewardPointsTransactionParameterType) {
    this.rewardPointsTransactionParameterType = rewardPointsTransactionParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Reward Points Transaction 
   * @return rewardPointsTransactionSelectedOption
  **/

  public String getRewardPointsTransactionSelectedOption() {
    return rewardPointsTransactionSelectedOption;
  }

  public void setRewardPointsTransactionSelectedOption(String rewardPointsTransactionSelectedOption) {
    this.rewardPointsTransactionSelectedOption = rewardPointsTransactionSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Reward Points Transaction 
   * @return rewardPointsTransactionStatus
  **/

  public String getRewardPointsTransactionStatus() {
    return rewardPointsTransactionStatus;
  }

  public void setRewardPointsTransactionStatus(String rewardPointsTransactionStatus) {
    this.rewardPointsTransactionStatus = rewardPointsTransactionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of business action for this Reward Points Transaction 
   * @return rewardPointsTransactionType
  **/

  public String getRewardPointsTransactionType() {
    return rewardPointsTransactionType;
  }

  public void setRewardPointsTransactionType(String rewardPointsTransactionType) {
    this.rewardPointsTransactionType = rewardPointsTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of transaction for this Reward Points Transaction 
   * @return rewardPointsTransactionTransactionType
  **/

  public String getRewardPointsTransactionTransactionType() {
    return rewardPointsTransactionTransactionType;
  }

  public void setRewardPointsTransactionTransactionType(String rewardPointsTransactionTransactionType) {
    this.rewardPointsTransactionTransactionType = rewardPointsTransactionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reward Points Transaction instance retrieve service call 
   * @return rewardPointsTransactionRetrieveActionTaskReference
  **/

  public String getRewardPointsTransactionRetrieveActionTaskReference() {
    return rewardPointsTransactionRetrieveActionTaskReference;
  }

  public void setRewardPointsTransactionRetrieveActionTaskReference(String rewardPointsTransactionRetrieveActionTaskReference) {
    this.rewardPointsTransactionRetrieveActionTaskReference = rewardPointsTransactionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return rewardPointsTransactionRetrieveActionResponse
  **/

  public String getRewardPointsTransactionRetrieveActionResponse() {
    return rewardPointsTransactionRetrieveActionResponse;
  }

  public void setRewardPointsTransactionRetrieveActionResponse(String rewardPointsTransactionRetrieveActionResponse) {
    this.rewardPointsTransactionRetrieveActionResponse = rewardPointsTransactionRetrieveActionResponse;
  }


  /**
   * Get rewardPointsTransactionInstanceReportRecord
   * @return rewardPointsTransactionInstanceReportRecord
  **/

  public CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceReportRecord getRewardPointsTransactionInstanceReportRecord() {
    return rewardPointsTransactionInstanceReportRecord;
  }

  public void setRewardPointsTransactionInstanceReportRecord(CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceReportRecord rewardPointsTransactionInstanceReportRecord) {
    this.rewardPointsTransactionInstanceReportRecord = rewardPointsTransactionInstanceReportRecord;
  }


  /**
   * Get rewardPointsTransactionInstanceAnalysis
   * @return rewardPointsTransactionInstanceAnalysis
  **/

  public CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceAnalysis getRewardPointsTransactionInstanceAnalysis() {
    return rewardPointsTransactionInstanceAnalysis;
  }

  public void setRewardPointsTransactionInstanceAnalysis(CRRewardPointsTransactionRetrieveOutputModelRewardPointsTransactionInstanceAnalysis rewardPointsTransactionInstanceAnalysis) {
    this.rewardPointsTransactionInstanceAnalysis = rewardPointsTransactionInstanceAnalysis;
  }


}

