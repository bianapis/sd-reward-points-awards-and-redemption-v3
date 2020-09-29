package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionExecuteOutputModel
 */
public class CRRewardPointsTransactionExecuteOutputModel   {
  private String rewardPointsTransactionParameterType = null;

  private String rewardPointsTransactionSelectedOption = null;

  private String rewardPointsTransactionStatus = null;

  private String rewardPointsTransactionExecuteActionTaskReference = null;

  private Object rewardPointsTransactionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reward Points Transaction instance execute service call 
   * @return rewardPointsTransactionExecuteActionTaskReference
  **/

  public String getRewardPointsTransactionExecuteActionTaskReference() {
    return rewardPointsTransactionExecuteActionTaskReference;
  }

  public void setRewardPointsTransactionExecuteActionTaskReference(String rewardPointsTransactionExecuteActionTaskReference) {
    this.rewardPointsTransactionExecuteActionTaskReference = rewardPointsTransactionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return rewardPointsTransactionExecuteActionTaskRecord
  **/

  public Object getRewardPointsTransactionExecuteActionTaskRecord() {
    return rewardPointsTransactionExecuteActionTaskRecord;
  }

  public void setRewardPointsTransactionExecuteActionTaskRecord(Object rewardPointsTransactionExecuteActionTaskRecord) {
    this.rewardPointsTransactionExecuteActionTaskRecord = rewardPointsTransactionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

