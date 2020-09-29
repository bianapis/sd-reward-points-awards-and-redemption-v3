package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedService;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveOutputModel
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveOutputModel   {
  private String rewardPointsAwardsAndRedemptionRetrieveActionTaskReference = null;

  private Object rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord = null;

  private String rewardPointsAwardsAndRedemptionRetrieveActionResponse = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord rewardPointsAwardsAndRedemptionRetrieveActionRecord = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedService rewardPointsAwardsAndRedemptionOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return rewardPointsAwardsAndRedemptionRetrieveActionTaskReference
  **/

  public String getRewardPointsAwardsAndRedemptionRetrieveActionTaskReference() {
    return rewardPointsAwardsAndRedemptionRetrieveActionTaskReference;
  }

  public void setRewardPointsAwardsAndRedemptionRetrieveActionTaskReference(String rewardPointsAwardsAndRedemptionRetrieveActionTaskReference) {
    this.rewardPointsAwardsAndRedemptionRetrieveActionTaskReference = rewardPointsAwardsAndRedemptionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord
  **/

  public Object getRewardPointsAwardsAndRedemptionRetrieveActionTaskRecord() {
    return rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord;
  }

  public void setRewardPointsAwardsAndRedemptionRetrieveActionTaskRecord(Object rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord) {
    this.rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord = rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return rewardPointsAwardsAndRedemptionRetrieveActionResponse
  **/

  public String getRewardPointsAwardsAndRedemptionRetrieveActionResponse() {
    return rewardPointsAwardsAndRedemptionRetrieveActionResponse;
  }

  public void setRewardPointsAwardsAndRedemptionRetrieveActionResponse(String rewardPointsAwardsAndRedemptionRetrieveActionResponse) {
    this.rewardPointsAwardsAndRedemptionRetrieveActionResponse = rewardPointsAwardsAndRedemptionRetrieveActionResponse;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionRetrieveActionRecord
   * @return rewardPointsAwardsAndRedemptionRetrieveActionRecord
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord getRewardPointsAwardsAndRedemptionRetrieveActionRecord() {
    return rewardPointsAwardsAndRedemptionRetrieveActionRecord;
  }

  public void setRewardPointsAwardsAndRedemptionRetrieveActionRecord(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord rewardPointsAwardsAndRedemptionRetrieveActionRecord) {
    this.rewardPointsAwardsAndRedemptionRetrieveActionRecord = rewardPointsAwardsAndRedemptionRetrieveActionRecord;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionOfferedService
   * @return rewardPointsAwardsAndRedemptionOfferedService
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedService getRewardPointsAwardsAndRedemptionOfferedService() {
    return rewardPointsAwardsAndRedemptionOfferedService;
  }

  public void setRewardPointsAwardsAndRedemptionOfferedService(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedService rewardPointsAwardsAndRedemptionOfferedService) {
    this.rewardPointsAwardsAndRedemptionOfferedService = rewardPointsAwardsAndRedemptionOfferedService;
  }


}

