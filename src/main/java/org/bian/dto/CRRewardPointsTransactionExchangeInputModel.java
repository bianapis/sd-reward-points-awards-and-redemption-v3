package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRewardPointsTransactionExchangeInputModelRewardPointsTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRRewardPointsTransactionExchangeInputModel
 */
public class CRRewardPointsTransactionExchangeInputModel   {
  private String rewardPointsAwardsAndRedemptionServicingSessionReference = null;

  private String rewardPointsTransactionInstanceReference = null;

  private String rewardPointsTransactionParameterType = null;

  private String rewardPointsTransactionSelectedOption = null;

  private String rewardPointsTransactionStatus = null;

  private String rewardPointsTransactionType = null;

  private String rewardPointsTransactionTransactionType = null;

  private Object rewardPointsTransactionExchangeActionTaskRecord = null;

  private CRRewardPointsTransactionExchangeInputModelRewardPointsTransactionExchangeActionRequest rewardPointsTransactionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return rewardPointsAwardsAndRedemptionServicingSessionReference
  **/

  public String getRewardPointsAwardsAndRedemptionServicingSessionReference() {
    return rewardPointsAwardsAndRedemptionServicingSessionReference;
  }

  public void setRewardPointsAwardsAndRedemptionServicingSessionReference(String rewardPointsAwardsAndRedemptionServicingSessionReference) {
    this.rewardPointsAwardsAndRedemptionServicingSessionReference = rewardPointsAwardsAndRedemptionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reward Points Transaction instance 
   * @return rewardPointsTransactionInstanceReference
  **/

  public String getRewardPointsTransactionInstanceReference() {
    return rewardPointsTransactionInstanceReference;
  }

  public void setRewardPointsTransactionInstanceReference(String rewardPointsTransactionInstanceReference) {
    this.rewardPointsTransactionInstanceReference = rewardPointsTransactionInstanceReference;
  }


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
   * Get rewardPointsTransactionExchangeActionRequest
   * @return rewardPointsTransactionExchangeActionRequest
  **/

  public CRRewardPointsTransactionExchangeInputModelRewardPointsTransactionExchangeActionRequest getRewardPointsTransactionExchangeActionRequest() {
    return rewardPointsTransactionExchangeActionRequest;
  }

  public void setRewardPointsTransactionExchangeActionRequest(CRRewardPointsTransactionExchangeInputModelRewardPointsTransactionExchangeActionRequest rewardPointsTransactionExchangeActionRequest) {
    this.rewardPointsTransactionExchangeActionRequest = rewardPointsTransactionExchangeActionRequest;
  }


}

