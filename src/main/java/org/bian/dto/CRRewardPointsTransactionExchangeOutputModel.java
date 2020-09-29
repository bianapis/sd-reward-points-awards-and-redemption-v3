package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionExchangeOutputModel
 */
public class CRRewardPointsTransactionExchangeOutputModel   {
  private String rewardPointsTransactionParameterType = null;

  private String rewardPointsTransactionSelectedOption = null;

  private String rewardPointsTransactionStatus = null;

  private String rewardPointsTransactionExchangeActionTaskReference = null;

  private Object rewardPointsTransactionExchangeActionTaskRecord = null;

  private String rewardPointsTransactionExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reward Points Transaction instance exchange service call 
   * @return rewardPointsTransactionExchangeActionTaskReference
  **/

  public String getRewardPointsTransactionExchangeActionTaskReference() {
    return rewardPointsTransactionExchangeActionTaskReference;
  }

  public void setRewardPointsTransactionExchangeActionTaskReference(String rewardPointsTransactionExchangeActionTaskReference) {
    this.rewardPointsTransactionExchangeActionTaskReference = rewardPointsTransactionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return rewardPointsTransactionExchangeActionTaskRecord
  **/

  public Object getRewardPointsTransactionExchangeActionTaskRecord() {
    return rewardPointsTransactionExchangeActionTaskRecord;
  }

  public void setRewardPointsTransactionExchangeActionTaskRecord(Object rewardPointsTransactionExchangeActionTaskRecord) {
    this.rewardPointsTransactionExchangeActionTaskRecord = rewardPointsTransactionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return rewardPointsTransactionExchangeActionResponse
  **/

  public String getRewardPointsTransactionExchangeActionResponse() {
    return rewardPointsTransactionExchangeActionResponse;
  }

  public void setRewardPointsTransactionExchangeActionResponse(String rewardPointsTransactionExchangeActionResponse) {
    this.rewardPointsTransactionExchangeActionResponse = rewardPointsTransactionExchangeActionResponse;
  }


}

