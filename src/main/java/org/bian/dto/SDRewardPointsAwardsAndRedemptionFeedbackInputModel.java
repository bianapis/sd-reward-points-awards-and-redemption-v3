package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionFeedbackInputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionFeedbackInputModel
 */
public class SDRewardPointsAwardsAndRedemptionFeedbackInputModel   {
  private Object rewardPointsAwardsAndRedemptionFeedbackActionTaskRecord = null;

  private SDRewardPointsAwardsAndRedemptionFeedbackInputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord rewardPointsAwardsAndRedemptionFeedbackActionRecord = null;


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

  public SDRewardPointsAwardsAndRedemptionFeedbackInputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord getRewardPointsAwardsAndRedemptionFeedbackActionRecord() {
    return rewardPointsAwardsAndRedemptionFeedbackActionRecord;
  }

  public void setRewardPointsAwardsAndRedemptionFeedbackActionRecord(SDRewardPointsAwardsAndRedemptionFeedbackInputModelRewardPointsAwardsAndRedemptionFeedbackActionRecord rewardPointsAwardsAndRedemptionFeedbackActionRecord) {
    this.rewardPointsAwardsAndRedemptionFeedbackActionRecord = rewardPointsAwardsAndRedemptionFeedbackActionRecord;
  }


}

