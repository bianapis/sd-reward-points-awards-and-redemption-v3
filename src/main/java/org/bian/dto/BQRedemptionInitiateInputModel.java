package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRedemptionInitiateInputModel
 */
public class BQRedemptionInitiateInputModel   {
  private String rewardPointsTransactionInstanceReference = null;

  private Object redemptionInitiateActionRecord = null;

  private String redemptionPreconditions = null;

  private String redemptionTaskSchedule = null;

  private String awardsRedemption = null;

  private String redemptionPostconditions = null;

  private String redemptionAwardsRedemptionServiceType = null;

  private String redemptionAwardsRedemptionServiceDescription = null;

  private String redemptionAwardsRedemptionServiceInputsandOuputs = null;

  private String redemptionAwardsRedemptionServiceWorkProduct = null;

  private String redemptionAwardsRedemptionServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Reward Points Transaction instance 
   * @return rewardPointsTransactionInstanceReference
  **/

  public String getRewardPointsTransactionInstanceReference() {
    return rewardPointsTransactionInstanceReference;
  }

  public void setRewardPointsTransactionInstanceReference(String rewardPointsTransactionInstanceReference) {
    this.rewardPointsTransactionInstanceReference = rewardPointsTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return redemptionInitiateActionRecord
  **/

  public Object getRedemptionInitiateActionRecord() {
    return redemptionInitiateActionRecord;
  }

  public void setRedemptionInitiateActionRecord(Object redemptionInitiateActionRecord) {
    this.redemptionInitiateActionRecord = redemptionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return redemptionPreconditions
  **/

  public String getRedemptionPreconditions() {
    return redemptionPreconditions;
  }

  public void setRedemptionPreconditions(String redemptionPreconditions) {
    this.redemptionPreconditions = redemptionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return redemptionTaskSchedule
  **/

  public String getRedemptionTaskSchedule() {
    return redemptionTaskSchedule;
  }

  public void setRedemptionTaskSchedule(String redemptionTaskSchedule) {
    this.redemptionTaskSchedule = redemptionTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Reward Points Transaction specific Business Service 
   * @return awardsRedemption
  **/

  public String getAwardsRedemption() {
    return awardsRedemption;
  }

  public void setAwardsRedemption(String awardsRedemption) {
    this.awardsRedemption = awardsRedemption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return redemptionPostconditions
  **/

  public String getRedemptionPostconditions() {
    return redemptionPostconditions;
  }

  public void setRedemptionPostconditions(String redemptionPostconditions) {
    this.redemptionPostconditions = redemptionPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return redemptionAwardsRedemptionServiceType
  **/

  public String getRedemptionAwardsRedemptionServiceType() {
    return redemptionAwardsRedemptionServiceType;
  }

  public void setRedemptionAwardsRedemptionServiceType(String redemptionAwardsRedemptionServiceType) {
    this.redemptionAwardsRedemptionServiceType = redemptionAwardsRedemptionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return redemptionAwardsRedemptionServiceDescription
  **/

  public String getRedemptionAwardsRedemptionServiceDescription() {
    return redemptionAwardsRedemptionServiceDescription;
  }

  public void setRedemptionAwardsRedemptionServiceDescription(String redemptionAwardsRedemptionServiceDescription) {
    this.redemptionAwardsRedemptionServiceDescription = redemptionAwardsRedemptionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return redemptionAwardsRedemptionServiceInputsandOuputs
  **/

  public String getRedemptionAwardsRedemptionServiceInputsandOuputs() {
    return redemptionAwardsRedemptionServiceInputsandOuputs;
  }

  public void setRedemptionAwardsRedemptionServiceInputsandOuputs(String redemptionAwardsRedemptionServiceInputsandOuputs) {
    this.redemptionAwardsRedemptionServiceInputsandOuputs = redemptionAwardsRedemptionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return redemptionAwardsRedemptionServiceWorkProduct
  **/

  public String getRedemptionAwardsRedemptionServiceWorkProduct() {
    return redemptionAwardsRedemptionServiceWorkProduct;
  }

  public void setRedemptionAwardsRedemptionServiceWorkProduct(String redemptionAwardsRedemptionServiceWorkProduct) {
    this.redemptionAwardsRedemptionServiceWorkProduct = redemptionAwardsRedemptionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return redemptionAwardsRedemptionServiceName
  **/

  public String getRedemptionAwardsRedemptionServiceName() {
    return redemptionAwardsRedemptionServiceName;
  }

  public void setRedemptionAwardsRedemptionServiceName(String redemptionAwardsRedemptionServiceName) {
    this.redemptionAwardsRedemptionServiceName = redemptionAwardsRedemptionServiceName;
  }


}

