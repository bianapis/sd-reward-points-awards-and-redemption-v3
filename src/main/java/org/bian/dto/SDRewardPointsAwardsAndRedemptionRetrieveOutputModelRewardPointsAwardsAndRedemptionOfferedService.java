package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord;

import javax.validation.Valid;
  
/**
 * SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedService
 */
public class SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedService   {
  private String rewardPointsAwardsAndRedemptionServiceReference = null;

  private SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord rewardPointsAwardsAndRedemptionServiceRecord = null;


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

  public SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord getRewardPointsAwardsAndRedemptionServiceRecord() {
    return rewardPointsAwardsAndRedemptionServiceRecord;
  }

  public void setRewardPointsAwardsAndRedemptionServiceRecord(SDRewardPointsAwardsAndRedemptionRetrieveOutputModelRewardPointsAwardsAndRedemptionOfferedServiceRewardPointsAwardsAndRedemptionServiceRecord rewardPointsAwardsAndRedemptionServiceRecord) {
    this.rewardPointsAwardsAndRedemptionServiceRecord = rewardPointsAwardsAndRedemptionServiceRecord;
  }


}

