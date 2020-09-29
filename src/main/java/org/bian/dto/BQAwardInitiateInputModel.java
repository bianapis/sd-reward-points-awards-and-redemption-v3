package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAwardInitiateInputModel
 */
public class BQAwardInitiateInputModel   {
  private String rewardPointsTransactionInstanceReference = null;

  private Object awardInitiateActionRecord = null;

  private String awardPreconditions = null;

  private String awardTaskSchedule = null;

  private String awards = null;

  private String awardPostconditions = null;

  private String awardAwardsServiceType = null;

  private String awardAwardsServiceDescription = null;

  private String awardAwardsServiceInputsandOuputs = null;

  private String awardAwardsServiceWorkProduct = null;


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
   * @return awardInitiateActionRecord
  **/

  public Object getAwardInitiateActionRecord() {
    return awardInitiateActionRecord;
  }

  public void setAwardInitiateActionRecord(Object awardInitiateActionRecord) {
    this.awardInitiateActionRecord = awardInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return awardPreconditions
  **/

  public String getAwardPreconditions() {
    return awardPreconditions;
  }

  public void setAwardPreconditions(String awardPreconditions) {
    this.awardPreconditions = awardPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return awardTaskSchedule
  **/

  public String getAwardTaskSchedule() {
    return awardTaskSchedule;
  }

  public void setAwardTaskSchedule(String awardTaskSchedule) {
    this.awardTaskSchedule = awardTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Reward Points Transaction specific Business Service 
   * @return awards
  **/

  public String getAwards() {
    return awards;
  }

  public void setAwards(String awards) {
    this.awards = awards;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return awardPostconditions
  **/

  public String getAwardPostconditions() {
    return awardPostconditions;
  }

  public void setAwardPostconditions(String awardPostconditions) {
    this.awardPostconditions = awardPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return awardAwardsServiceType
  **/

  public String getAwardAwardsServiceType() {
    return awardAwardsServiceType;
  }

  public void setAwardAwardsServiceType(String awardAwardsServiceType) {
    this.awardAwardsServiceType = awardAwardsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return awardAwardsServiceDescription
  **/

  public String getAwardAwardsServiceDescription() {
    return awardAwardsServiceDescription;
  }

  public void setAwardAwardsServiceDescription(String awardAwardsServiceDescription) {
    this.awardAwardsServiceDescription = awardAwardsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return awardAwardsServiceInputsandOuputs
  **/

  public String getAwardAwardsServiceInputsandOuputs() {
    return awardAwardsServiceInputsandOuputs;
  }

  public void setAwardAwardsServiceInputsandOuputs(String awardAwardsServiceInputsandOuputs) {
    this.awardAwardsServiceInputsandOuputs = awardAwardsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return awardAwardsServiceWorkProduct
  **/

  public String getAwardAwardsServiceWorkProduct() {
    return awardAwardsServiceWorkProduct;
  }

  public void setAwardAwardsServiceWorkProduct(String awardAwardsServiceWorkProduct) {
    this.awardAwardsServiceWorkProduct = awardAwardsServiceWorkProduct;
  }


}

