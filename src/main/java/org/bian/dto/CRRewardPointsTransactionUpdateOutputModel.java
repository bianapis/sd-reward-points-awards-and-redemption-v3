package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionUpdateOutputModel
 */
public class CRRewardPointsTransactionUpdateOutputModel   {
  private String rewardPointsTransactionParameterType = null;

  private String rewardPointsTransactionSelectedOption = null;

  private String rewardPointsTransactionStatus = null;

  private String rewardPointsTransactionUpdateActionTaskReference = null;

  private Object rewardPointsTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return rewardPointsTransactionUpdateActionTaskReference
  **/

  public String getRewardPointsTransactionUpdateActionTaskReference() {
    return rewardPointsTransactionUpdateActionTaskReference;
  }

  public void setRewardPointsTransactionUpdateActionTaskReference(String rewardPointsTransactionUpdateActionTaskReference) {
    this.rewardPointsTransactionUpdateActionTaskReference = rewardPointsTransactionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return rewardPointsTransactionUpdateActionTaskRecord
  **/

  public Object getRewardPointsTransactionUpdateActionTaskRecord() {
    return rewardPointsTransactionUpdateActionTaskRecord;
  }

  public void setRewardPointsTransactionUpdateActionTaskRecord(Object rewardPointsTransactionUpdateActionTaskRecord) {
    this.rewardPointsTransactionUpdateActionTaskRecord = rewardPointsTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

