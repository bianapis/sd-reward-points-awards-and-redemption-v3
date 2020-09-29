package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedService;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveInputModel
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveInputModel   {
  private Object rewardPointsAwardsAndRedemptionRetrieveActionTaskRecord = null;

  private String rewardPointsAwardsAndRedemptionRetrieveActionRequest = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord rewardPointsAwardsAndRedemptionRetrieveActionRecord = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedService rewardPointsAwardsAndRedemptionOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rewardPointsAwardsAndRedemptionRetrieveActionRequest
  **/

  public String getRewardPointsAwardsAndRedemptionRetrieveActionRequest() {
    return rewardPointsAwardsAndRedemptionRetrieveActionRequest;
  }

  public void setRewardPointsAwardsAndRedemptionRetrieveActionRequest(String rewardPointsAwardsAndRedemptionRetrieveActionRequest) {
    this.rewardPointsAwardsAndRedemptionRetrieveActionRequest = rewardPointsAwardsAndRedemptionRetrieveActionRequest;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionRetrieveActionRecord
   * @return rewardPointsAwardsAndRedemptionRetrieveActionRecord
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord getRewardPointsAwardsAndRedemptionRetrieveActionRecord() {
    return rewardPointsAwardsAndRedemptionRetrieveActionRecord;
  }

  public void setRewardPointsAwardsAndRedemptionRetrieveActionRecord(SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionRetrieveActionRecord rewardPointsAwardsAndRedemptionRetrieveActionRecord) {
    this.rewardPointsAwardsAndRedemptionRetrieveActionRecord = rewardPointsAwardsAndRedemptionRetrieveActionRecord;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionOfferedService
   * @return rewardPointsAwardsAndRedemptionOfferedService
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedService getRewardPointsAwardsAndRedemptionOfferedService() {
    return rewardPointsAwardsAndRedemptionOfferedService;
  }

  public void setRewardPointsAwardsAndRedemptionOfferedService(SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedService rewardPointsAwardsAndRedemptionOfferedService) {
    this.rewardPointsAwardsAndRedemptionOfferedService = rewardPointsAwardsAndRedemptionOfferedService;
  }


}

