package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedService
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedService   {
  private String rewardPointsAwardsAndRedemptionServiceReference = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord rewardPointsAwardsAndRedemptionServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return rewardPointsAwardsAndRedemptionServiceReference
  **/

  public String getRewardPointsAwardsAndRedemptionServiceReference() {
    return rewardPointsAwardsAndRedemptionServiceReference;
  }

  public void setRewardPointsAwardsAndRedemptionServiceReference(String rewardPointsAwardsAndRedemptionServiceReference) {
    this.rewardPointsAwardsAndRedemptionServiceReference = rewardPointsAwardsAndRedemptionServiceReference;
  }


  /**
   * Get rewardPointsAwardsAndRedemptionServiceRecord
   * @return rewardPointsAwardsAndRedemptionServiceRecord
  **/

  public SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord getRewardPointsAwardsAndRedemptionServiceRecord() {
    return rewardPointsAwardsAndRedemptionServiceRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServiceRecord(SDRewardPointsAwardsAndRedemptionRetrieveInputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord rewardPointsAwardsAndRedemptionServiceRecord) {
    this.rewardPointsAwardsAndRedemptionServiceRecord = rewardPointsAwardsAndRedemptionServiceRecord;
  }


}

