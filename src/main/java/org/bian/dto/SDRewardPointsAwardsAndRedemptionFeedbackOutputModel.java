package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionFeedbackOutputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionFeedbackOutputModel
 */
public class SDRewardPointsAwardsAndRedemptionFeedbackOutputModel   {
  private String rewardPointsAwardsAndRedemptionFeedbackActionTaskReference = null;

  private Object rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord = null;

  private SDRewardPointsAwardsAndRedemptionFeedbackOutputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord rewardPointsAwardsAndRedemptionFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return rewardPointsAwardsAndRedemptionFeedbackActionTaskReference
  **/

  public String getRewardPointsAwardsAndRedemptionFeedbackActionTaskReference() {
    return rewardPointsAwardsAndRedemptionFeedbackActionTaskReference;
  }

  public void setRewardPointsAwardsAndRedemptionFeedbackActionTaskReference(String rewardPointsAwardsAndRedemptionFeedbackActionTaskReference) {
    this.rewardPointsAwardsAndRedemptionFeedbackActionTaskReference = rewardPointsAwardsAndRedemptionFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord
  **/

  public Object getRewardPointsAwardsAndRedemptionFeedbackActionTaskRecord() {
    return rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord;
  }

  public void setRewardPointsAwardsAndRedemptionFeedbackActionTaskRecord(Object rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord) {
    this.rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord = rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionFeedbackActionRecord
   * @return rewardPointsAwardsAndRedemptionFeedbackActionRecord
  **/

  public SDRewardPointsAwardsAndRedemptionFeedbackOutputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord getRewardPointsAwardsAndRedemptionFeedbackActionRecord() {
    return rewardPointsAwardsAndRedemptionFeedbackActionRecord;
  }

  public void setRewardPointsAwardsAndRedemptionFeedbackActionRecord(SDRewardPointsAwardsAndRedemptionFeedbackOutputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord rewardPointsAwardsAndRedemptionFeedbackActionRecord) {
    this.rewardPointsAwardsAndRedemptionFeedbackActionRecord = rewardPointsAwardsAndRedemptionFeedbackActionRecord;
  }


}

